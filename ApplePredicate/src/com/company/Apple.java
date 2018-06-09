package com.company;

public class Apple {
    public Apple(String color, int grams) {
        this.color = color;
        this.grams = grams;
    }

    public String getColor() {
        return color;
    }

    public int getGrams() {
        return grams;
    }

    public String toString() {
        return "Color: "+getColor()+", Grams: "+getGrams();
    }

    private final String color;
    private final int grams;
}
