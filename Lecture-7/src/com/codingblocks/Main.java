package com.codingblocks;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        triangleUp(0, 5);

//        ascii("", "abc");
//        System.out.println(subseqList("", "abc"));

//        System.out.println(numpadList("", "129"));

        System.out.println(diceCount(3));
    }


    public static void triangleUp(int start, int end){
        if (end == 0){
            return;
        }

        if (start == end){

            System.out.println();
            triangleUp(0, end - 1);
            System.out.println();
            return;
        }

        System.out.print("* ");
        triangleUp(start + 1, end);
        System.out.print("* ");
    }

    public static void subseq(String processed, String unprocessed){

        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        subseq(processed, unprocessed);

        subseq(processed + ch, unprocessed);


    }

    public static ArrayList subseqList(String processed, String unprocessed){

        if (unprocessed.isEmpty()){
            ArrayList list = new ArrayList();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        ArrayList l1 = subseqList(processed + ch, unprocessed);

        ArrayList l2 = subseqList(processed, unprocessed);

        ArrayList l3 = new ArrayList();
        l3.addAll(l1);
        l3.addAll(l2);

        return l3;

    }

    public static void ascii(String processed, String unprocessed){

        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        unprocessed = unprocessed.substring(1);

        ascii(processed, unprocessed);

        ascii(processed + ch, unprocessed);

        ascii(processed + (ch+0), unprocessed);

    }


    public static void numpad(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0) - '0';
        unprocessed = unprocessed.substring(1);


        for (int i = 3 * (digit - 1); i < 3 * digit; i++) {

            if (i == 26){
                continue;
            }

            char ch = (char)(i + 'a');
            numpad(processed + ch, unprocessed);
        }
    }

    public static void permutation(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);


        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            permutation(first + ch + second, unprocessed);
        }
    }


    public static ArrayList numpadList(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            ArrayList list = new ArrayList();
            list.add(processed);
            return list;
        }

        int digit = unprocessed.charAt(0) - '0';
        unprocessed = unprocessed.substring(1);


        ArrayList list = new ArrayList();

        for (int i = 3 * (digit - 1); i < 3 * digit; i++) {

            if (i == 26){
                continue;
            }

            char ch = (char)(i + 'a');
            ArrayList temp = numpadList(processed + ch, unprocessed);
            list.addAll(temp);
        }

        return list;
    }

    public static void dice(String processed, int num){
        if (num == 0){
            System.out.println(processed);
            return;
        }

        for (int i = 1; i <= 6 && i <= num; i++) {
            dice(processed + i, num - i);
        }
    }

    public static int diceCount(int num){
        if (num == 0){
            return 1;
        }

        int sum = 0;

        for (int i = 1; i <= 6 && i <= num; i++) {
            sum += diceCount(num - i);
        }

        return sum;
    }
}
