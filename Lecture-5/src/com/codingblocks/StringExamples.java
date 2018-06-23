package com.codingblocks;

public class StringExamples {

    public static void main(String[] args) {
        String greet = "aabbaabbccaabb";

        printPallin(greet);

//        greet.concat("World");
//
//        System.out.println(greet);
//
//        greet = greet.concat("World");
//
//        System.out.println(greet);
//
//        System.out.println(greet.indexOf("o", 5));
//
//        System.out.println(greet.startsWith("Hell"));
//
//        System.out.println(greet.startsWith("W", 5));
    }

    public static void printPallin(String line){
        for (int i = 0; i <= line.length(); i++) {
            for (int j = i + 1; j <= line.length(); j++) {
                String temp = line.substring(i, j);
                if (isPallin(temp)){
                    System.out.println(temp);
                }
            }
        }
    }

    public static boolean isPallin(String line){
        int start = 0;
        int end = line.length() - 1;

        while (start < end){
            if (line.charAt(start) != line.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}









