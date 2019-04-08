package com.cmpiler.Evaluators;

import com.cmpiler.Scope.Scope;
import com.cmpiler.Visitors.SuperVisitor;
import com.cmpiler.grammar.PascaletParser;

public class ProcedureEvaluator extends SuperVisitor {
    public ProcedureEvaluator() {
        super(null);
    }

    public static void evaluate(Scope scope, PascaletParser.CompoundStatementContext statementContext) {
        SuperVisitor visitor = new SuperVisitor(scope);
        visitor.visitCompoundStatement(statementContext);
    }
}
