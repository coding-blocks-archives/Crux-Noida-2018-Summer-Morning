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
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");
        graph.addVertex("I");

        graph.addEdge("A", "D");
        graph.addEdge("A", "B");
        graph.addEdge("D", "E");
        graph.addEdge("E", "B");
        graph.addEdge("E", "H");
        graph.addEdge("B", "C");
        graph.addEdge("C", "F");
        graph.addEdge("H", "I");
        graph.addEdge("H", "G");

        System.out.println(graph.bipartite());;


    }
}
