package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here

          printInc(5);

//        int i = 100;
//
//        while (true){
//            System.out.println(i--);
//        }

        System.out.println(factorial(10));

        System.out.println(fibo(10));
    }



    public static int factorial(int num) {

        if (num == 0){
            return 1;
        }

        return num * factorial(num - 1);
    }

    public static int fibo(int num){

        if (num == 0 || num == 1){
            return num;
        }

        return fibo(num-1) + fibo(num-2);
    }


    public static void printDec(int n){

        if (n == 0){
            return;
        }

        System.out.println(n);

        printDec(n-1);
    }

    public static void printInc(int n){

        if (n == 0){
            return;
        }

        printInc(n-1);

        System.out.println(n);

        return;
    }

    public static void printDecInc(int n){

        if (n == 0){
            return;
        }

        System.out.println(n);

        printDecInc(n-1);

        System.out.println(n);

        return;
    }
}
