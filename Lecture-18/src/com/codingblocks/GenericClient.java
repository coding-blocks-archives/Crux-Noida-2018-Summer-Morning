package com.codingblocks;

public class GenericClient {
    public static void main(String[] args) {
        BinarySearchTreeGeneric<Integer> tree = new BinarySearchTreeGeneric<>();

        for (int i = 0; i < 100000; i++) {
            tree.insert(i);
        }
//        tree.display();

//        BinarySearchTreeGeneric<String> tree = new BinarySearchTreeGeneric<>();
//
//        tree.insert("sdfdgfh");
//        tree.insert("dgfhg");
//        tree.insert("fdgh");
//        tree.insert("DGFh");
//        tree.insert("rthfg");
//        tree.insert("hdsgfj");
//
//        tree.display();

//        BinarySearchTreeGeneric<Human> tree = new BinarySearchTreeGeneric<>();
//
//        tree.insert(new Human("Anuj", 24));
//        tree.insert(new Human("Mohan", 20));
//        tree.insert(new Human("Krish", 25));
//
//        tree.display();

    }
}
