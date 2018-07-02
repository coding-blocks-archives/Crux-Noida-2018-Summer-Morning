package com.codingblocks;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine().trim());

        while (t-- > 0){
            int n = Integer.parseInt(scanner.nextLine().trim());

            String[] temp = scanner.nextLine().trim().split(" ");

            Arrays.sort(temp);

            for (int i = temp.length - 1; i >=0 ; i--) {
                System.out.print(temp[i]);
            }
            System.out.println();
        }



    }
}
