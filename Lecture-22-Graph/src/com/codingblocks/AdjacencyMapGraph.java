package com.codingblocks;

import java.util.*;

public class AdjacencyMapGraph <T> {

    private HashMap<T, Vertex> vertexMap;

    public AdjacencyMapGraph() {
        vertexMap = new HashMap<>();
    }

    public void addVertex(T value){
        vertexMap.put(value, new Vertex(value));
    }

    public void addEdge(T start, T end, int weight){

        Vertex s = vertexMap.get(start);
        Vertex e = vertexMap.get(end);

        s.nbrs.put(e, weight);
    }

    public void connectedComponents(){

        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        for (Vertex vertex: vertexMap.values()) {
            if (visited.contains(vertex)){
                continue;
            }

            visited.add(vertex);
            queue.add(vertex);

            while (!queue.isEmpty()){
                Vertex v = queue.remove();

                System.out.print(v.value + " ");

                for (Vertex padosi : v.nbrs.keySet()) {
                    if (!visited.contains(padosi)){
                        visited.add(padosi);
                        queue.add(padosi);
                    }
                }
            }

            System.out.println();
        }

    }

    public int kruskal() {

        PriorityQueue<Pair> queue = new PriorityQueue<>();

        Map<Vertex, Vertex> parents = new HashMap<>();

        // setting initial parents to null
        for (Vertex vertex : vertexMap.values()) {
            parents.put(vertex, null);
        }

        // creating all set of pair for each edge
        for (Vertex vertex : vertexMap.values()) {
            for (Map.Entry<Vertex, Integer> entry : vertex.nbrs.entrySet()) {
                Pair p = new Pair(vertex, entry.getKey(), entry.getValue());
                queue.add(p);
            }
        }

        int weight = 0;

        while (!queue.isEmpty()){
            Pair pair = queue.remove();

            if (find(pair.start, parents) != find(pair.end, parents)){
                union(pair.start, pair.end, parents);
                weight += pair.weight;
            }
        }

        return weight;
    }

    private void union(Vertex start, Vertex end, Map<Vertex, Vertex> parents) {

        parents.put(find(start, parents), find(end, parents));
    }

    private Vertex find(Vertex vertex, Map<Vertex, Vertex> parents){
        if (parents.get(vertex) == null){
            return vertex;
        }

        return find(parents.get(vertex), parents);
    }



    private class Vertex {

        private T value;
        private Map<Vertex, Integer> nbrs;

        public Vertex(T value) {
            this.value = value;
            this.nbrs = new HashMap<>();
        }
    }

    private class Pair implements Comparable<Pair>{
        private Vertex start;
        private Vertex end;
        private int weight;

        public Pair(Vertex start, Vertex end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }


        @Override
        public int compareTo(Pair other) {
            return this.weight - other.weight;
        }
    }
}
