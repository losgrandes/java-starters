package com.company;

import java.util.ArrayList;

public class QuickSort extends SortMethod {

    public QuickSort(ArrayList<Integer> list) {
        super(list);
    }

    public void run() {
        quicksort(this.list, 0 , this.list.size()-1);
    }

    private void quicksort(ArrayList<Integer> list, Integer lo, Integer hi) {
        if(lo < hi) {
            Integer p = partition(list, lo, hi);
            quicksort(list, lo, p);
            quicksort(list, p+1, hi);
        }
    }

    private Integer partition(ArrayList<Integer> list, Integer lo, Integer hi) {
        Integer pivot = list.get(lo);
        Integer i = lo - 1;
        Integer j = hi + 1;
        while(true) {
            do {
                i++;
            } while (list.get(i) < pivot);
            do {
                j--;
            } while (list.get(j) > pivot);
            if(i>=j) {
                return j;
            }
            Integer tmp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, tmp);
        }
    }
}
