package com.cmpiler.Visitors;

import com.cmpiler.Scope.Scope;

public class FunctionVisitor extends SuperVisitor {
    public FunctionVisitor(Scope scope) {
        super(scope);
    }
}
