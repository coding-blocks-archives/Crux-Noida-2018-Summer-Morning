package com.codingblocks.ds;

public class Stack {

    private int top;
    private int DEFAULT_SIZE = 5;
    protected int[] data;

    public Stack(){
        this.top = -1;
        this.data = new int[DEFAULT_SIZE];
    }


    public Stack(int size){
        this.top = -1;
        this.data = new int[size];
    }

    public boolean isFull(){
        return this.top == this.data.length - 1;
    }

    public boolean isEmpty(){
        return this.top ==  - 1;
    }

    public void push(int item) throws Exception{


        if (isFull()){
            throw new Exception("Stack is full");
        }

        this.data[++this.top] = item;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is empty");
        }

        return this.data[this.top--];
    }


    public static void main(String[] args) {
        Stack stack = new Stack();

        try {

            stack.push(234);
            stack.push(546);
            stack.push(76);
            stack.push(26534);
            stack.push(65);

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("This will happen anyway");
        }

        System.out.println("This still works");

    }

}
