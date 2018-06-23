package com.codingblocks;

public class TWOD {

    public static void main(String[] args) {

        int[][] nums = {
                {34, 546, 34},
                {546, 345, 64},
                {324, 567, 45, 546}
        };


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
