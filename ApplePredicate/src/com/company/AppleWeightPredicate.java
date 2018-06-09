package com.company;

public class AppleWeightPredicate implements ApplePredicate{
    public boolean test(Apple apple) {
        return apple.getGrams() > 150;
    }
}
