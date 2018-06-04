package com.company;

import java.util.ArrayList;
import java.io.PrintStream;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        PrintStream stream = new PrintStream(out);

        ArrayList<Integer> list = prepareList();
        SortMethod sort = new BubbleSort(list);
        stream.println("Bubblesort");
        stream.format(list.toString());
        sort.run();
        stream.format(list.toString());
        stream.println("");

        list = prepareList();
        sort = new QuickSort(list);
        stream.println("Quicksort");
        stream.format(list.toString());
        sort.run();
        stream.format(list.toString());
        stream.println("");
    }

    private static ArrayList<Integer> prepareList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(0);
        return list;
    }
}
