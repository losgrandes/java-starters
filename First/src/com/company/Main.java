package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Time t = new Time(0f,30f);
	    System.out.format("The angle is %f\n", t.angle());
        t = new Time(11f,20f);
        System.out.format("The angle is %f\n", t.angle());
        t = new Time(5f,24f);
        System.out.format("The angle is %f\n", t.angle());
        t = new Time(2f,20f);
        System.out.format("The angle is %f\n", t.angle());
        Word w = new Word("testing");
        System.out.format("Do words match: %s\n", w.equals(new Word("gnitset")));
        System.out.format("Do words match: %s\n", w.equals(new Word("testing2")));

        // BinaryTree exercise
        BinaryTree bt = new BinaryTree();
        bt.add(4);
        bt.add(2);
        bt.add(0);
        bt.add(1);
        bt.add(10);
        bt.add(7);
        bt.add(3);
        bt.dump();
        bt.dfs(bt.getRoot(), 5);
        bt.dfs(bt.getRoot(), 7);
        bt.dfs(bt.getRoot(), 3);
        bt.dfs_lowest(bt.getRoot());
        Queue<BTNode> queue = new LinkedList<BTNode>();
        queue.add(bt.getRoot());
        bt.bfs(queue, 7);
    }
}
