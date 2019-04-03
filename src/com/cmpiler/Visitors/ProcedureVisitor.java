package com.cmpiler.Visitors;

import com.cmpiler.Scope.Scope;

public class ProcedureVisitor extends SuperVisitor {
    public ProcedureVisitor(Scope scope) {
        super(scope);
    }
}
