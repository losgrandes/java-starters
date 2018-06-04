package com.company;

import java.util.ArrayList;

public class BubbleSort extends SortMethod {

    public BubbleSort(ArrayList<Integer> list) {
        super(list);
    }

    public void run() {
        Boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for(int i=0; i<this.list.size() - 1; i++) {
                if(this.list.get(i) > this.list.get(i+1)) {
                    int tmp = this.list.get(i);
                    this.list.set(i, this.list.get(i+1));
                    this.list.set(i+1, tmp);
                    sorted = false;
                }
            }
            if(sorted) {
                return;
            }
        }
    }
}
