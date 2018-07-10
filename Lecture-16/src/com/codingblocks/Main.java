package com.codingblocks;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.populate();

        // 5 3 1 0 2 0 11 4 10 0 12 0 13 0 14 0

//        tree.display();

//        System.out.println(tree.count());
//
//        System.out.println(tree.height());
//        System.out.println(tree.depth(tree.getRoot()));

//        tree.printDepth(1);

//        System.out.println(tree.degree(tree.getRoot()));

        tree.preOrder();
    }
}
