package com.codingblocks;

public class Main {

    public static void main(String[] args) {

        int five = count5(5364743);

        System.out.println(five);

    }

    public static int count5(int num){

        int count = 0;

        while (num > 0){
            int d = num % 10;
            num = num / 10;
            if (d == 5){
                count++;
            }
        }

        return count;
    }
}
