package com.cmpiler.Scope;

import java.util.HashMap;

public class CustomMap<K, V> extends HashMap<K, V> {
    @Override
    public V put(K key, V value) {
        for (String s : Scope.keywords)
            if (s.equalsIgnoreCase(key.toString()))
                throw new RuntimeException("Error: identifier is a keyword");

        for (K s : this.keySet())
            if (s.toString().equalsIgnoreCase(key.toString()))
                throw new RuntimeException("Error: Duplicate identifier \"" + key.toString() + "\"");

        return super.put(key, value);
    }
}
