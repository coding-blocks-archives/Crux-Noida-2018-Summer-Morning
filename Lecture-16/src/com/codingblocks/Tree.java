package com.codingblocks;

import java.util.*;

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

    private void preorder(Node node) {
        System.out.print(node.value + " ");

        for (int i = 0; i < node.children.size(); i++) {
            preorder( node.children.get(i));
        }
    }

    private void postorder(Node node) {

        for (int i = 0; i < node.children.size(); i++) {
            postorder( node.children.get(i));
        }


        System.out.print(node.value + " ");
    }

    public void levelOrder(){
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){
            Node node = queue.remove();
            System.out.println(node.value);

            for (int i = 0; i < node.children.size(); i++) {
                queue.add(node.children.get(i));
            }
        }

    }

    public void preOrder(){
        Stack<Node> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()){
            Node node = stack.pop();

            System.out.println(node.value);

            for (int i = node.children.size() - 1; i >= 0; i--) {
                stack.add(node.children.get(i));
            }
        }

    }

    public void printDepth(int depth){
        printDepth(root, 0, depth);
    }

    private void printDepth(Node node, int dep, int target) {
        if (dep == target) {
            System.out.println(node.value);
            return;
        }

        for (int i = 0; i < node.children.size(); i++) {
            printDepth( node.children.get(i), dep + 1, target);
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

    public int height(){
        return depth(root) + 1;
    }

    public int depth(Node node) {

        if (node.children.size() == 0){
            return 0;
        }

        int max = 0;

        for (int i = 0; i < node.children.size(); i++) {
            int dep = depth( node.children.get(i));
            if (max < dep){
                max = dep;
            }
        }

        return max + 1;
    }

    public int degree(Node node) {

        if (node.children.size() == 0){
            return 0;
        }

        int max = node.children.size();

        for (int i = 0; i < node.children.size(); i++) {
            int deg = degree( node.children.get(i));
            if (max < deg){
                max = deg;
            }
        }

        return max;
    }

    public int maxSum(Node node) {

        if (node.children.size() == 0){
            return node.value;
        }

        int max = node.value;

        for (int i = 0; i < node.children.size(); i++) {
            max += node.children.get(i).value;
        }

        for (int i = 0; i < node.children.size(); i++) {
            int deg = maxSum( node.children.get(i));
            if (max < deg){
                max = deg;
            }
        }

        return max;
    }

    public Node getRoot() {
        return root;
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
