package com.cmpiler.Scope;

import java.util.Map;

public class Scope {
    public static final String[] keywords = new String[]{
        "absolute" , "and" , "array" , "asm" , "begin" , "case" , "const" ,
            "constructor" , "destructor" , "div" , "do" , "downto" , "else" ,
            "end" , "file" , "for" , "function" , "goto" , "if" , "implementation" , "in" ,
            "inherited" , "inline" , "interface" , "label" , "mod" , "nil" , "not" , "object" ,
            "of" , "operator" , "or" , "packed" , "procedure" , "program" , "record" , "reintroduce" ,
            "repeat" , "self" , "set" , "shl" , "shr" , "string" , "then" , "to" , "type" , "unit" , "until" ,
            "uses" , "var" , "while" , "with" , "xor"};

    private CustomMap<String, Value> variables;
    private CustomMap<String, Function> functions;
    private CustomMap<String, Procedure> procedures;

    private Scope parent;

    /**
     * Scope constructor, initializes {@link CustomMap CustomMaps} and assigns a parent to null,
     * if a {@link Scope Scopes} parent is null, it essentially means it is the global Scope
     */
    public Scope() {
        this.variables = new CustomMap<>();
        this.functions = new CustomMap<>();
        this.procedures = new CustomMap<>();

        this.parent = null;
    }

    /**
     * Scope constructor for a child Scope
     * @param parent - the Scope above this one
     */
    public Scope(Scope parent) {
        this();
        this.parent = parent;
    }

    public static Scope copy(Scope c) {
        Scope s = new Scope(c.parent);
        s.getVariables().putAll(c.getVariables());
        s.getFunctions().putAll(c.getFunctions());
        s.getProcedures().putAll(c.getProcedures());

        return s;
    }

    /**
     * Assigns a value to a variable in the Scope or its parents,
     * @exception RuntimeException if the variable does not exist
     * @exception RuntimeException if the variable is being assigned invalid data
     *
     * @param variable - String, the variable name
     * @param x - the value assigned to the variable
     */
    public void assignValue (String variable, String x) {
        Map.Entry<String, Value> var = findVariable(variable);
        if (var != null) {
            if (var.getValue().getType() == Value.Type.STRING)
                var.getValue().setValue(x);
            else if (var.getValue().getType() == Value.Type.REAL && x.contains("."))
                try {
                    var.getValue().setValue(Double.parseDouble(x));
                } catch (Exception e) {
                    throw new RuntimeException("Error Type mismatch");
                }
            else if (var.getValue().getType() == Value.Type.INT)
                try {
                    var.getValue().setValue(Integer.parseInt(x));
                } catch (Exception e) {
                    throw new RuntimeException("Error Type mismatch");
                }
            else if (var.getValue().getType() == Value.Type.BOOL) {
                try {
                    var.getValue().setValue(Boolean.parseBoolean(x));
                } catch (Exception e) {
                    throw new RuntimeException("Error Type mismatch");
                }
            } else
                throw new RuntimeException("Error: Type mismatch");
        } else {
            throw new RuntimeException("Error: Variable was not declared");
        }
    }

    /**
     * Similar to {@link #assignValue(String, String)}, except for integers
     * @param variable - String, the variable name
     * @param x - the value assigned to the variable
     */
    public void assignValue (String variable, int x) {
        Map.Entry<String, Value> var = findVariable(variable);
        if (var != null) {
            if (var.getValue().getType() == Value.Type.INT)
                var.getValue().setValue(x);
            else
                throw new RuntimeException("Error: Type mismatch");
        } else {
            throw new RuntimeException("Error: Variable was not declared");
        }
    }

    public void assignValue (String variable, int index, int x) {
        this.assignValue(variable, index, Value.of(x));
    }

    public void assignValue (String variable, int index, String x) {
        this.assignValue(variable, index, Value.of(x));
    }

    public void assignValue (String variable, int index, char x) {
        this.assignValue(variable, index, Value.of(x));
    }

    public void assignValue (String variable, int index, boolean x) {
        this.assignValue(variable, index, Value.of(x));
    }

    public void assignValue (String variable, int index, double x) {
        this.assignValue(variable, index, Value.of(x));
    }

    public void assignValue (String variable, int index, Value x) {
        Map.Entry<String, Value> var = findVariable(variable);
        if (var != null) {
            if (var.getValue().getType() == Value.Type.ARRAY && var.getValue().asArray().get(0).getType() == x.getType())
                if (index >= var.getValue().getStartIDX() && index <= var.getValue().getEndIDX())
                    var.getValue().asArray().set(index - 1, x);
                else
                    throw new RuntimeException("Error: Index out of bounds");
            else
                throw new RuntimeException("Error: Type mismatch");
        } else {
            throw new RuntimeException("Error: Variable was not declared");
        }
    }

