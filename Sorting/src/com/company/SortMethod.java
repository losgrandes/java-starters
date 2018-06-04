package com.company;

import java.io.PrintStream;
import java.util.ArrayList;

import static java.lang.System.out;

public abstract class SortMethod {
    PrintStream stream = new PrintStream(out);
    ArrayList<Integer> list;

    public SortMethod(ArrayList<Integer> list) {
        this.list = list;
    }
    public abstract void run();
    public void printList() {
        stream.format("%s %s\n", getClass().getSimpleName(), this.list);
    }
}
