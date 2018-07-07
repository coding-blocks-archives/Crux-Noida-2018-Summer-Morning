package com.codingblocks;

public class LinkedList {

    public Node head;
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

    public void insert(int value, int index) throws Exception {
        // if you want to add at non existent place
        if (index > size){
            throw new Exception("Index greater than size of list");
        }

        if(index == 0){
            insertFirst(value);
            return;
        }

        if (index == size){
            insertLast(value);
            return;
        }

        // reach one item before index
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }

        Node temp = new Node(value, node.next); // create and point added node to next node
        node.next = temp; // point prev to added node

        size++;

    }

    public int delete(int index) throws Exception{
        if (index >= size){
            throw new Exception("Index not available to delete");
        }

        if (index == 0){
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }

        // reach one item before index
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }

        int temp = node.next.value; // value of item to be deleted
        node.next = node.next.next; // skipping ref of deleted node

        size--;

        return temp;

    }

    public void reverse(Node node){

        if (node == tail){
            head = tail;
            return;
        }

        reverse(node.next);

//        insertLast(node.value);

        tail.next = node;
        tail = node;
        tail.next = null;

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

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
