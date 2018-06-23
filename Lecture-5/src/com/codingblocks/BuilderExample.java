package com.codingblocks;

public class BuilderExample {
    public static void main(String[] args) {
        String line = "Hello World";


//        StringBuilder builder = new StringBuilder(line);
//
//        builder.append(" World");
//
//        builder.reverse();
//
//        System.out.println(builder.toString());
//
//        System.out.println((char)('H' - 'A' + 'a'));

        System.out.println(incDec(line));
    }

    public static String toggle(String line){
        StringBuilder builder = new StringBuilder(line);

        for (int i = 0; i < builder.length(); i++) {
            char ch = builder.charAt(i);

            if (ch >='A' && ch <= 'Z'){

                ch = (char)(ch - 'A' + 'a');

            } else if(ch >='a' && ch <= 'z'){

                ch = (char)(ch - 'a' + 'A');

            }

            builder.setCharAt(i, ch);


        }

        return builder.toString();
    }

    public static String incDec(String line){
        StringBuilder builder = new StringBuilder(line);

        for (int i = 0; i < builder.length(); i++) {

            char ch = builder.charAt(i);

            if ((ch > 'A' && ch < 'Z') || (ch > 'a' && ch < 'z')) {

                if (i % 2 == 0) {
                    ch = (char) (ch - 1);
                } else {
                    ch = (char) (ch + 1);
                }

                builder.setCharAt(i, ch);
            }

        }

        return builder.toString();
    }
}
