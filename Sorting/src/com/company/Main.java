package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = prepareList();
        SortMethod sort = new BubbleSort(list);
        sort.printList();
        sort.run();
        sort.printList();

        list = prepareList();
        sort = new QuickSort(list);
        sort.printList();
        sort.run();
        sort.printList();
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
