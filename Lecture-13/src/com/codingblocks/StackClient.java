package com.codingblocks;

public class StackClient {
    public static void main(String[] args){
        Stack stack = new Stack();

        try {
            stack.push(10);
            stack.push(15);
            stack.push(5);
            stack.push(10);
            stack.push(15);
            stack.push(5);
            stack.push(10);
            stack.push(15);
            stack.push(5);
            stack.push(10);
            stack.push(15);
            stack.push(5);


            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("This still works");


    }
}
