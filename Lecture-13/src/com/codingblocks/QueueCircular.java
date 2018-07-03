package com.codingblocks;

public class QueueCircular {

    public static final int DEFUALT_SIZE = 10;

    int[] data;
    int size;
    int start;
    int end;

    public QueueCircular(){
        this.data = new int[DEFUALT_SIZE];
        this.size = 0;
        this.start = 0;
        this.end = 0;
    }

    public boolean isFull(){
        return this.size == this.data.length;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void insert(int item){
        if (!this.isFull()){
            this.data[this.end] = item;
            this.end = (this.end+1) % this.data.length;
            this.size++;
        }
    }

    public int remove() throws Exception{
        if (!this.isEmpty()){
            int temp = this.data[start];
            this.start = (this.start + 1) % this.data.length;
            this.size--;
            return temp;
        } else {
            throw new Exception();
        }
    }

    public int front(){
        return this.data[0];
    }
}
