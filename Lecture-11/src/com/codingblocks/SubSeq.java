package com.codingblocks;

public class SubSeq {

    public static void main(String[] args) {

        String first = "amma";
        String second = "mumma";

        System.out.println(maxSubSeq(first, second, first.length() - 1, second.length() - 1));
    }

    public static int maxSubSeq(String first, String second, int f, int s){

        if (f < 0 || s < 0){
            return 0;
        }

        if (first.charAt(f) == second.charAt(s)){
            return 1 + maxSubSeq(first, second, f-1, s-1);
        } else {
            return Math.max(maxSubSeq(first, second, f-1, s),
                    maxSubSeq(first, second, f, s-1));
        }

    }
}
