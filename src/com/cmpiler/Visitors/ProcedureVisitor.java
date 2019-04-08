package com.cmpiler.Visitors;

import com.cmpiler.Scope.CustomMap;
import com.cmpiler.Scope.Procedure;
import com.cmpiler.Scope.Scope;
import com.cmpiler.Scope.Value;
import com.cmpiler.grammar.PascaletBaseVisitor;
import com.cmpiler.grammar.PascaletParser;

@SuppressWarnings("Duplicates")
public class ProcedureVisitor extends PascaletBaseVisitor<Value> {
    private Scope scope;
    public ProcedureVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Value visitFunctionDeclaration(PascaletParser.FunctionDeclarationContext ctx) {
        return Value.NULL;
    }

    @Override
    public Value visitProcedureDeclaration(PascaletParser.ProcedureDeclarationContext ctx) {
        if (ctx.variable().IDENT() != null) {
            int parameterCount = 0;

            Scope procScope = new Scope(this.scope);

            if (ctx.formalParameterList() != null) // get parameters
                procScope.getVariables().putAll(getFormalParameterList(ctx.formalParameterList()));
            parameterCount = procScope.getVariables().size();

            for (PascaletParser.VarDefBlockContext vdfctxt : ctx.block().varDefBlock()) // get variables
                for(PascaletParser.VarDefContext vdf: vdfctxt.varDef())
                    procScope.getVariables().putAll(getVariables(vdf));

            FunctionVisitor visitor = new FunctionVisitor(procScope);
            ProcedureVisitor visitorP = new ProcedureVisitor(procScope);

            for (PascaletParser.ProcAndFuncDefBlockContext pdfb : ctx.block().procAndFuncDefBlock()) // get inner functions and declarations
                if (pdfb.procAndFuncDef().functionDeclaration() != null)
                    visitor.visitFunctionDeclaration(pdfb.procAndFuncDef().functionDeclaration());
                else
                    visitorP.visitProcedureDeclaration(pdfb.procAndFuncDef().procedureDeclaration());

            this.scope.getProcedures().put(ctx.variable().IDENT().toString(),
                    new Procedure(ctx.variable().IDENT().toString(), procScope, ctx.block().compoundStatement(), parameterCount));
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
