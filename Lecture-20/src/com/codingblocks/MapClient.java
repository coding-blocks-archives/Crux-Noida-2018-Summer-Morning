package com.codingblocks;

public class MapClient {
    public static void main(String[] args) {
        MapUsingLinkedList<String, String> map = new MapUsingLinkedList<>();

        map.put("apple", "A sweet red fruit");
        map.put("lemon", "A sour fruit");

        String res = map.get("apple");

        System.out.println(res);
    }
}
