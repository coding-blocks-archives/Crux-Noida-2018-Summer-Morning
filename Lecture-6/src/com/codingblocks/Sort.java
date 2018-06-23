package com.codingblocks;

public class Sort {
    public static void main(String[] args) {
        int[] nums = {12, 45, 23, 78, 67};
    }

    public static void bubble(int[] nums, int end){

        if (end == 1){
            return;
        }

        for (int i = 0; i < end - 1; i++) {
            if (nums[i] > nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }

        bubble(nums, end - 1);
    }
}
