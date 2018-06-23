package com.codingblocks;

public class Examples {
    public static void main(String[] args) {

        printArm();

    }

    public static int lcm(int n, int m){

        int res = 1;
        int c = 2;

        while (m != 1 || n != 1){

            if (n%c == 0 || m % c == 0){
                res = res * c;

                if (n%c == 0){
                    n = n/c;
                }
                if (m%c == 0){
                    m = m/c;
                }

            } else {
                c++;
            }
        }

        return res;
    }

    public static boolean checkArm(int num){
        int copy = num;

        int res = 0;

        while (copy > 0){
            int r = copy % 10;
            copy = copy/10;

            res = res + r*r*r;
        }

        return res == num;
    }

    public static void printArm(){
        int i = 100;

        while (i < 1000){
            if (checkArm(i)){
                System.out.println(i);
            }
            i++;
        }
    }
}
