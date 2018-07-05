package com.codingblocks.ds;

public class Main {
    public static void main(String[] args) throws Exception{
        Stack stack = new DynamicStack();

        stack.push(4356);
        stack.push(435);
        stack.push(4355466);
        stack.push(456);
        stack.push(676);
        stack.push(65758);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
