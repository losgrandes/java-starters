package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        SortMethod sort = new BubbleSort(prepareList());
        sort.printList();
        sort.run();
        sort.printList();

        sort = new QuickSort(prepareList());
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
