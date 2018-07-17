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
            upheap(parent);
        }
    }

    public T minimum(){
        return items.get(0);
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public void remove(){
        T data = items.remove(items.size() - 1);
        if (!isEmpty()){
            items.set(0, data);
            downheap(0);
        }
    }

    private void downheap(int ci) {
        int left = left(ci);
        int right = right(ci);

        int min = ci;

        if (left < items.size() && items.get(left).compareTo(items.get(min)) < 0){
            min = left;
        }

        if (right < items.size() && items.get(right).compareTo(items.get(min)) < 0){
            min = right;
        }

        if (ci != min){
            swap(ci, min);
            downheap(min);
        }


    }

    private void swap(int first, int second) {
        T temp = items.get(first);
        items.set(first, items.get(second));
        items.set(second, temp);
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
