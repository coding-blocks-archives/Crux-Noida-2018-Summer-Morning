package com.codingblocks.ds;

public class StackClient {
    public static void main(String[] args){
        Stack stack = new StackUsingQueuePop();

        try {

            for (int i = 0; i < 10; i++) {
                int item = (int)(Math.random()*1000);
                stack.push(item);
                System.out.println("pushed " + item);
            }


            while (!stack.isEmpty()){
                System.out.println("popped" + stack.pop());
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("This will happen anyway");
        }

        System.out.println("This still works");
    }
}
