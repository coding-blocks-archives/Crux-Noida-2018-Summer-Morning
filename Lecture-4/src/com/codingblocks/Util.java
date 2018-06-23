package com.codingblocks;

public class Util {

    public static void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static int max(int[] nums, int start, int end){

        int m = start;

        for (int i = 0; i <= end; i++) {
            if (nums[m] < nums[i]){
                m = i;
            }
        }

        return m;
    }

    public static void display(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
