package com.codingblocks;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public void populate(String line){
        Scanner scanner = new Scanner(line);

        System.out.println("Enter root value");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(root, scanner);
    }

    private void populate(Node node, Scanner scanner) {
        System.out.println("Want to add left value?");
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter left value of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            node.left.parent = node;
        }

        System.out.println("Want to add right value?");
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter right value of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            node.right.parent = node;
        }
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        private Node parent;

        public Node(int value) {
            this.value = value;
        }
    }


}
