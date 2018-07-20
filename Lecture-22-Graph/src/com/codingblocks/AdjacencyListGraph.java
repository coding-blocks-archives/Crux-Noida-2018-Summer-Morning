package com.codingblocks;

import java.util.*;

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
            //e.nbrs.add(s);
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

    public void DFS(){
        if (vertices.isEmpty()){
            return;
        }

        Set<Vertex> set = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();

        Vertex vertex = vertices.get(0);

        set.add(vertex);
        stack.add(vertex);

        while (!stack.isEmpty()){
            Vertex v = stack.pop();

            System.out.print(v.value + " ");

            for (Vertex padosi : v.nbrs) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    stack.add(padosi);
                }
            }
        }

        System.out.println();

    }

    public boolean bipartite(){
        if (vertices.isEmpty()){
            return true;
        }

        Set<Vertex> set = new HashSet<>();

        Set<Vertex> red = new HashSet<>();
        Set<Vertex> black = new HashSet<>();

        Stack<Vertex> stack = new Stack<>();

        Vertex vertex = vertices.get(0);
        red.add(vertex);

        set.add(vertex);
        stack.add(vertex);

        while (!stack.isEmpty()){
            Vertex v = stack.pop();

            for (Vertex padosi : v.nbrs) {

                if (red.contains(v) && red.contains(padosi)){
                    return false;
                } else if (red.contains(v)){
                    black.add(padosi);
                }

                if (black.contains(v) && black.contains(padosi)){
                    return false;
                } else if (black.contains(v)){
                    red.add(padosi);
                }

                if (!set.contains(padosi)){
                    set.add(padosi);
                    stack.add(padosi);
                }
            }
        }

        return true;

    }

    public void shortestPath(){
        if (vertices.isEmpty()){
            return;
        }

        int dist = 0;

        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        Vertex vertex = vertices.get(0);

        set.add(vertex);
        queue.add(vertex);
        queue.add(null);

        while (queue.size() > 1){
            Vertex v = queue.remove();

            if (v == null){
                dist++;
                queue.add(null);
                continue;
            }

            System.out.println(v.value + " " + dist);

            for (Vertex padosi : v.nbrs) {
                if (!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
        }

        System.out.println();

    }

    public boolean isCyclic(){
        Map<Vertex, Vertex> parents = new HashMap<>();

        for (Vertex vertex : vertices) {
            parents.put(vertex, null);
        }

        for (Vertex vertex : vertices) {
            for (Vertex padosi : vertex.nbrs) {
                if (find(vertex, parents) == find(padosi, parents)){
                    return true;
                } else {
                    union(vertex, padosi, parents);
                }
            }
        }

        return false;
    }

    private void union(Vertex vertex, Vertex padosi, Map<Vertex, Vertex> parents) {

        parents.put(find(padosi, parents), find(vertex, parents));

    }

    private Vertex find(Vertex vertex, Map<Vertex, Vertex> parents){
        if (parents.get(vertex) == null){
            return vertex;
        }

        return find(parents.get(vertex), parents);
    }

    public void connectedComponents(){
        if (vertices.isEmpty()){
            return;
        }

        Set<Vertex> set = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        for (Vertex vertex : vertices) {

            if (set.contains(vertex)){
                continue;
            }

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
