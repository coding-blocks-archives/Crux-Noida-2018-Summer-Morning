package com.codingblocks;

public class Main {

    public static void main(String[] args) {

        Human anuj = new Human(1000);

    }

    public static int pallCount(String line){

        int pal = 0;

        for (int i = 0; i < line.length(); i++) {

            // odd length
            int left = i;
            int right = i;
            while (left >= 0 && right < line.length()){
                if (line.charAt(left) == line.charAt(right)){
                    pal++;
                } else {
                    break;
                }
                left--;
                right++;
            }

            // even length
            left = i;
            right = i + 1;
            while (left >= 0 && right < line.length()){
                if (line.charAt(left) == line.charAt(right)){
                    pal++;
                } else {
                    break;
                }
                left--;
                right++;
            }
        }

        return pal;
    }
}
