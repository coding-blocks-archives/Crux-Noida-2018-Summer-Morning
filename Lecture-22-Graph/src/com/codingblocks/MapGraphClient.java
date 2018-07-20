package com.codingblocks;

public class MapGraphClient {
    public static void main(String[] args) {
        AdjacencyMapGraph<String> graph = new AdjacencyMapGraph<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B", 5);
        graph.addEdge("A", "C", 15);
        graph.addEdge("A", "D", 20);
        graph.addEdge("B", "D", 10);
        graph.addEdge("C", "D", 5);

//        graph.connectedComponents();

        System.out.println(graph.kruskal());

    }
}
