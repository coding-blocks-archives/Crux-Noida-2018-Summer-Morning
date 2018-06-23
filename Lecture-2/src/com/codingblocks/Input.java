package com.codingblocks;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {


        // System.in is default input point
        // new is keyword to create new object


        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println(a);
    }
}
