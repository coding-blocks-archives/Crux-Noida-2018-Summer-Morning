package com.codingblocks;

public class Queue {

    public static final int DEFUALT_SIZE = 10;

    int[] data;
    int size;

    public Queue(){
        this.data = new int[DEFUALT_SIZE];
        this.size = 0;
    }

    public boolean isFull(){
        return this.size == this.data.length;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void insert(int item){
        if (!this.isFull()){
            this.data[this.size++] = item;
        }
    }

    public int remove() throws Exception{
        if (!this.isEmpty()){
            int temp = this.data[0];
            for (int i = 1; i < size; i++) {
                data[i-1] = data[i];
            }
            size--;
            return temp;
        } else {
            throw new Exception();
        }
    }

    public int front(){
        return this.data[0];
    }
}
