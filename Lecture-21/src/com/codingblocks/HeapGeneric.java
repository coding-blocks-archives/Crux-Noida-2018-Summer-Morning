package com.codingblocks;

import java.util.ArrayList;

public class HeapGeneric <T extends Comparable<T>>  {

    ArrayList<T> items = new ArrayList<>();

    public void insert(T data){
        items.add(data);
        int index = items.size() - 1;
        upheap(index);
    }

    private void upheap(int index) {

        if (index == 0) {
            return;
        }

        int parent = parent(index);

        if (items.get(index).compareTo(items.get(parent)) < 0){
            swap(index, parent);
        }

    }

    private void swap(int first, int second) {
        T t = items.get(first);
        items.set(first, items.get(second));
        items.set(second, t);
    }

    private int left(int index){
        return index * 2 + 1;
    }

    private int right(int index){
        return index * 2 + 2;
    }

    private int parent(int index){
        return (index - 1) / 2;
    }
}
