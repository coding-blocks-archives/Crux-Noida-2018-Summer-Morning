package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        for (int i = 0; i < 20; i++) {
            int num = (int)(30 * Math.random());
            tree.insert(num);
        }

        tree.inrange(10, 20);
    }
}
