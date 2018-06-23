package com.codingblocks;

public class Main {

    public static void main(String[] bittu) {
	// write your code here

        int[] nums = new int[10];

        int[] numbers = {1, 2, 4, 7, 11};

        System.out.println(numbers[3]);

        numbers[3] = numbers[2] + 1;

        System.out.println(numbers.length);

        System.out.println(nums.length);

        System.out.println("-----------");


        int i = 0;

        while (i < numbers.length){
            System.out.println(numbers[i]);
            i++;
        }

    }
}
