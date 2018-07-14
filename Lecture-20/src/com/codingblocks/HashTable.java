package com.codingblocks;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable <K, V> {

    private static final int DEFAULT_SIZE = 10;

    private ArrayList<Bucket> buckets;

    public HashTable(){
        buckets = new ArrayList<>();
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            buckets.add(new Bucket());
        }
    }

    public V get(K key){
        int location = key.hashCode() % buckets.size();

        Bucket bucket = buckets.get(location);

        for (Node node: bucket.list) {
            if (node.key.equals(key)){
                return node.value;
            }
        }

        return null;
    }

    public void put(K key, V value){
        int location = key.hashCode() % buckets.size();

        Bucket bucket = buckets.get(location);

        for (Node node: bucket.list) {
            if (node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        bucket.list.add(new Node(key, value));
    }

    private class Bucket {
        private LinkedList<Node> list = new LinkedList<>();
    }

    private class Node {
        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
