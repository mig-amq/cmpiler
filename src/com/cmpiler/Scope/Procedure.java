package com.cmpiler.Scope;

import com.cmpiler.grammar.PascaletParser;

/**
 * Similar to the {@link Function} class, except a Procedure does not need
 * to return a variable, it only executes functions
 */
public class Procedure {
    private String name;
    private Scope scope;
    private PascaletParser.CompoundStatementContext statementContext;

    /**
     * Procedure constructor
     * @param name - the Procedure name
     * @param scope - the Procedure's scope (Must include the Procedure's variables/parameters)
     * @param context - the Procedure's statement context, e.g. the main body of the procedure,
     *                where instructions are placed.
     */
    public Procedure(String name, Scope scope, PascaletParser.CompoundStatementContext context) {
        this.name = name;
        this.scope = scope;
        this.statementContext = context;
    }

    /**
     * Invokes a procedure, e.g. it executes the instructions inside the Block statementContext
     */
    public void invoke() {
        // Add code here...
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public PascaletParser.CompoundStatementContext getStatementContext() {
        return statementContext;
    }

    public void setStatementContext(PascaletParser.CompoundStatementContext statementContext) {
        this.statementContext = statementContext;
    }
}
