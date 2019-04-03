package com.cmpiler.Visitors;

import com.cmpiler.Scope.Value;
import com.cmpiler.grammar.PascaletBaseVisitor;
import com.cmpiler.grammar.PascaletParser;

public class SuperVisitor extends PascaletBaseVisitor<Value> {

    /**
     * Visits and returns a variable name, in order to retrieve the actual variable name
     * call: the function {@link Value#getValue()} must be parsed into a String
     * @param ctx - the Variable context
     * @return a {@link Value} object that contains the variable name.
     */
    @Override
    public Value visitVariable(PascaletParser.VariableContext ctx) {
        return Value.of(ctx.IDENT().toString());
    }
}
