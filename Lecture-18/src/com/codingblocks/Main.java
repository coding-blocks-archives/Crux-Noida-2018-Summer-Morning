package com.codingblocks;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        for (int i = 0; i < 100; i++) {
            tree.insert(i);
        }

//        tree.display();



        tree.display();


    }

}