    /**
     * Similar to {@link #assignValue(String, String)}, except for booleans
     * @param variable - String, the variable name
     * @param x - the value assigned to the variable
     */
    public void assignValue (String variable, boolean x) {
        Map.Entry<String, Value> var = findVariable(variable);
        if (var != null) {
            if (var.getValue().getType() == Value.Type.BOOL)
                var.getValue().setValue(x);
            else
                throw new RuntimeException("Error: Type mismatch");
        } else {
            throw new RuntimeException("Error: Variable was not declared");
        }
    }

    /**
     * Similar to {@link #assignValue(String, String)}, except for doubles
     * @param variable - String, the variable name
     * @param x - the value assigned to the variable
     */
    public void assignValue (String variable, double x) {
        Map.Entry<String, Value> var = findVariable(variable);
        if (var != null) {
            if (var.getValue().getType() == Value.Type.REAL)
                var.getValue().setValue(x);
            else
                throw new RuntimeException("Error: Type mismatch");
        } else {
            throw new RuntimeException("Error: Variable was not declared");
        }
    }

    /**
     * Similar to {@link #assignValue(String, String)}, except for characters
     * @param variable - String, the variable name
     * @param x - the value assigned to the variable
     */
    public void assignValue (String variable, char x) {
        Map.Entry<String, Value> var = findVariable(variable);
        if (var != null) {
            if (var.getValue().getType() == Value.Type.CHAR)
                var.getValue().setValue(x);
            else
                throw new RuntimeException("Error: Type mismatch");
        } else {
            throw new RuntimeException("Error: Variable was not declared");
        }
    }

    /**
     * Case-insensitive search for a variable Value within the current Scope or its parent
     * @param variable - String, name of the variable to look for
     * @return a {@link com.cmpiler.Scope.Value Value} object linked to the variable name
     */
    public Map.Entry<String, Value> findVariable (String variable) {
        for (Map.Entry<String, Value> entry : this.variables.entrySet()) { // loop through all current variables in scope
            if (entry.getKey().equalsIgnoreCase(variable)) // if variable name found in scope
                return entry; // return entire Entry mapped to variable name
        }

        if (this.parent != null) // if there variable can't be found in scope, check the parent and return
            return this.parent.findVariable(variable);

        return null;
    }

    /**
     * Similar to {@link #findVariable}, but searches for a function instead
     * @param function - String, the name of the function to look for
     * @return a {@link com.cmpiler.Scope.Function Function} object linked to the function name
     */
    public Map.Entry<String, Function> findFunction (String function) {
        for (Map.Entry<String, Function> entry : this.functions.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(function))
                return entry;
        }

        if (this.parent != null)
            return this.parent.findFunction(function);

        return null;
    }

    /**
     * Similar to {@link #findVariable}, but searches for a function instead
     * @param procedure - String, the name of the procedure to look for
     * @return a {@link com.cmpiler.Scope.Procedure Procedure} object linked to the procedure name
     */
    public Map.Entry<String, Procedure> findProcedure (String procedure) {
        for (Map.Entry<String, Procedure> entry : this.procedures.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(procedure))
                return entry;
        }

        if (this.parent != null)
            return this.parent.findProcedure(procedure);

        return null;
    }

    // Getters and Setters
    public CustomMap<String, Value> getVariables() {
        return variables;
    }

    public void setVariables(CustomMap<String, Value> variables) {
        this.variables = variables;
    }

    public CustomMap<String, Function> getFunctions() {
        return functions;
    }

    public void setFunctions(CustomMap<String, Function> functions) {
        this.functions = functions;
    }

    public CustomMap<String, Procedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(CustomMap<String, Procedure> procedures) {
        this.procedures = procedures;
    }

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public void dumpVariables() {
        for(Map.Entry<String, Value> entry : this.variables.entrySet()) {
            System.out.print(entry.getKey() + " = ");
            switch (entry.getValue().getType()) {
                case INT:
                    System.out.println(entry.getValue().asInt());
                    break;
                case REAL:
                    System.out.println(entry.getValue().asReal());
                    break;
                case BOOL:
                    System.out.println(entry.getValue().asBool());
                    break;
                case STRING:
                case CHAR:
                    System.out.println(entry.getValue().asString());
                    break;
                case ARRAY:
                    for (int i = 0; i < entry.getValue().asArray().size(); i++)
                        System.out.println(entry.getValue().asArray().get(i));
                    break;
                default:
                    System.out.println("NULL");
            }
        }
    }
}
