package com.codingblocks;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here

        LinkedList list = new LinkedList();

        list.insertLast(2);
        list.insertLast(1);
        list.insertLast(5);
        list.insertLast(7);
        list.insertLast(8);
        list.insertLast(6);
        list.insertLast(3);

        list.display();

        list.kReverse(3);

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
