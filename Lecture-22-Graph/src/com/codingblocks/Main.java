package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here

        EdgeListGraph<String> graph = new EdgeListGraph<>();

        graph.addVertex("Mohit");
        graph.addVertex("Mona");

        graph.addEdge("Mohit", "Mona");


    }
}
