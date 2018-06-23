package com.codingblocks;

import java.util.ArrayList;

public class ArrayRec {
    public static void main(String[] args) {
        int[] nums = {12, 23, 34, 12, 45, 56, 12};

         boolean b = sorted(nums, 0);

         ArrayList l = findIndexAll(nums, 0, 12);

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }

    public static boolean sorted(int[] nums, int start) {

        if (start == nums.length - 1){
            return true;
        }

        return nums[start] <= nums[start+1] &&
                sorted(nums, start + 1);
    }

    public static boolean find(int[] nums, int start, int item){

        if (start == nums.length){
            return false;
        }

        return nums[start] == item || find(nums, start+1, item);
    }

    public static int findIndex(int[] nums, int start, int item){

        if (start == nums.length){
            return -1;
        }

        if (nums[start] == item){
            return start;
        }

        return findIndex(nums, start+1, item);
    }

    public static ArrayList findIndexAll(int[] nums, int start, int item){

        if (start == nums.length){
            return new ArrayList();
        }

        ArrayList list = findIndexAll(nums, start+1, item);

        if (nums[start] == item){
            list.add(start);
        }

        return list;

    }

    public static int findIndexLast(int[] nums, int last, int item){

        if (last == -1){
            return -1;
        }

        if (nums[last] == item){
            return last;
        }

        return findIndexLast(nums, last - 1, item);
    }
}
