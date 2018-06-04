package com.company;

import java.io.PrintStream;
import java.util.Queue;

public class BinaryTree {
    private BTNode root;

    public void add(int value) {
        this.root = addRecurrent(this.root, value);
    }

    private BTNode addRecurrent(BTNode node, int value) {
        if(node == null) {
            return new BTNode(value);
        } else if(node.value > value) {
            node.prev = addRecurrent(node.prev, value);
        } else if(node.value < value) {
            node.next = addRecurrent(node.next, value);
        }
        return node;
    }

    private void printValue(BTNode node) {
        if(node != null) {
            System.out.format("Node value %d found\n", node.value);
            if(node.prev != null) {
                System.out.format("Going left from %d\n", node.value);
                this.printValue(node.prev);
            }
            if(node.next != null) {
                System.out.format("Going right from %d\n", node.value);
                this.printValue(node.next);
            }
        }
    }

    public void dump() {
        this.printValue(this.root);
    }
    public void dfs(BTNode node, int value) {
        if(node == null ) {
            return;
        } else if(node.value == value) {
            System.out.format("[DFS] Value %d found\n", value);
        } else {
            System.out.format("[DFS] Searching for %d, but visited value %d\n", value, node.value);
            dfs(node.prev, value);
            dfs(node.next, value);
        }
    }

    public void bfs(Queue<BTNode> queue, int value) {
        if(queue.isEmpty()) {
            return;
        }
        BTNode node = queue.remove();
        if(node.value == value) {
            System.out.format("[BFS] Value %d found\n", value);
        } else {
            System.out.format("[BFS] Searching for %d, but visited value %d\n", value, node.value);
            if(node.prev != null) {
                queue.add(node.prev);
            }
            if(node.next != null) {
                queue.add(node.next);
            }
            this.bfs(queue, value);
        }
    }

    public void dfs_lowest(BTNode node) {
        if(node == null) {
            return;
        } else if (node.prev == null && node.next == null) {
            System.out.format("[DFS_LOWEST] %d\n", node.value);
        }
        else {
            if (node.prev != null) {
                dfs_lowest(node.prev);
            }
            if(node.next != null ) {
                dfs_lowest(node.next);
            }
        }
    }

    public BTNode getRoot(){
        return this.root;
    }
}
