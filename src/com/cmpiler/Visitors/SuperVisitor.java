package com.cmpiler.Visitors;

import com.cmpiler.Scope.Function;
import com.cmpiler.Scope.Procedure;
import com.cmpiler.Scope.Scope;
import com.cmpiler.Scope.Value;
import com.cmpiler.grammar.PascaletBaseVisitor;
import com.cmpiler.grammar.PascaletParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        return visit(ctx.compoundStatement());
    }

    @Override
    public Value visitCompoundStatement(PascaletParser.CompoundStatementContext ctx) {
        return visit(ctx.statements());
    }

    @Override
    public Value visitStatement(PascaletParser.StatementContext ctx) {
        return visit(ctx.unlabelledStatement());
    }

    @Override
    public Value visitUnlabelledStatement(PascaletParser.UnlabelledStatementContext ctx) {
        if (ctx.simpleStatement() != null)
            return visit(ctx.simpleStatement());
        else
            return visit(ctx.structuredStatement());
    }

    @Override
    public Value visitSimpleStatement(PascaletParser.SimpleStatementContext ctx) {
        if (ctx.assignmentStatement() != null)
            return visit(ctx.assignmentStatement());
        else if (ctx.procedureStatement() != null)
            return visit(ctx.procedureStatement());
        else if (ctx.builtInFuncStatement() != null)
            return visitBuiltInFuncStatement(ctx.builtInFuncStatement());
        else if (ctx.functionDesignator() != null)
            return visit(ctx.functionDesignator());

        return Value.NULL;
    }

    @Override
    public Value visitBuiltInFuncStatement(PascaletParser.BuiltInFuncStatementContext ctx) {
        if (ctx.expression() != null)
            if (ctx.WRITELN() != null)
                System.out.println(visit(ctx.expression()).toString());
            else System.out.print(visit(ctx.expression()).toString());
        else if (ctx.unsignedConstant() != null)
            if (ctx.WRITELN() != null)
                System.out.println(visit(ctx.unsignedConstant()).toString());
            else System.out.print(visit(ctx.unsignedConstant()).toString());
        else if (ctx.variable() != null)
            if (ctx.WRITELN() != null)
                System.out.println(getVariableValue(ctx.variable()).toString());
            else if (ctx.WRITE() != null)
                System.out.print(getVariableValue(ctx.variable()).toString());
            else {
                Scanner sc = new Scanner(System.in);
                String scanned = sc.nextLine();

                if (ctx.variable().constant() != null)
                    try {
                        scope.assignValue(ctx.variable().IDENT().toString(), visit(ctx.variable().constant()).asInt(), Integer.parseInt(scanned));
                    } catch (Exception e) {
                        throw new RuntimeException("Error: Type Mismatch");
                    }
                else
                scope.assignValue(ctx.variable().IDENT().toString(), scanned);
            }

        return Value.NULL;
    }

    @Override
    public Value visitStructuredStatement(PascaletParser.StructuredStatementContext ctx) {
        if (ctx.compoundStatement() != null)
            visitCompoundStatement(ctx.compoundStatement());
        else if (ctx.ifStatement() != null)
            visitIfStatement(ctx.ifStatement());
        else if (ctx.forStatement() != null)
            visitForStatement(ctx.forStatement());

        return Value.NULL;
    }

    @Override
    public Value visitIfStatement(PascaletParser.IfStatementContext ctx) {
        Value val = visitExpression(ctx.expression());

        if (!val.isBool())
            throw new RuntimeException("Error: Incompatible types: got " + val.getType() + " expected BOOL");

        if (val.asBool())
            visitStatement(ctx.statement().get(0));
        else if (ctx.ELSE() != null)
            visitStatement(ctx.statement().get(1));

        return Value.NULL;
    }

    @Override
    public Value visitForStatement(PascaletParser.ForStatementContext ctx) {
        Map.Entry<String, Value> variable = scope.findVariable(visitVariable(ctx.variable()).toString());

        if (variable.getValue().isInt()) {
            Value startVal = visitExpression(ctx.forList().initialValue().expression());
            Value limitVal = visitExpression(ctx.forList().finalValue().expression());

            if (startVal.isInt() && limitVal.isInt()) {
                int start = startVal.asInt();
                int limit = limitVal.asInt();
                scope.assignValue(visitVariable(ctx.variable()).toString(), start);

                if (ctx.forList().DOWNTO() != null) {
                    for (; start >= limit ; start--) {
                        scope.assignValue(visitVariable(ctx.variable()).toString(), start);
                        visitStatement(ctx.statement());
                    }
                } else {
                    for (; start <= limit ; start++) {
                        scope.assignValue(visitVariable(ctx.variable()).toString(), start);
                        visitStatement(ctx.statement());
                    }
                }

                scope.assignValue(visitVariable(ctx.variable()).toString(), start);
            } else
                throw new RuntimeException("Error: Incompatible types: got " + startVal.getType() + " and  " + limitVal.getType() + " expected INT, INT");
        } else {
            throw new RuntimeException("Error: Ordinal expression expected");
        }
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
            } else if (ctx.type().DOUBLE() != null) { // if var is double
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
            Value val = getVariableValue(ctx.variable());

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
            return Value.of(Double.parseDouble(ctx.RNUM().toString()));
    }

    @Override
    public Value visitVariable(PascaletParser.VariableContext ctx) {
        if (ctx.constant() != null)
            return Value.of(ctx.IDENT().toString() + "[" + visit(ctx.constant()).toString() + "]");
        else
            return Value.of(ctx.IDENT().toString());
    }

    @Override
    public Value visitAssignmentStatement(PascaletParser.AssignmentStatementContext ctx) {
        String variable = visit(ctx.variable()).asString();
        String pattern = "([a-zA-Z][a-zA-Z0-9_]*)\\s*\\[([0-9]+)]";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(variable);
        int index = -1;

        if (m.groupCount() == 2 && m.find()) {
            variable = m.group(1);
            index = Integer.parseInt(m.group(2));
        }

        Map.Entry<String, Value> var = scope.findVariable(variable);
        Value expression = visitExpression(ctx.expression());

        if (index != -1 && expression.isInt())
            scope.assignValue(variable, index, expression.asInt());
        else if (index != -1)
            throw new RuntimeException("Error: Type mismatch");

        if (index == -1)
            if (expression.isInt() && var.getValue().isInt())
                scope.assignValue(var.getKey(), expression.asInt());
            else if (expression.isReal() && var.getValue().isReal())
                scope.assignValue(var.getKey(), expression.asReal());
            else if (expression.isBool() && var.getValue().isBool())
                scope.assignValue(var.getKey(), expression.asBool());
            else if (expression.isString() && var.getValue().isString())
                scope.assignValue(var.getKey(), expression.asString().substring(1, expression.asString().length() - 1));
            else if (expression.isChar() && var.getValue().isChar())
                scope.assignValue(var.getKey(), expression.asChar());
            else
                throw new RuntimeException("Error: Type mismatch");

        return var.getValue();
    }

    @Override
    public Value visitExpression(PascaletParser.ExpressionContext ctx) {
        if (ctx.relationaloperator() != null) { // returns true or false
            if (ctx.relationaloperator().GT() != null) { // greater than
                return Value.of(visitSimpleExpression(ctx.simpleExpression()).compare(visitExpression(ctx.expression())) > 0);
            } else if (ctx.relationaloperator().LT() != null) { // less than
                return Value.of(visitSimpleExpression(ctx.simpleExpression()).compare(visitExpression(ctx.expression())) < 0);
            } else if (ctx.relationaloperator().LE() != null) { // less than or equal
                return Value.of(visitSimpleExpression(ctx.simpleExpression()).compare(visitExpression(ctx.expression())) == 0 ||
                        visitSimpleExpression(ctx.simpleExpression()).compare(visitExpression(ctx.expression())) < 0);
            } else if (ctx.relationaloperator().GE() != null) { // greater than or equal
                return Value.of(visitSimpleExpression(ctx.simpleExpression()).compare(visitExpression(ctx.expression())) == 0 ||
                        visitSimpleExpression(ctx.simpleExpression()).compare(visitExpression(ctx.expression())) > 0);
            } else if (ctx.relationaloperator().EQUAL() != null) { // equal
                return Value.of(visitSimpleExpression(ctx.simpleExpression()).compare(visitExpression(ctx.expression())) == 0);
            }
        }

        return visitSimpleExpression(ctx.simpleExpression());
    }

    @Override
    public Value visitSimpleExpression(PascaletParser.SimpleExpressionContext ctx) {
        if (ctx.additiveoperator() != null) {
            if (ctx.additiveoperator().PLUS() != null) {
                return visitTerm(ctx.term()).plus(visitSimpleExpression(ctx.simpleExpression()));
            } else if (ctx.additiveoperator().MINUS() != null) {
                return visitTerm(ctx.term()).minus(visitSimpleExpression(ctx.simpleExpression()));
            } else {
                return visitTerm(ctx.term()).or(visitSimpleExpression(ctx.simpleExpression()));
            }
        }

        return visitTerm(ctx.term());
    }

    @Override
    public Value visitTerm(PascaletParser.TermContext ctx) {
        if (ctx.multiplicativeoperator() != null) {
            if (ctx.multiplicativeoperator().STAR() != null) {
                return visitSignedFactor(ctx.signedFactor()).mult(visitTerm(ctx.term()));
            } else if (ctx.multiplicativeoperator().DIV() != null) {
                return visitSignedFactor(ctx.signedFactor()).div(visitTerm(ctx.term()));
            } else if (ctx.multiplicativeoperator().MOD() != null) {
                return visitSignedFactor(ctx.signedFactor()).mod(visitTerm(ctx.term()));
            } else if (ctx.multiplicativeoperator().AND() != null) {
                return visitSignedFactor(ctx.signedFactor()).and(visitTerm(ctx.term()));
            }
        }

        return visitSignedFactor(ctx.signedFactor());
    }

    @Override
    public Value visitSignedFactor(PascaletParser.SignedFactorContext ctx) {
        Value val = visitFactor(ctx.factor());
        if (ctx.MINUS() != null)
            if (val.isInt())
                return Value.of(val.asInt() * -1);
            else if (val.isReal())
                return Value.of(val.asReal() * -1.0);

        return val;
    }

    @Override
    public Value visitFactor(PascaletParser.FactorContext ctx) {
        if (ctx.variable() != null)
            return getVariableValue(ctx.variable());
        else if (ctx.expression() != null)
            return visitExpression(ctx.expression());
        else if (ctx.functionDesignator() != null)
            return visitFunctionDesignator(ctx.functionDesignator());
        else if (ctx.unsignedConstant() != null)
            return visitUnsignedConstant(ctx.unsignedConstant());
        else if (ctx.NOT() != null) {
            Value value = visitFactor(ctx.factor());
            if (value.isBool())
                return Value.of(!value.asBool());
            else
                throw new RuntimeException("Error: Incompatible types: got " + value.getType() + " expected BOOL");
        }

        return Value.of(Boolean.parseBoolean(ctx.BOOL().toString()));
    }

    @Override
    public Value visitUnsignedConstant(PascaletParser.UnsignedConstantContext ctx) {
        if (ctx.unsignedNumber() != null)
            return visitUnsignedNumber(ctx.unsignedNumber());
        else if (ctx.STR() != null)
            return Value.of(ctx.STR().toString().substring(1, ctx.STR().toString().length() - 1));

        return Value.NULL;
    }

    @Override
    public Value visitFunctionDesignator(PascaletParser.FunctionDesignatorContext ctx) {
        Function function = scope.findFunction(visit(ctx.variable()).toString()).getValue();
        ArrayList<Value> parameterValues = getParameterValues(ctx.parameterList());

        return function.invoke(parameterValues);
    }

    @Override
    public Value visitProcedureStatement(PascaletParser.ProcedureStatementContext ctx) {
        Procedure procedure = scope.findProcedure(visit(ctx.variable()).toString()).getValue();
        ArrayList<Value> parameterValues = getParameterValues(ctx.parameterList());

        procedure.invoke(parameterValues);
        return Value.NULL;
    }

    @Override
    public Value visitActualParameter(PascaletParser.ActualParameterContext ctx) {
        return visitExpression(ctx.expression());
    }

    public ArrayList<Value> getParameterValues(PascaletParser.ParameterListContext ctx) {
        ArrayList<Value> val = new ArrayList<>();
        for(PascaletParser.ActualParameterContext act : ctx.actualParameter()) {
            val.add(visitActualParameter(act));
        }
        return val;
    }

    public Value getVariableValue(PascaletParser.VariableContext ctx) {
        Value val = scope.findVariable(ctx.IDENT().toString()).getValue();

        if (ctx.constant() != null) {
            Value index = visitConstant(ctx.constant());

            if (val.getType() == Value.Type.ARRAY)
                if (index.asInt() >= val.getStartIDX() && index.asInt() <= val.getEndIDX())
                    return Value.of(val.asArray().get(index.asInt() - 1).asInt());
            else
                throw new RuntimeException("Error: '" + ctx.IDENT().toString() + "' is not an array");
        }

        return val;
    }

    public String getIdentifierName(PascaletParser.IdentifierContext ctx) {
        return ctx.IDENT().toString();
    }
}
