package com.codingblocks;

public class Stack {

    private static final int DEFAULT_SIZE = 10;

    private int[] nums = new int[DEFAULT_SIZE];

    private int top = -1;

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == nums.length - 1;
    }

    public void push(int data){
        if (!isFull()){
            top++;
            nums[top] = data;
        } else {
            System.out.println("Baad me aana");
        }
    }

    public int pop(){

        if (isEmpty()){
            System.out.println("Abe ab kya bacche ki jaan lega");
            return -1;
        }

        return nums[top--];
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(23);
        s.push(3);
        s.push(32);
        s.push(23);
        s.push(3);
        s.push(32);
        s.push(23);
        s.push(3);
        s.push(32);
        s.push(23);
        s.push(3);
        s.push(32);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
