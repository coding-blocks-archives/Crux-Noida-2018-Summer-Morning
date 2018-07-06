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

    public int deleteFirst() throws Exception{
        if (size == 0){
            throw new Exception("Empty Linked list");
        }

        int temp = head.value;
        head = head.next;

        if (head == null){
            tail = null;
        }

        size--;

        return temp;

    }

    public int deleteLast() throws Exception{
        if (size <= 1){
            return deleteFirst();
        }

        Node node = head;

        // reached second last item
        while (node.next != tail){
            node = node.next;
        }

        // value of item to return
        int temp = tail.value;

        // remove last item
        tail = node;
        tail.next = null;

        size--;

        return temp;
    }


    public void display(){
        Node node = head;

        while (node != null){
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
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
