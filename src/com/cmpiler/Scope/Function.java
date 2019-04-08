package com.cmpiler.Scope;

import com.cmpiler.Evaluators.FunctionEvaluator;
import com.cmpiler.grammar.PascaletParser;

import java.util.ArrayList;
import java.util.Map;

/**
 * When creating a function, their scope should always have an initial variable
 * of the same name, i.e. if the name of the variable is funcName(), there should be
 * a variable called funcName inside {@link Scope#findVariable(String)}; this is because
 * of how Pascal functions return a value.
 */
@SuppressWarnings("Duplicates")
public class Function {
    private String name;
    private Scope scope;
    private int parameterCount;
    private PascaletParser.CompoundStatementContext statementContext;

    /**
     * Function constructor
     * @param name - the Function name
     * @param scope - the Function's scope (Must include the Function's variables/parameters)
     * @param context - the Function's statement context, e.g. the main body of the function,
     * @param parameterCount
     */
    public Function(String name, Scope scope, PascaletParser.CompoundStatementContext context, int parameterCount) {
        this.name = name;
        this.scope = scope;
        this.statementContext = context;
        this.parameterCount = parameterCount;
    }

    /**
     * Invokes a function, e.g. it executes the instructions inside the Block context
     * @return the return value of the function
     */
    public Value invoke(ArrayList<Value> parameterValues) {
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

        FunctionEvaluator.evaluate(scopeCopy, this.statementContext);
        return this.scope.getVariables().get(this.getName());
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

    public void setParameterCount(int parameterCount) {
        this.parameterCount = parameterCount;
    }

    public int getParameterCount() {
        return parameterCount;
    }
}
