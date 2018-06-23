package com.codingblocks;

public class Main {

    public static void main(String[] args) {

        String s = "Hello Java";

        String data = "Hello Java";

        System.out.println(s == data);

        System.out.println(s.equals(data));

        System.out.println("Hello");

        // System.out.println(data.charAt(0));

//        for (int i = 0; i < data.length(); i++) {
//            System.out.println(data.charAt(i));
//        }
//
//        for (int i = data.length() - 1; i >= 0; i--) {
//            System.out.println(data.charAt(i));
//        }

        System.out.println(data.substring(5));


        for (int i = 0; i <= data.length(); i++) {
            for (int j = i + 1; j <= data.length(); j++) {
                System.out.println(data.substring(i, j));
            }
        }



    }
}
