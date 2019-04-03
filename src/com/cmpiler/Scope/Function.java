package com.cmpiler.Scope;

import com.cmpiler.grammar.PascaletParser;

/**
 * When creating a function, their scope should always have an initial variable
 * of the same name, i.e. if the name of the variable is funcName(), there should be
 * a variable called funcName inside {@link Scope#findVariable(String)}; this is because
 * of how Pascal functions return a value.
 */
public class Function {
    private String name;
    private Scope scope;
    private PascaletParser.CompoundStatementContext statementContext;

    /**
     * Function constructor
     * @param name - the Function name
     * @param scope - the Function's scope (Must include the Function's variables/parameters)
     * @param context - the Function's statement context, e.g. the main body of the function,
     *                where instructions are placed.
     */
    public Function(String name, Scope scope, PascaletParser.CompoundStatementContext context) {
        this.name = name;
        this.scope = scope;
        this.statementContext = context;
    }

    /**
     * Invokes a function, e.g. it executes the instructions inside the Block context
     * @return the return value of the function
     */
    public Value invoke() {
        // Add code here...

        return scope.findVariable(name).getValue();
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
