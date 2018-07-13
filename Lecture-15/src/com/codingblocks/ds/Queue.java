package com.codingblocks.ds;

public class Queue {

    private int rear = -1;
    private int DEFAULT_SIZE = 5;
    private int[] data = new int[DEFAULT_SIZE];

    public boolean isEmpty(){
        return this.rear == -1;
    }

    public boolean isFull(){
        return this.rear == this.data.length - 1;
    }

    public void insert(int item) throws Exception{
        if (isFull()){
            throw new Exception("Queue is full");
        }

        this.data[++this.rear] = item;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }

        int temp = this.data[0];

        for (int i = 1; i <= rear ; i++) {
            this.data[i-1] = this.data[i];
        }

        rear--;

        return temp;
    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }

        return this.data[0];
    }

}
