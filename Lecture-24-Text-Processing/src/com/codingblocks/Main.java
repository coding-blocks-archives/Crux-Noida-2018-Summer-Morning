package com.codingblocks;

public class Main {

    public static void main(String[] args) {

        System.out.println(match("hell oh hello", "hello"));
    }

    public static boolean match(String line, String pattern){

        for (int i = 0; i < line.length(); i++) {
            for (int j = 0; j < pattern.length() &&  i + j < line.length(); j++) {
                if (pattern.charAt(j) != line.charAt(i + j)){
                    break;
                } else if (j == pattern.length() - 1){
                    return true;
                }
            }
        }

        return false;
    }
}
