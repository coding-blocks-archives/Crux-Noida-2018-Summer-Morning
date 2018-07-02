package com.codingblocks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            char op = scanner.nextLine().charAt(0);



            if (op == '+'){
                int a = Integer.parseInt(scanner.nextLine().trim());
                int b = Integer.parseInt(scanner.nextLine().trim());
                System.out.println(a+b);
            }

            else if (op == '-') {
                int a = Integer.parseInt(scanner.nextLine().trim());
                int b = Integer.parseInt(scanner.nextLine().trim());
                System.out.println(a-b);
            }

            else if (op == '*'){
                int a = Integer.parseInt(scanner.nextLine().trim());
                int b = Integer.parseInt(scanner.nextLine().trim());
                System.out.println(a*b);
            }
            else if(op == '/') {
                int a = Integer.parseInt(scanner.nextLine().trim());
                int b = Integer.parseInt(scanner.nextLine().trim());
                System.out.println(a/b);
            }
            else if(op == '%') {
                int a = Integer.parseInt(scanner.nextLine().trim());
                int b = Integer.parseInt(scanner.nextLine().trim());
                System.out.println(a%b);
            } else if (op == 'X' || op == 'x'){
                return;
            } else {
                System.out.println("Invalid operation. Try again.");
            }
        }
    }
}
