package com.codingblocks;

import java.util.HashMap;
import java.util.Map;

public class Tries {

    private Node root;

    public Tries() {
        this.root = new Node(' ', false);
    }

    public void addWord(String word){
        addWord(word, root);
    }

//    private void addWord(String word, Node node) {
//        char ch = word.charAt(0);
//
//        boolean terminal = word.length() == 1;
//
//        if (!node.children.containsKey(ch)){
//            node.children.put(ch, new Node(ch,terminal));
//        }
//
//        if(!terminal) {
//            addWord(word.substring(1), node.children.get(ch));
//        } else {
//            node.children.get(ch).terminal = true;
//        }
//    }

    private void addWord(String word, Node node) {
        if (word.isEmpty()){
            node.terminal = true;
            return;
        }

        char ch = word.charAt(0);

        if (!node.children.containsKey(ch)){
            Node n = new Node(ch, false);
            node.children.put(ch, n);
        }

        addWord(word.substring(1), node.children.get(ch));
    }

    public boolean find(String word){
        return find(word, root);
    }

    public void printPrefix(String prefix){
        printPrefix(prefix, root, "");
    }

    private void printPrefix(String prefix, Node node, String processed) {
        if (prefix.isEmpty() && node.terminal){
            System.out.println(processed);
        }

        if (prefix.isEmpty()){

            for (Node n : node.children.values()) {
                printPrefix(prefix, n, processed + n.value);
            }

        } else {
            char ch = prefix.charAt(0);
            if (node.children.containsKey(ch)){
                printPrefix(prefix.substring(1), node.children.get(ch), processed + ch);
            }
        }
    }

    private boolean find(String word, Node node) {
        if (word.isEmpty()){
            return node.terminal;
        }

        char ch = word.charAt(0);

        if (node.children.containsKey(ch)){
            return find(word.substring(1), node.children.get(ch));
        }

        return false;
    }

    private class Node {

        private char value;
        private Map<Character, Node> children;
        private boolean terminal;

        public Node(char value, boolean terminal) {
            this.value = value;
            this.terminal = terminal;
            this.children = new HashMap<>();
        }
    }
}
