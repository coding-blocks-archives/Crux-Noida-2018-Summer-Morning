package com.codingblocks.ds;

public class Stack {
    private static int DEFAULT_SIZE = 5;
    private int top;
    protected int[] data;

    public Stack(){
        this.top = -1;
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return this.top == this.data.length - 1;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public void push(int item) throws Exception{
        if (this.isFull()){
            throw new Exception("Stack is full");
        }

        this.data[++this.top] = item;
    }

    public int pop() throws Exception{
        if (this.isEmpty()){
            throw new Exception("Stack is Empty");
        }

        return this.data[this.top--];
    }
}
