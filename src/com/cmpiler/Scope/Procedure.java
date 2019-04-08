package com.cmpiler.Scope;

import com.cmpiler.Evaluators.FunctionEvaluator;
import com.cmpiler.Evaluators.ProcedureEvaluator;
import com.cmpiler.grammar.PascaletParser;

import java.util.ArrayList;
import java.util.Map;

/**
 * Similar to the {@link Function} class, except a Procedure does not need
 * to return a variable, it only executes functions
 */
@SuppressWarnings("Duplicates")
public class Procedure {
    private String name;
    private Scope scope;
    private int parameterCount;
    private PascaletParser.CompoundStatementContext statementContext;

    /**
     * Procedure constructor
     * @param name - the Procedure name
     * @param scope - the Procedure's scope (Must include the Procedure's variables/parameters)
     * @param context - the Procedure's statement context, e.g. the main body of the procedure,
     *                where instructions are placed.
     */
    public Procedure(String name, Scope scope, PascaletParser.CompoundStatementContext context, int parameterCount) {
        this.name = name;
        this.scope = scope;
        this.statementContext = context;
        this.parameterCount = parameterCount;
    }

    /**
     * Invokes a procedure, e.g. it executes the instructions inside the Block statementContext
     */
    public void invoke(ArrayList<Value> parameterValues) {
        Scope scopeCopy = Scope.copy(this.scope);

        if (parameterValues.size() != this.parameterCount)
            throw new RuntimeException("Error: Wrong number of parameters specified for call to \"" + this.name + "\"");

        int i = 0;
        for (Map.Entry<String, Value> parameterList : scopeCopy.getVariables().entrySet()) {
            if (i < parameterCount && !parameterList.getKey().equalsIgnoreCase(this.getName())) {
                if (parameterList.getValue().getType() == parameterValues.get(i).getType()) {
                    parameterList.setValue(Value.copy(parameterValues.get(i)));
                } else
                    throw new RuntimeException("Error: Incompatible types for arg no. " + (i + 1) + ": Got " +
                            parameterValues.get(i).getType() + ", expected " + parameterList.getValue().getType());

                i++;
            }
        }

        ProcedureEvaluator.evaluate(scopeCopy, this.statementContext);
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
