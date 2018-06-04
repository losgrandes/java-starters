package com.company;

import java.util.ArrayList;

public abstract class SortMethod {

    ArrayList<Integer> list;

    public SortMethod(ArrayList<Integer> list) {
        this.list = list;
    }
    public abstract void run();
}
