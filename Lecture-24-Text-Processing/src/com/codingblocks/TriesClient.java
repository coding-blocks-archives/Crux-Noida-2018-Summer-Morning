package com.codingblocks;

public class TriesClient {
    public static void main(String[] args) {
        Tries tries = new Tries();

        tries.addWord("Hell");
        tries.addWord("Heck");
        tries.addWord("Hech");

//        System.out.println(tries.find("Hell"));

        tries.printPrefix("Hec");
    }
}
