package com.cmpiler.Visitors;

import com.cmpiler.Scope.Scope;
import com.cmpiler.Scope.Value;
import com.cmpiler.grammar.PascaletBaseVisitor;
import com.cmpiler.grammar.PascaletParser;

import java.util.ArrayList;
import java.util.HashMap;

public class SuperVisitor extends PascaletBaseVisitor<Value> {
    protected Scope scope;

    public SuperVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Value visitProgram(PascaletParser.ProgramContext ctx) {
        visit(ctx.block());
        return Value.NULL;
    }

    @Override
    public Value visitBlock(PascaletParser.BlockContext ctx) {
        for (PascaletParser.VarDefBlockContext vdfb : ctx.varDefBlock())
            visitVarDefBlock(vdfb);

//        scope.dumpVariables();
        return Value.NULL;
    }

    @Override
    public Value visitVarDefBlock(PascaletParser.VarDefBlockContext ctx) {
        for (PascaletParser.VarDefContext vdctxt : ctx.varDef())
            scope.getVariables().putAll(getVariables(vdctxt));

        return Value.NULL;
    }

    public HashMap<String, Value> getVariables(PascaletParser.VarDefContext ctx) {
        HashMap<String, Value> map = new HashMap<>();

        for (PascaletParser.IdentifierContext idc : ctx.identifier()) {
            if (ctx.type().BOOLEAN() != null) { // if var is boolean
                map.put(getIdentifierName(idc), new Value(Value.Type.BOOL));
            } else if (ctx.type().REAL() != null) { // if var is double
                map.put(getIdentifierName(idc), new Value(Value.Type.REAL));
            } else if (ctx.type().INTEGER() != null) { // if var is int
                map.put(getIdentifierName(idc), new Value(Value.Type.INT));
            } else if (ctx.type().STRING() != null) { // if var is string
                map.put(getIdentifierName(idc), new Value(Value.Type.STRING));
            } else if (ctx.type().CHARACTER() != null) { // if var is char
                map.put(getIdentifierName(idc), new Value(Value.Type.CHAR));
            } else if (ctx.type().arrayType() != null) {
                map.put(getIdentifierName(idc), getArrayValue(ctx.type().arrayType()));
            }
        }

        return map;
    }

    public Value getArrayValue(PascaletParser.ArrayTypeContext ctx) {
        Value val = new Value(Value.Type.ARRAY);

        val.setValue(new ArrayList<>(), visitConstant(ctx.constant(0)).asInt(), visitConstant(ctx.constant(1)).asInt());
        return val;
    }

    @Override
    public Value visitConstant(PascaletParser.ConstantContext ctx) {
        if (ctx.unsignedNumber() != null) {
            Value val = visitUnsignedNumber(ctx.unsignedNumber());

            if (ctx.MINUS() != null) {
                if (val.getType() == Value.Type.INT)
                    return Value.of(val.asInt() * -1);
                else
                    return Value.of(val.asReal() * -1.0);
            }

            return val;
        } else if (ctx.variable() != null) {
            Value val = visit(ctx.variable());

            if (val.getType() == Value.Type.INT || val.getType() == Value.Type.REAL) {
                if (ctx.MINUS() != null && val.getType() == Value.Type.INT)
                    return Value.of(val.asInt() * -1);
                else if (ctx.MINUS() != null && val.getType() == Value.Type.REAL)
                    return Value.of(val.asReal() * -1.00);
                else
                    return val;
            }

            return val;
        }

        return Value.NULL;
    }

    @Override
    public Value visitUnsignedNumber(PascaletParser.UnsignedNumberContext ctx) {
        if (ctx.INT() != null) {
            return Value.of(Integer.parseInt(ctx.INT().toString()));
        } else
            return Value.of(Double.parseDouble(ctx.REAL_NUM().toString()));
    }

    public String getIdentifierName(PascaletParser.IdentifierContext ctx) {
        return ctx.IDENT().toString();
    }

    @Override
    public Value visitRegularVar(PascaletParser.RegularVarContext ctx) {
        return this.scope.findVariable(ctx.IDENT().toString()).getValue();
    }

    public Value visitArrayVar(PascaletParser.ArrayVarContext ctx) {
        return Value.of(this.scope.findVariable(ctx.IDENT().toString())
        .getValue().asArray().get(visitConstant(ctx.constant()).asInt()));
    }
}
