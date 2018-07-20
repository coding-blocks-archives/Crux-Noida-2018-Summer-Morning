package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here

        AdjacencyListGraph<String> graph = new AdjacencyListGraph<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge("A", "B");
        graph.addEdge("C", "D");
        graph.addEdge("A", "C");
        graph.addEdge("D", "B");


        System.out.println(graph.isCyclic());


    }
}
