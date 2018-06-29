package com.codingblocks;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 10;

        int[] mem = new int[n + 1];
        Arrays.fill(mem, -1);

        fiboDP(n, mem);
    }

    private static int fiboItr(int num, int[] mem) {

        mem[0] = 0;
        mem[1] = 1;

        for (int i = 2; i <= num; i++) {
            mem[i] = mem[i-1] + mem[i-2];
        }

        return mem[num];
    }

    private static int fiboDP(int num, int[] mem) {
        if (num <= 1){
            return num;
        }

        if (mem[num] != -1){
            return mem[num];
        }

        mem[num] = fiboDP(num - 1, mem) + fiboDP(num - 2, mem);

        return mem[num];
    }

    public static int fibo(int num){
        if (num <= 1){
            return num;
        }

        return fibo(num - 1) + fibo(num - 2);
    }
}
