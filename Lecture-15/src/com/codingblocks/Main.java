package com.codingblocks;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here

        LinkedList list = new LinkedList();

        list.insertFirst(20);
        list.insertFirst(40);
        list.insertFirst(10);

        list.insert(60, 0);
        list.insert(90, 4);

        list.display();

        list.insert(30, 2);

        list.display();

        list.reverseItr();

        list.display();

//        list.insertLast(50);
//
//        list.display();
//
//        System.out.println(list.deleteFirst());
//        list.display();
//
//        System.out.println(list.deleteFirst());
//        list.display();
//
//        System.out.println(list.deleteFirst());
//        list.display();
    }
}
