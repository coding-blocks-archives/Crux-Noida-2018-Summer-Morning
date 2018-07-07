package com.codingblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class Tree {

    private Node root;

    public Tree(){
        // nothing to do here right now
    }

    public void populate(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter root node : ");
        int value = scanner.nextInt();

        root = new Node(value);

        populate(root, scanner);

    }

    public void populate(Node node, Scanner scanner){
        System.out.println("How many children for " + node.value);

        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {

            String temp = String.format("Enter %d th child node of %d : ", i, node.value);
            System.out.println(temp);
            int value = scanner.nextInt();

            Node child = new Node(value);

            node.children.add(child);
            child.parent = node;

            populate(child, scanner);
        }

    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent) {
        System.out.println(indent +  node.value);

        for (int i = 0; i < node.children.size(); i++) {
            display( node.children.get(i), indent + "\t");
        }
    }

    public int count(){
        return count(root);
    }

    private int count(Node node) {

        if (node.children.size() == 0){
            return 1;
        }

        int sum = 1;

        for (int i = 0; i < node.children.size(); i++) {
            sum += count( node.children.get(i));
        }

        return sum;
    }


    private class Node {
        private int value;
        private ArrayList<Node> children;
        private Node parent;

        public Node(int value) {
            this.value = value;
            this.children = new ArrayList<>();
        }

    }
}
