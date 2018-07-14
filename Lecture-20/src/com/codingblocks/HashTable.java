package com.codingblocks;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashTable <K, V> {

    private static final int DEFAULT_SIZE = 10;

    private int size;

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

        size++;
        bucket.list.add(new Node(key, value));

        if (load() > .75){
            rehash();
        }
    }

    public void remove(K key){
        int location = key.hashCode() % buckets.size();

        Bucket bucket = buckets.get(location);

        for (Node node: bucket.list) {
            if (node.key.equals(key)){
                bucket.list.remove(node);
                return;
            }
        }
    }

    private void rehash() {

        ArrayList<Bucket> prev = buckets;

        buckets = new ArrayList<>();

        for (int i = 0; i < prev.size() * 2; i++) {
            buckets.add(new Bucket());
        }

        size = 0;

        for (Bucket bucket: prev) {
            for (Node node: bucket.list) {
                put(node.key, node.value);
            }
        }

    }



    private float load() {
        return size / (float) buckets.size();
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
