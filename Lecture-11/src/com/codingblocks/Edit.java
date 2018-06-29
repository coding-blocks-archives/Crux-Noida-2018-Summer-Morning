package com.codingblocks;

public class Edit {


    public static int editItr(String first, String second){

        int[][] mem = new int[first.length() + 1][second.length() + 1];

        for (int i = 0; i <= first.length(); i++) {
            for (int j = 0; j <= second.length(); j++) {
                if (i == 0){
                    mem[i][j] = j;
                } else if (j == 0){
                    mem[i][j] = i;
                } else {
                    if (first.charAt(i-1) == second.charAt(j-1)){
                        mem[i][j] = mem[i-1][j-1];
                    } else {
                        int minimum = Math.min(Math.min(mem[i-1][j], mem[i][j-1]), mem[i-1][j-1]);
                        mem[i][j] = minimum + 1;
                    }
                }
            }
        }

        return mem[first.length()][second.length()];

    }

    public static int edit(String first, String second, int f, int s){

        if (f == 0){
            return s;
        }

        if (s == 0){
            return f;
        }

        if (first.charAt(f-1) == second.charAt(s-1)){
            return edit(first, second, f-1, s-1);
        } else {

            int insert = edit(first, second, f-1, s);
            int delete = edit(first, second, f, s-1);
            int replace = edit(first, second, f-1, s-1);

            int minimum = Math.min(Math.min(insert, delete), replace);

            return minimum + 1;

        }


    }
}
