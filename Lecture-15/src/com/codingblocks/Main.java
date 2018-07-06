package com.codingblocks;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here

        LinkedList list = new LinkedList();

        list.insertFirst(20);
        list.insertFirst(40);
        list.insertFirst(10);

        list.insertLast(50);

        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteFirst());
        list.display();
    }
}
