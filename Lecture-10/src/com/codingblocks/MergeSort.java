package com.codingblocks;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] nums = {5, 2, 1, 6, 9, 3};

        sort(nums);

        System.out.println(Arrays.toString(sort(nums)));

    }

    public static int[] sort(int[] nums){

        if (nums.length == 1){
            return nums;
        }

        int[] first  = Arrays.copyOfRange(nums, 0, nums.length/2);
        int[] second = Arrays.copyOfRange(nums, nums.length/2, nums.length);

        first = sort(first);
        second = sort(second);

        return merge(first, second);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];

        int i = 0;      // starting index for first
        int j = 0;      // starting index for second
        int k = 0;      // starting index for merged

        while (i < first.length && j < second.length){
            if (first[i] <= second[j]){
                merged[k] = first[i++];
            } else {
                merged[k] = second[j++];
            }

            k++;
        }

        while (i < first.length){
            merged[k] = first[i++];
            k++;
        }

        while (j < second.length){
            merged[k] = second[j++];
            k++;
        }

        return merged;

    }
}
