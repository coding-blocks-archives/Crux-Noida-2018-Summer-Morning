package com.codingblocks;

public class Examples {
    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 4, 2};

        //System.out.println(binarySearchIndex(nums, 544));

        insertion(nums);

        Util.display(nums);

//        Util.display(nums);
//
//        Util.swap(nums, 3, 4);
//
//        System.out.println("---------------");
//
//        Util.display(nums);
//
//        System.out.println(linearSearch(nums, 345));
//
//        System.out.println(linearSearchIndex(nums, 345));
    }

    public static boolean linearSearch(int[] nums, int value){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value){
                return true;
            }
        }

        return false;
    }

    public static int linearSearchIndex(int[] nums, int value){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value){
                return i;
            }
        }

        return -1;
    }

    public static int binarySearchIndex(int[] nums, int value){
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = (left + right)/2;

            if (nums[mid] == value){
                return mid;
            }

            else {
                if (nums[mid] < value){
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void bubble(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]){
                    Util.swap(nums, j, j+1);
                }
            }
        }
    }

    public static void selection(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            int maxIndex = Util.max(nums, 0, nums.length - i - 1);
            Util.swap(nums, maxIndex, nums.length - i - 1);
        }
    }

    public static void insertion(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums [j - 1]){
                    Util.swap(nums, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
