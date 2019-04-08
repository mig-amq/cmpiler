package com.cmpiler.Scope;

import java.util.ArrayList;

public class Value {
    public enum Type {
        INT, REAL, STRING, BOOL, NULL, CHAR, ARRAY
    }

    public String name = "";
    public int valInt = 0;
    public String valString = "";
    public char valChar = '\0';
    public double valDouble = 0.0;
    public boolean valBool = false;
    public boolean constant = false;
    public ArrayList<Value> valArray = new ArrayList<>();
    public int startIDX = 0, endIDX = 0;
    private Type type = Type.NULL;

    public final static Value NULL = new Value(Type.NULL);

    public Value(){}
    public Value(Type type) {
        this.type = type;
    }
    public Value(Value v) {
        switch(v.type) {
            case INT:
                this.setValue(v.valInt);
                break;
            case STRING:
                this.setValue(v.valString);
                break;
            case REAL:
                this.setValue(v.valDouble);
                break;
            case BOOL:
                this.setValue(v.valBool);
                break;
            case CHAR:
                this.setValue(v.valChar);
                break;
            case ARRAY:
                this.setValue(v.valArray, v.type, v.startIDX, v.endIDX);
                break;
            default:
                this.setType(Type.NULL);
        }
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
     * @param x - the array value
     * @return the parameter value
     */
    public ArrayList<Value> setValue (ArrayList<Value> x, Type type, int startIDX, int endIDX) {
        if (startIDX >= 1 && endIDX >= startIDX) {
            this.valArray = x;
            this.type = Type.ARRAY;
            this.startIDX = startIDX;
            this.endIDX = endIDX;

            for (int i = startIDX; i <= endIDX; i++)
                if (type == Type.INT)
                    this.valArray.add(Value.of(0));
                else if (type == Type.STRING)
                    this.valArray.add(Value.of(""));
                else if (type == Type.CHAR)
                    this.valArray.add(Value.of(' '));
                else if (type == Type.BOOL)
                    this.valArray.add(Value.of(false));
                else if (type == Type.REAL)
                    this.valArray.add(Value.of(0.0));

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
    public static Value of (ArrayList<Value> val, int startIDX, int endIDX) {
        Value v = new Value(Type.BOOL);
        v.setValue(val, val.get(0).type, startIDX, endIDX);
        return v;
    }

    /**
     * Returns the Value object as an integer
     * @exception RuntimeException if the variable cannot be converted into the requested data type
     * @return the requested value
     */
    public int asInt() {
        if (type == Type.INT)
            return valInt;
        else if (type == Type.REAL)
            return (int) valDouble;

        throw new RuntimeException("Error: Type invalid");
    }

    /**
     * Similar to {@link #asInt()}, except for Strings
     * @exception RuntimeException if the variable cannot be converted into the requested data type
     * @return the requested value
     */
    public String asString() {
        if (type == Type.STRING)
            return valString;
        else if (type == Type.CHAR)
            return String.valueOf(valChar);

        throw new RuntimeException("Error: Type invalid");
    }

    /**
     * Similar to {@link #asInt()}, except for doubles
     * @exception RuntimeException if the variable cannot be converted into the requested data type
     * @return the requested value
     */
    public double asReal() {
        if (type == Type.REAL)
            return valDouble;
        else if (type == Type.INT)
            return valInt;

        throw new RuntimeException("Error: Type invalid");
    }

    /**
     * Similar to {@link #asInt()}, except for booleans
     * @exception RuntimeException if the variable cannot be converted into the requested data type
     * @return the requested value
     */
    public boolean asBool() {
        if (type == Type.BOOL)
            return valBool;

        throw new RuntimeException("Error: Type invalid");
    }

    /**
     * Similar to {@link #asInt()}, except for arrays
     * @exception RuntimeException if the variable cannot be converted into the requested data type
     * @return the requested value
     */
    public ArrayList<Value> asArray() {
        if (type == Type.ARRAY)
            return valArray;

        throw new RuntimeException("Error: Type invalid");
    }

    /**
     * Similar to {@link #asInt()}, except for characters
     * @exception RuntimeException if the variable cannot be converted into the requested data type
     * @return the requested value
     */
    public char asChar() {
        if (type == Type.CHAR)
            return valChar;

        throw new RuntimeException("Error: Type invalid");
    }

    /**
     * Checks if this Value object is an integer
     * @return a boolean value
     */
    public boolean isInt() { return this.type == Type.INT; }

    /**
     * Checks if this Value object is a double/real
     * @return a boolean value
     */
    public boolean isReal() { return this.type == Type.REAL; }

    /**
     * Checks if this Value object is a number
     * @return a boolean value
     */
    public boolean isNumeric() { return this.isInt() || this.isReal(); }

    /**
     * Checks if this Value object is a string
     * @return a boolean value
     */
    public boolean isString() { return this.type == Type.STRING; }

    /**
     * Checks if this Value object is a character
     * @return a boolean value
     */
    public boolean isChar() { return this.type == Type.CHAR; }

    /**
     * Checks if this Value object is an easily printable object
     * @return a boolean value
     */
    public boolean isPrint() { return !this.isArray(); }

    /**
     * Checks if this Value object is an array
     * @return a boolean value
     */
    public boolean isArray() { return this.type == Type.ARRAY; }

    /**
     * Checks if this Value object is null
     * @return a boolean value
     */
    public boolean isNull() { return this.type == Type.NULL; }

    /**
     * Checks if this Value object is a boolean
     * @return a boolean value
     */
    public boolean isBool() { return this.type == Type.BOOL; }

    /**
     * Compares two Value objects with each other
     * @param v - the Value object that will be compared to
     * @return  0 - the two Value objects are equal in type and data
     *          > 0 - the second Value object is lesser than the current one
     *          < 0 - the second Value object is greater than the current one
     */
    public int compare(Value v) {
        if (v.isInt() && this.isInt()) {
            return this.asInt() - v.asInt();
        } else if (v.isString() && this.isString()) {
            return this.asString().compareTo(v.asString());
        } else if (v.isReal() && this.isReal()) {
            return (int) (this.asReal() - v.asReal());
        } else if (v.isChar() && this.isChar()) {
            return this.asChar() - v.asChar();
        } else if (v.isBool() && this.isBool()) {
            return (v.isBool() == this.isBool()) ? 0 : 1;
        } else if (v.isArray() && this.isArray()) {
            if (this.asArray().size() > v.asArray().size())
                return 1;
            else if (this.asArray().size() < v.asArray().size())
                return -1;
            else {
                for (int i = 0; i < this.asArray().size(); i++)
                    if (this.asArray().get(i) != v.asArray().get(i)) return 1;

                return 0;
            }
        }

        throw new RuntimeException("Error: Incompatible types: got " + v.getType() + " expected " + this.getType());
    }

    /**
     * Performs addition between the current instance and the parameters
     * @exception RuntimeException - if the either of the objects are incapable of being added
     * @param v the Value object that will be modded to this instance
     * @return a Value that contains an integer or real
     */
    public Value plus (Value v) {
        if (this.isReal() && v.isInt()) {
            return Value.of((this.asReal() + v.asReal()));
        } else if (this.isInt() && v.isReal()) {
            return Value.of((double) this.asInt() + v.asReal());
        } else if (this.isReal() && v.isReal()) {
            return Value.of(this.asReal() + v.asReal());
        } else if (this.isInt() && v.isInt()) {
            return Value.of(this.asInt() + v.asInt());
        } else if (this.isString() || this.isChar()) {
            return Value.of(this.asString() + v.toString());
        } else if (v.isString() || v.isChar()) {
            return Value.of(this.toString() + v.asString());
        }

        throw new RuntimeException("Error: Operator is not overloaded: " + this.getType() + " + " + v.getType());
    }

    /**
     * Performs subtraction between the current instance and the parameters
     * @exception RuntimeException - if the either of the objects are incapable of being subtracted
     * @param v the Value object that will be modded to this instance
     * @return a Value that contains an integer or real
     */
    public Value minus (Value v) {
        if (this.isReal() && v.isInt()) {
            return Value.of((this.asReal() - v.asReal()));
        } else if (this.isInt() && v.isReal()) {
            return Value.of(this.asInt() - v.asReal());
        } else if (this.isReal() && v.isReal()) {
            return Value.of(this.asReal() - v.asReal());
        } else if (this.isInt() && v.isInt()) {
            return Value.of(this.asInt() - v.asInt());
        }

        throw new RuntimeException("Error: Operator is not overloaded: " + this.getType() + " + " + v.getType());
    }

    /**
     * Performs logical OR between the current instance and the parameter
     * @exception RuntimeException - if the either of the objects are incapable of being or-ed
     * @param v - the Value object that will be or-ed to this instance
     * @return a Value that contains a boolean
     */
    public Value or (Value v) {
        if (this.isBool() && v.isBool()) {
            return Value.of(this.asBool() || v.asBool());
        }

        throw new RuntimeException("Error: Operator is not overloaded: " + this.getType() + " + " + v.getType());
    }

    /**
     * Performs multiplication between the current instance and the parameters
     * @exception RuntimeException - if the either of the objects are incapable of being multiplied
     * @param v the Value object that will be modded to this instance
     * @return a Value that contains an integer or real
     */
    public Value mult (Value v) {
        if (this.isReal() && v.isInt()) {
            return Value.of((this.asReal() * v.asReal()));
        } else if (this.isInt() && v.isReal()) {
            return Value.of(this.asInt() * v.asReal());
        } else if (this.isReal() && v.isReal()) {
            return Value.of(this.asReal() * v.asReal());
        } else if (this.isInt() && v.isInt()) {
            return Value.of(this.asInt() * v.asInt());
        }

        throw new RuntimeException("Error: Operator is not overloaded: " + this.getType() + " + " + v.getType());
    }

    /**
     * Performs division between the current instance and the parameters
     * @exception RuntimeException - if the either of the objects are incapable of being divided or if the parameter contains
     * the integer value 0
     * @param v the Value object that will be modded to this instance
     * @return a Value that contains an integer or real
     */
    public Value div (Value v) {
        if (v.isInt() && v.asInt() == 0)
            throw new RuntimeException("Error: Division by zero occurred.");

        if (this.isReal() && v.isInt()) {
            return Value.of((this.asReal() / v.asReal()));
        } else if (this.isInt() && v.isReal()) {
            return Value.of(this.asInt() / v.asReal());
        } else if (this.isReal() && v.isReal()) {
            return Value.of(this.asReal() / v.asReal());
        } else if (this.isInt() && v.isInt()) {
            return Value.of(this.asInt() / v.asInt());
        }

        throw new RuntimeException("Error: Operator is not overloaded: " + this.getType() + " + " + v.getType());
    }

    /**
     * Performs modulo between the current instance and the parameters
     * @exception RuntimeException - if the either of the objects are incapable of being moded or if the parameter contains
     * the integer value 0
     * @param v the Value object that will be modded to this instance
     * @return a Value that contains an integer or real
     */
    public Value mod (Value v) {
        if (v.isInt() && v.asInt() == 0)
            throw new RuntimeException("Error: Division by zero occurred.");

        if (this.isInt() && v.isInt()) {
            return Value.of(this.asReal() % v.asReal());
        }

        throw new RuntimeException("Error: Operator is not overloaded: " + this.getType() + " + " + v.getType());
    }

    /**
     * Performs logical AND between the current instance and the parameter
     * @exception RuntimeException - if the either of the objects are incapable of being anded
     * @param v - the Value object that will be anded to this instance
     * @return a Value that contains a boolean
     */
    public Value and (Value v) {
        if (this.isBool() && v.isBool()) {
            return Value.of(this.asBool() && v.asBool());
        }

        throw new RuntimeException("Error: Operator is not overloaded: " + this.getType() + " + " + v.getType());
    }

    /**
     * Creates and returns new instance of the Value from the parameter
     * @param v - the Value object to copy
     * @return a new Value object with the same attribute values as the parameter
     */
    public static Value copy(Value v) {
        return new Value(v);
    }


    public static Value abs(Value val) {
        if (val.isReal())
            return Value.of(Math.abs(val.asReal()));
        else if (val.isInt())
            return Value.of(Math.abs(val.asInt()));

        throw new RuntimeException("Error: Operator is not overloaded: abs(" + val.getType() + ")");
    }

    public static Value arctan(Value val) {
        if (val.isReal())
            return Value.of(Math.atan(val.asReal()));
        else if (val.isInt())
            return Value.of(Math.atan(val.asInt()));

        throw new RuntimeException("Error: Operator is not overloaded: arctan(" + val.getType() + ")");
    }

    public static Value cos(Value val) {
        if (val.isReal())
            return Value.of(Math.cos(val.asReal()));
        else if (val.isInt())
            return Value.of(Math.cos(val.asInt()));

        throw new RuntimeException("Error: Operator is not overloaded: cos(" + val.getType() + ")");
    }

    public static Value exp(Value val) {
        if (val.isReal())
            return Value.of(Math.exp(val.asReal()));
        else if (val.isInt())
            return Value.of(Math.exp(val.asInt()));

        throw new RuntimeException("Error: Operator is not overloaded: exp(" + val.getType() + ")");
    }

    public static Value ln(Value val) {
        if (val.isReal())
            return Value.of(Math.log(val.asReal()));
        else if (val.isInt())
            return Value.of(Math.log(val.asInt()));

        throw new RuntimeException("Error: Operator is not overloaded: ln(" + val.getType() + ")");
    }

    public static Value round(Value val) {
        if (val.isReal())
            return Value.of(Math.round(val.asReal()));

        throw new RuntimeException("Error: Operator is not overloaded: round(" + val.getType() + ")");
    }

    public static Value sin(Value val) {
        if (val.isReal())
            return Value.of(Math.sin(val.asReal()));
        else if (val.isInt())
            return Value.of(Math.sin(val.asInt()));

        throw new RuntimeException("Error: Operator is not overloaded: sin(" + val.getType() + ")");
    }

    public static Value sqr(Value val) {
        if (val.isReal())
            return Value.of(Math.pow(val.asReal(), 2));
        else if (val.isInt())
            return Value.of((int) Math.pow(val.asInt(), 2));

        throw new RuntimeException("Error: Operator is not overloaded: sqr(" + val.getType() + ")");
    }

    public static Value sqrt(Value val) {
        if (val.isReal())
            return Value.of(Math.sqrt(val.asReal()));
        else if (val.isInt())
            return Value.of(Math.sqrt(val.asInt()));

        throw new RuntimeException("Error: Operator is not overloaded: sqrt(" + val.getType() + ")");
    }

    public static Value trunc(Value val) {
        if (val.isReal())
            return Value.of((int) val.asReal());
        else if (val.isInt())
            return val;

        throw new RuntimeException("Error: Operator is not overloaded: trunc(" + val.getType() + ")");
    }

    public static Value chr(Value val) {
        if (val.isInt())
            return Value.of((char) val.asInt());

        throw new RuntimeException("Error: Operator is not overloaded: chr(" + val.getType() + ")");
    }

    public static Value ord(Value val) {
        if (val.isChar())
            return Value.of((int) val.asChar());
        else if (val.isInt())
            return val;

        throw new RuntimeException("Error: Operator is not overloaded: ord(" + val.getType() + ")");
    }

    public static Value pred(Value val) {
        if (val.isChar())
            return Value.of((char) (val.asChar() - 1));
        else if (val.isInt())
            return val.minus(Value.of(1));

        throw new RuntimeException("Error: Operator is not overloaded: pred(" + val.getType() + ")");
    }

    public static Value succ(Value val) {
        if (val.isChar())
            return Value.of((char) (val.asChar() + 1));
        else if (val.isInt())
            return val.plus(Value.of(1));

        throw new RuntimeException("Error: Operator is not overloaded: succ(" + val.getType() + ")");
    }

    public void setValue(Value value) {
        this.name = value.name;
        this.valInt = value.valInt;
        this.valString = value.valString;
        this.valChar = value.valChar;
        this.valDouble = value.valDouble;
        this.valBool = value.valBool;
        this.startIDX = value.startIDX;
        this.endIDX = value.endIDX;
        this.valArray = value.valArray;
        this.type = value.type;
    }

    // Getters and Setters

    public boolean isConstant() {
        return constant;
    }

    public void setConstant(boolean constant) {
        this.constant = constant;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getStartIDX() {
        return startIDX;
    }

    public void setStartIDX(int startIDX) {
        this.startIDX = startIDX;
    }

    public int getEndIDX() {
        return endIDX;
    }

    public void setEndIDX(int endIDX) {
        this.endIDX = endIDX;
    }

    @Override
    public String toString() {
        return String.valueOf(getValue());
    }
}
