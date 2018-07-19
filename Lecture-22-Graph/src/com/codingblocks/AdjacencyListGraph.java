package com.codingblocks;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class AdjacencyListGraph<T> {

    private LinkedList<Vertex> vertices;

    public AdjacencyListGraph() {
        this.vertices = new LinkedList<>();
    }

    public void addVertex(T value){
        vertices.add(new Vertex(value));
    }

    public void addEdge(T start, T end){
        Vertex s = get(start);
        Vertex e = get(end);

        if (s != null && e != null){
            s.nbrs.add(e);
            e.nbrs.add(s);
        }
    }

    private Vertex get(T value){
        for (Vertex vertex : vertices) {
            if (vertex.value.equals(value)){
                return vertex;
            }
        }

        return null;
    }

    public void BFS(){
        if (vertices.isEmpty()){
            return;
        }

        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        Vertex vertex = vertices.get(0);

        set.add(vertex);
        queue.add(vertex);

        while (!queue.isEmpty()){
            Vertex v = queue.remove();

            System.out.print(v.value + " ");

            for (Vertex padosi : v.nbrs) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
        }

        System.out.println();

    }

    private class Vertex {
        private T value;

        private LinkedList<Vertex> nbrs;

        public Vertex(T value) {
            this.value = value;
            this.nbrs = new LinkedList<>();
        }
    }
}
