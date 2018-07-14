package com.codingblocks;

public class BinarySearchTree <T extends Comparable> {

    private Node root;

    public void insert(T value){
        root = insert(root, value);
    }

    private Node insert(Node node, T value) {
        if (node == null){
            return new Node(value);
        }

        if (node.value.compareTo(value) > 0){
            node.left = insert(node.left, value);
        }

        if (node.value.compareTo(value) < 0){
            node.right = insert(node.right, value);
        }

        return node;
    }

    public void inorder(){
        inorder(root);
    }

    private void inorder(Node node){
        if (node == null){
            return;
        }

        inorder(node.left);
        System.out.println(node.value);
        inorder(node.right);
    }

    public void inrange(T k1, T k2){
        inrange(root, k1, k2);
    }

    private void inrange(Node node, T k1, T k2){
        if (node == null){
            return;
        }

        inrange(node.left, k1, k2);

        if (node.value.compareTo(k1) > 0 && node.value.compareTo(k2) < 0) {
            System.out.println(node.value);
        }

        inrange(node.right, k1, k2);
    }

//    private T successor(Node node, int target){
//        if (node == null){
//            return null;
//        }
//
//
//        inorder(node.left);
//
//        System.out.println(node.value);
//
//        inorder(node.right);
//    }

    public void display(){
        display(root, "", 0);
    }

    private void display(Node node, String indent, int location) {
        if (node == null){
            return;
        }

        String loc;

        if (location < 0){
            loc = " left";
        } else if (location > 0){
            loc = " right";
        } else {
            loc = " root";
        }

        System.out.println(indent + node.value + loc);

        display(node.left, indent + "\t", -1);
        display(node.right, indent + "\t", 1);
    }

    private class Node {

        private T value;
        private Node left;
        private Node right;

        public Node(T value) {
            this.value = value;
        }
    }
}
