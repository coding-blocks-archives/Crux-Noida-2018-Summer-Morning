package com.codingblocks;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Huffman {

    // maintain frequency
    private Map<Character, Integer> frequency;

    // maintain encodings
    private Map<Character, String> encoding;

    public Huffman(){
        this.frequency = new HashMap<>();
        this.encoding = new HashMap<>();
    }


    // populate frequncy of each char in map
    public void populate(String line){
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if(frequency.containsKey(ch)){
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }
    }

    public void generate(){
        PriorityQueue<Node> queue = new PriorityQueue<>();

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            queue.add(new Node(entry.getKey(), entry.getValue()));
        }

        while (queue.size() > 1){
            Node first = queue.remove();
            Node second = queue.remove();

            Node node  = new Node(first, second, first.freq + second.freq);
            queue.add(node);
        }

        Node root = queue.remove();

        createEncode(root, "");
    }

    private void createEncode(Node node, String processed) {

        if (node.value != null){
            encoding.put(node.value, processed);
            return;
        }

        createEncode(node.left, processed + "0");
        createEncode(node.right, processed + "1");
    }

    public void print(){
        for (Map.Entry<Character, String> entry : encoding.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() );
        }
    }

    private class Node implements Comparable<Node> {
        private Character value;

        private Node left;
        private Node right;

        private int freq;

        public Node(Character value, int freq) {
            this.value = value;
            this.freq = freq;
        }

        public Node(Node left, Node right, int freq) {
            this.left = left;
            this.right = right;
            this.freq = freq;
        }

        @Override
        public int compareTo(Node other) {
            return this.freq - other.freq;
        }
    }

    public static void main(String[] args) {
        Huffman huffman = new Huffman();

        huffman.populate("aaaaabbbbbbccc");

        huffman.generate();

        huffman.print();
    }
}
