package com.cmpiler.Scope;

import java.util.ArrayList;

public class Value {
    public enum Type {
        INT, REAL, STRING, BOOL, NULL, CHAR, ARRAY
    }

    private int valInt = 0;
    private String valString = "";
    private char valChar = '\0';
    private double valDouble = 0.0;
    private boolean valBool = false;
    private ArrayList<Integer> valArray = new ArrayList<>();
    private int startIDX = 0, endIDX = 0;
    private Type type = Type.NULL;

    public final static Value NULL = new Value(Type.NULL);

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
            case ARRAY:
                return valArray;
            default:
                return null;
        }
    }

    public int getArrayValue (int index) {
        if (this.type == Type.ARRAY) {
            if (index >= startIDX && index <= startIDX) {
                return valArray.get(index);
            } else {
                throw new RuntimeException("Error: Invalid array index");
            }
        }

        throw new RuntimeException("Error: Variable is not an array");
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
     * Similar to {@link #setValue(int)}, except this method handles arrays
     * @param x - the boolean value
     * @return the parameter value
     */
    public ArrayList<Integer> setValue (ArrayList<Integer> x, int startIDX, int endIDX) {
        if (startIDX >= 1 && endIDX >= startIDX) {
            this.valArray = x;
            this.type = Type.ARRAY;
            this.startIDX = startIDX;
            this.endIDX = endIDX;

            for (int i = startIDX; i <= endIDX; i++)
                this.valArray.add(0);

            return this.valArray;
        }

        throw new RuntimeException("Error: Start and end index must be greater than 1");
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
     * Similar to {@link #of(String)}, except for arrays
     * @param val - the parameter to place in new {@link Value} object
     * @return a Value object
     */
    public static Value of (ArrayList<Integer> val, int startIDX, int endIDX) {
        Value v = new Value(Type.BOOL);
        v.setValue(val, startIDX, endIDX);
        return v;
    }

    public static Value of (Type type, String str) {
        try {
            switch (type) {
                case INT:
                    return Value.of(Integer.parseInt(str));
                case REAL:
                    return Value.of(Double.parseDouble(str));
                case BOOL:
                    return Value.of(Boolean.parseBoolean(str));
                default:
                    return Value.of(str);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error: Value invalid");
        } finally {
            return Value.NULL;
        }
    }

    public int asInt() {
        if (type == Type.INT)
            return valInt;
        else if (type == Type.REAL)
            return (int) valDouble;

        throw new RuntimeException("Error: Type invalid");
    }

    public String asString() {
        if (type == Type.STRING)
            return valString;
        else if (type == Type.CHAR)
            return String.valueOf(valChar);

        throw new RuntimeException("Error: Type invalid");
    }

    public double asReal() {
        if (type == Type.REAL)
            return valDouble;
        else if (type == Type.INT)
            return valInt;

        throw new RuntimeException("Error: Type invalid");
    }

    public boolean asBool() {
        if (type == Type.BOOL)
            return valBool;

        throw new RuntimeException("Error: Type invalid");
    }

    public ArrayList<Integer> asArray() {
        if (type == Type.ARRAY)
            return valArray;

        throw new RuntimeException("Error: Type invalid");
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
