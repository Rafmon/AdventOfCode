package de.rafmon.aoc.util.Vector;

import java.util.Objects;

public class Vector2Int {
    public int x, y;

    public Vector2Int(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector2Int add(Vector2Int v) {
        return new Vector2Int(this.x + v.x, this.y + v.y);
    }

    public Vector2Int subtract(Vector2Int v) {
        return new Vector2Int(this.x - v.x, this.y - v.y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 
        Vector2Int vector = (Vector2Int) obj; 
        return x == vector.x && y == vector.y; 
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y); 
    }

}