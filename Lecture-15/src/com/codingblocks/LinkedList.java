package com.codingblocks;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value, head);
        head = node;

        if (tail == null){
            tail = node;
        }

        size++;
    }

    public void insertLast(int value){

        if (tail == null){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

    }



    public void display(){
        Node node = head;

        while (node != null){
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
