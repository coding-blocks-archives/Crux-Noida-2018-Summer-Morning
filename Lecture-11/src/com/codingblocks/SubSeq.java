package com.codingblocks;

public class SubSeq {

    public static void main(String[] args) {

        String first = "ammma";
        String second = "mumma";

        System.out.println(maxSubSeq(first, second, first.length() - 1, second.length() - 1));
    }

    public static int maxSubSeqItr(String first, String second){

        int[][] mem = new int[first.length() + 1][second.length() + 1];

        for (int i = 0; i <= first.length(); i++) {
            for (int j = 0; j <= second.length(); j++) {
                if (i == 0 || j == 0){
                    mem[i][j] = 0;
                } else {
                    if (first.charAt(i-1) == second.charAt(j-1)){
                        mem[i][j] = 1 + mem[i-1][j-1];
                    } else {
                        mem[i][j] = Math.max(mem[i-1][j], mem[i][j-1]);
                    }
                }
            }
        }

        return mem[first.length()][second.length()];

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
