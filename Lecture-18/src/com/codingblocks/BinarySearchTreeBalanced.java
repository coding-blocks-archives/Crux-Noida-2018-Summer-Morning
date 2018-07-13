package com.codingblocks;

public class BinarySearchTreeBalanced {

    private Node root;

    private void insertRoot(int value) {
        this.root = new Node(value);
    }

    public void insert(int value) {
        if (root == null) {
            insertRoot(value);
            return;
        }

        root = insert(value, root);

    }

    private Node insert(int value, Node node) {

        if (node == null) {
            return new Node(value);
        }

        if (node.value > value) {
            node.left = insert(value, node.left);
        }

        if (node.value < value) {
            node.right = insert(value, node.right);
        }


        node.height = 1 + Math.max(height(node.left),
                height(node.right));


        if (balance(node) > 1 && balance(node.right) > 0) {
            return leftRotate(node);
        } else if (balance(node) < -1 && balance(node.right) > 0) {
            return rightRotate(node);
        } else if (balance(node) < -1 && balance(node.right) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        } else if (balance(node) > 1 && balance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        } else {
            return node;
        }

    }

    public Node rightRotate(Node y) {

        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    public Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        //  Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    private int balance(Node node) {
        if (node == null) {
            return 0;
        }

        return height(node.right) - height(node.left);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }

        return node.height;
    }

    public boolean isBST(){
        return isBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private boolean isBST(Node node, int max, int min){
        if (node == null){
            return true;
        }

        if (node.value >= max || node.value <= min){
            return false;
        }

        return isBST(node.left, node.value, min) && isBST(node.right, max, node.value);
    }


    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.value);

        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }


    private class Node {
        private int value;
        private Node left;
        private Node right;

        private int height;

        public Node(int value) {
            this.value = value;

            this.height = 1;

        }
    }
}
