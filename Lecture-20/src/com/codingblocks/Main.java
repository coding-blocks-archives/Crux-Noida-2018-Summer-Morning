package com.codingblocks;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

//        File file = new File("dict.txt");
//        Scanner scanner = new Scanner(file);
//
        Map<String, String> map = new HashMap<>();

        map.put("apple", "A sweet red fruit");
        map.put("lemon", "A sour fruit");

        String res = map.get("apple");

        System.out.println(res);




    }
}
