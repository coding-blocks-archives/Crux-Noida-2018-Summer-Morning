package com.codingblocks;

import java.util.HashMap;
import java.util.Map;

public class Examples {
    public static void main(String[] args) {
//        intersection();
        System.out.println(removeDuplicate("hello buddy"));
    }

    public static String removeDuplicate(String first){

        Map<Character, Integer> map = new HashMap<>();

        StringBuilder builder = new StringBuilder();

        for (char key : first.toCharArray()) {
            if (! map.containsKey(key)) {
                builder.append(key);
                map.put(key, 1);
            }
        }

        return builder.toString();
    }

    public static void intersection(){

        String first = "hello buddy";

        String second = "good bud";

        Map<Character, Integer> map = new HashMap<>();

        for (char key : first.toCharArray()) {
            if (map.containsKey(key)){
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        for (char key : second.toCharArray()) {
            if (map.containsKey(key)){
               if (map.get(key) > 1){
                   System.out.print(key);
                   map.put(key, map.get(key) - 1);
               } else {
                   System.out.print(key);
                   map.remove(key);
               }
            }
        }
    }
}
