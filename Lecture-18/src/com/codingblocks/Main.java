package com.codingblocks;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        int[] data = {32,34, 43, 45, 23,67, 25};

        Arrays.sort(data);

//        tree.display();

        tree.populate(data);

        tree.display();


    }

}
