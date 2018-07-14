package com.codingblocks;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainCopy {

    public static void main(String[] args) throws Exception{

        File file = new File("dict.txt");
        Scanner scanner = new Scanner(file);

        Map<String, String> map = new HashMap<>();

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] temp = line.split(":");
            map.put(temp[0].trim(), temp[1].trim());
        }

        String res = map.get("apple");

        System.out.println(res);




    }
}
