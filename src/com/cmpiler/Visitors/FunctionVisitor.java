package com.cmpiler.Visitors;

import com.cmpiler.Scope.CustomMap;
import com.cmpiler.Scope.Function;
import com.cmpiler.Scope.Scope;
import com.cmpiler.Scope.Value;
import com.cmpiler.grammar.PascaletBaseVisitor;
import com.cmpiler.grammar.PascaletParser;

@SuppressWarnings("Duplicates")
public class FunctionVisitor extends PascaletBaseVisitor<Value>{

    private Scope scope;
    public FunctionVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Value visitProcedureDeclaration(PascaletParser.ProcedureDeclarationContext ctx) {
        return Value.NULL;
    }

    @Override
    public Value visitFunctionDeclaration(PascaletParser.FunctionDeclarationContext ctx) {
        Value v = new Value();
        if(ctx.identifier().IDENT() != null) {
            int parameterCount = 0;

            if (ctx.resultType().type().CHARACTER() != null)
                v.setType(Value.Type.CHAR);
            else if (ctx.resultType().type().STRING() != null)
                v.setType(Value.Type.STRING);
            else if (ctx.resultType().type().INTEGER() != null)
                v.setType(Value.Type.INT);
            else if (ctx.resultType().type().BOOLEAN() != null)
                v.setType(Value.Type.BOOL);
            else if (ctx.resultType().type().DOUBLE() != null)
                v.setType(Value.Type.REAL);
            else if (ctx.resultType().type().arrayType() != null) {
                v.setType(Value.Type.ARRAY);
                v.setStartIDX(visitConstant(ctx.resultType().type().arrayType().constant().get(0)).asInt());
                v.setEndIDX(visitConstant(ctx.resultType().type().arrayType().constant().get(1)).asInt());
            }

            Scope funcScope = new Scope(this.scope);

            if (ctx.formalParameterList() != null) // get parameters
                funcScope.getVariables().putAll(getFormalParameterList(ctx.formalParameterList()));
            parameterCount = funcScope.getVariables().size();

            for (PascaletParser.VarDefBlockContext vdfctxt : ctx.block().varDefBlock()) // get variables
                for(PascaletParser.VarDefContext vdf: vdfctxt.varDef())
                    funcScope.getVariables().putAll(getVariables(vdf));

            funcScope.getVariables().put(ctx.identifier().IDENT().toString(), v); // get return variable

            FunctionVisitor visitor = new FunctionVisitor(funcScope);
            ProcedureVisitor visitorP = new ProcedureVisitor(funcScope);

            for (PascaletParser.ProcAndFuncDefBlockContext pdfb : ctx.block().procAndFuncDefBlock()) // get inner functions and declarations
                if (pdfb.procAndFuncDef().functionDeclaration() != null)
                    visitor.visitFunctionDeclaration(pdfb.procAndFuncDef().functionDeclaration());
                else
                    visitorP.visitProcedureDeclaration(pdfb.procAndFuncDef().procedureDeclaration());

            this.scope.getFunctions().put(ctx.identifier().IDENT().toString(),
                    new Function(ctx.identifier().IDENT().toString(), funcScope, ctx.block().compoundStatement(), parameterCount));
        } else {
            System.out.println("\u001B[31m" + "Syntax Error, \"identifier\" expected." + "\u001B[0m");
        }

        return Value.NULL;
    }

    public CustomMap<String, Value> getFormalParameterList(PascaletParser.FormalParameterListContext ctx) {
        CustomMap<String, Value> map = new CustomMap<>();

        for (PascaletParser.ParameterGroupContext pgc : ctx.parameterGroup()) {
            for (PascaletParser.IdentifierContext idc : pgc.identifier()) {
                if (pgc.type().BOOLEAN() != null) { // if var is boolean
                    map.put(idc.IDENT().toString(), new Value(Value.Type.BOOL));
                } else if (pgc.type().DOUBLE() != null) { // if var is double
                    map.put(idc.IDENT().toString(), new Value(Value.Type.REAL));
                } else if (pgc.type().INTEGER() != null) { // if var is int
                    map.put(idc.IDENT().toString(), new Value(Value.Type.INT));
                } else if (pgc.type().STRING() != null) { // if var is string
                    map.put(idc.IDENT().toString(), new Value(Value.Type.STRING));
                } else if (pgc.type().CHARACTER() != null) { // if var is char
                    map.put(idc.IDENT().toString(), new Value(Value.Type.CHAR));
                }
            }
        }

        return map;
    }

    public CustomMap<String, Value> getVariables(PascaletParser.VarDefContext ctx) {
        CustomMap<String, Value> map = new CustomMap<>();

        for (PascaletParser.IdentifierContext idc : ctx.identifier()) {
            if (ctx.type().BOOLEAN() != null) { // if var is boolean
                map.put(idc.IDENT().toString(), new Value(Value.Type.BOOL));
            } else if (ctx.type().DOUBLE() != null) { // if var is double
                map.put(idc.IDENT().toString(), new Value(Value.Type.REAL));
            } else if (ctx.type().INTEGER() != null) { // if var is int
                map.put(idc.IDENT().toString(), new Value(Value.Type.INT));
            } else if (ctx.type().STRING() != null) { // if var is string
                map.put(idc.IDENT().toString(), new Value(Value.Type.STRING));
            } else if (ctx.type().CHARACTER() != null) { // if var is char
                map.put(idc.IDENT().toString(), new Value(Value.Type.CHAR));
            }
        }

        return map;
    }
}
