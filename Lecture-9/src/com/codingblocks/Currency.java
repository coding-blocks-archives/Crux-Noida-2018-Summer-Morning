package com.codingblocks;

import java.util.Arrays;

public class Currency {
    public static void main(String[] args) {
        int[] c = {1000, 50, 500, 10, 100, 1, 5};

        int n = 535;

        Arrays.sort(c);

        int num = currency(c, c.length - 1, n);

        System.out.println(num);

//        int notes = 0;
//
//        for (int i = c.length - 1; i >= 0 ; i--) {
//            while (n >= c[i]){
//                notes++;
//                n = n - c[i];
//            }
//        }
    }

    private static int currency(int[] c, int end, int target){

        if (target == 0 || end < 0){
            return 0;
        }

        if (c[end] <= target){
            return 1 + currency(c, end, target - c[end]);
        } else {
            return currency(c, end - 1, target);
        }

    }
}
