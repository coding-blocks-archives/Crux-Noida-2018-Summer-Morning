package com.codingblocks;

public class Board {
    public static void main(String[] args) {

        int n = 4;

        int[] mem = new int[n+1];

        System.out.println(boardDP(n, mem));

    }

    public static int boardDP(int target, int[] mem){
        if (target == 0){
            return 1;
        }

        if (mem[target] != 0){
            return mem[target];
        }

        int sum = 0;

        for (int i = 1; i <= 3 && i <= target; i++) {
            sum += boardDP(target-i, mem);
        }

        mem[target] = sum;

        return sum;
    }

    public static int board(int target){
        if (target == 0){
            return 1;
        }

        int sum = 0;

        for (int i = 1; i <= 6 && i <= target; i++) {
            sum += board(target-i);
        }

        return sum;
    }
}
