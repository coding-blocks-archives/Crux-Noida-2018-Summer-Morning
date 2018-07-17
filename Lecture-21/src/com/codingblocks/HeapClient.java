package com.codingblocks;

public class HeapClient {
    public static void main(String[] args) {

        HeapGeneric<Integer> heap = new HeapGeneric<>();

        for (int i = 0; i < 20; i++) {
            int random = (int)(Math.random()*100);
            heap.insert(random);
        }

        while (!heap.isEmpty()){
            System.out.println(heap.minimum());
            heap.remove();
        }
    }

}
