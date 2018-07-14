package com.codingblocks;

public class TableClient {
    public static void main(String[] args) {
        HashTable<String, String> map = new HashTable<>();

        map.put("apple", "A sweet red fruit");
        map.put("lemon", "A sour fruit");

        String res = map.get("apple");

        System.out.println(res);

        map.remove("apple");

        res = map.get("apple");

        System.out.println(res);
    }
}
