package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<Apple>();
        apples.add(new Apple("green", 120));
        apples.add(new Apple("green", 180));
        apples.add(new Apple("red", 120));
        apples.add(new Apple("red", 220));

        List<Apple> filteredApples = filterApples(apples, new AppleWeightPredicate());
        System.out.println("After filtering by weight");
        for(Apple apple: filteredApples) {
            System.out.println(apple);
        }
        System.out.println("After filtering by color");
        filteredApples = filterApples(apples, (Apple apple) -> "red".equals(apple.getColor()));
        for(Apple apple: filteredApples) {
            System.out.println(apple);
        }
    }

    public static List<Apple> filterApples(List<Apple> apples, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<Apple>();
        for(Apple apple: apples) {
            if(predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
