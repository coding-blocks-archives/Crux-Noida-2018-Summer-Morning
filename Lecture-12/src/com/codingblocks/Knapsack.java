package com.codingblocks;

public class Knapsack {
    public static void main(String[] args) {

    }

    public static int knap(int[] weight, int[] price, int bag, int loc){
        if (bag == 0 || loc == weight.length){
            return 0;
        }

        int keep = 0;

        if (bag >= weight[loc]) {
             keep = price[loc] + knap(weight, price, bag - weight[loc], loc + 1);
        }

        int reject = knap(weight, price, bag, loc+1);

        return Math.max(keep, reject);
    }

    public static int knapDP(int[] weight, int[] price, int bag, int loc, int[][] mem){
        if (bag == 0 || loc == weight.length){
            return 0;
        }

        if (mem[loc][bag] != -1){
            return mem[loc][bag];
        }

        int keep = 0;

        if (bag >= weight[loc]) {
            keep = price[loc] + knap(weight, price, bag - weight[loc], loc + 1);
        }

        int reject = knap(weight, price, bag, loc+1);

        mem[loc][bag] = Math.max(keep, reject);

        return mem[loc][bag];
    }
}
