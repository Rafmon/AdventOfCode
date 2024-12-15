package de.rafmon.aoc.util;

import java.util.Objects;

public class Pair<K, V> {
    private final K key;
    private final V value;

    private Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair<K, V> of(K key, V value) {
        return new Pair<>(key, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 

        Pair<?, ?> other = (Pair<?, ?>) obj; 
        return Objects.equals(key, other.key) && Objects.equals(value, other.value); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
    
}