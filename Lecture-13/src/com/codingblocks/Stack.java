package com.codingblocks;


public class Stack {

    public static final int DEFUALT_SIZE = 10;

    int[] data;
    int top;

    public Stack(){
        this.data = new int[DEFUALT_SIZE];
        this.top = -1;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public boolean isFull(){
        return this.top == this.data.length - 1;
    }

    public void push(int item) throws Exception{
        if (!this.isFull()){
            this.top++;
            this.data[this.top] = item;
        } else {
            throw new Exception("This is Stack Over Flow. Pushing in full Stack");

        }
    }

    public int pop() throws Exception{
        if (!this.isEmpty()){
            return this.data[this.top--];
        } else {
            throw new Exception("This is Stack Under Flow. Popping from empty Stack");
        }
    }

    public int top(){
        return this.data[this.top];
    }

    public void display(){

    }
}
