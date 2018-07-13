package com.codingblocks;

public class BinarySearchTreeGeneric <T extends Comparable> {

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

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        if (balance(node) > 1 && balance(node.left) > 0){
            return rightRotate(node);
        }
        else if (balance(node) < -1 && balance(node.right) < 0){
            return leftRotate(node);
        }
        else if (balance(node) > 1 && balance(node.left) < 0){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        } else if (balance(node) < -1 && balance(node.right) > 0){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;

    }

    private int balance(Node node){
        if (node == null){
            return 0;
        }

        return height(node.left) - height(node.right);
    }

    public int height(Node node){
        if ( node == null){
            return 0;
        }

        return node.height;
    }

    public Node rightRotate(Node node){

        // before swap
        Node x = node;
        Node y = node.left;
        Node t2 = y.right;

        // after swap
        y.right = x;
        x.left = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public Node leftRotate(Node node){

        // before swap
        Node y = node;
        Node x = y.right;
        Node t2 = x.left;

        // after swap
        x.left = y;
        y.right = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null){
            return;
        }

        System.out.println(indent + node.value);

        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }


    private class Node {
        private T value;
        private Node left;
        private Node right;

        private int height;


        public Node(T value) {
            this.value = value;

            height = 1;
        }
    }
}
