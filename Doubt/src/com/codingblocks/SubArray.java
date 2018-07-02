package com.codingblocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        ArrayList list = new ArrayList();

        sub(nums, 0, list);


    }

    private static void sub(int[] nums, int index, ArrayList list) {

        if (index == nums.length){
            System.out.println(list);
            return;
        }

        list.add(nums[index]);
        sub(nums, index + 1, list);
        list.remove(list.size()-1);

        sub(nums, index + 1, list);



    }
}
