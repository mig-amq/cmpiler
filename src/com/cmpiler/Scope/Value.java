package com.cmpiler.Scope;

public class Value {
    public enum Type {
        INT, REAL, STRING, BOOL, NULL, CHAR
    }

    private int valInt = 0;
    private String valString = "";
    private char valChar = '\0';
    private double valDouble = 0.0;
    private boolean valBool = false;
    private Type type = Type.NULL;

    public Value(){}
    public Value(Type type) {
        this.type = type;
    }

    public Object getValue() {
        switch(this.type) {
            case INT:
                return valInt;
            case STRING:
                return valString;
            case REAL:
                return valDouble;
            case BOOL:
                return valBool;
            case CHAR:
                return valChar;
            default:
                return null;
        }
    }

    /**
     * Sets the current Value object type to an integer, and assigning {@code valInt} a value.
     * @param x - the integer value
     * @return the parameter value
     */
    public int setValue (int x) {
        this.valInt = x;
        this.type = Type.INT;
        return x;
    }

    /**
     * Similar to {@link #setValue(int)}, except method handles Strings
     * @param x - the String value
     * @return the parameter value
     */
    public String setValue (String x) {
        this.valString = x;
        this.type = Type.STRING;
        return x;
    }

    /**
     * Similar to {@link #setValue(int)}, except this method handles doubles
     * @param x - the double value
     * @return the parameter value
     */
    public double setValue (double x) {
        this.valDouble = x;
        this.type = Type.REAL;
        return x;
    }

    /**
     * Similar to {@link #setValue(int)}, except this method handles booleans
     * @param x - the boolean value
     * @return the parameter value
     */
    public boolean setValue (boolean x) {
        this.valBool = x;
        this.type = Type.BOOL;
        return x;
    }

    /**
     * Similar to {@link #setValue(int)}, except this method handles booleans
     * @param x - the boolean value
     * @return the parameter value
     */
    public char setValue (char x) {
        this.valChar = x;
        this.type = Type.CHAR;
        return x;
    }

    /**
     * Creates a {@link Value} object, with the proper Type and value based on the parameter
     * given.
     * @param val - the parameter to place in new {@link Value} object
     * @return a Value object
     */
    public static Value of (String val) {
        Value v = new Value(Type.STRING);
        v.setValue(val);
        return v;
    }

    /**
     * Similar to {@link #of(String)}, except for characters
     * @param val - the parameter to place in new {@link Value} object
     * @return a Value object
     */
    public static Value of (char val) {
        Value v = new Value(Type.CHAR);
        v.setValue(val);
        return v;
    }

    /**
     * Similar to {@link #of(String)}, except for doubles
     * @param val - the parameter to place in new {@link Value} object
     * @return a Value object
     */
    public static Value of (double val) {
        Value v = new Value(Type.REAL);
        v.setValue(val);
        return v;
    }

    /**
     * Similar to {@link #of(String)}, except for integers
     * @param val - the parameter to place in new {@link Value} object
     * @return a Value object
     */
    public static Value of (int val) {
        Value v = new Value(Type.INT);
        v.setValue(val);
        return v;
    }

    /**
     * Similar to {@link #of(String)}, except for booleans
     * @param val - the parameter to place in new {@link Value} object
     * @return a Value object
     */
    public static Value of (boolean val) {
        Value v = new Value(Type.BOOL);
        v.setValue(val);
        return v;
    }

    /**
     * Gets the type of this object, see {@link Value.Type}
     * @return the objects {@link Value.Type}
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the type of this object, see {@link Value.Type}
     * @param type - the Value type
     */
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.valueOf(getValue());
    }
}
