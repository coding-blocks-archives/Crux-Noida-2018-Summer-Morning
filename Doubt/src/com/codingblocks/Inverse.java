package com.codingblocks;

import java.util.Arrays;
import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        int[] real = new int[n];
        int[] inverse = new int[n];

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            real[i] = val;
        }

        for (int i = 0; i < n; i++) {
            inverse[real[i]] = i;
        }

        System.out.println(Arrays.equals(real, inverse));

    }
}
