package com.codingblocks;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

//        for (int i = 0; i < 20; i++) {
//            int r = (int)(50 * Math.random());
//            System.out.println("Inserting " + r);
//            tree.insert(r);
//        }

        tree.insert(12);
        tree.insert(15);
        tree.insert(9);
        tree.insert(10);

        tree.display();


    }
}
