package com.codingblocks;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

//        String[] temp =  scanner.nextLine().trim().split(" ");

        int res = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            res = res ^ x;
        }

        System.out.println(res);
    }
}
