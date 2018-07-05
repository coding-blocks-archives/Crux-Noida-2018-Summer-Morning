package com.codingblocks.ds;


import java.util.Queue;

public class StackUsingQueuePush {

    private Queue first;
    private Queue second;

    public boolean isFull(){
        return false;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    public void push(int item){
        first.add(item);
    }

    public int pop(){
        while (true){
            int temp = (int)first.remove();
            if (first.isEmpty()){

            } else {
                second.add(temp);
            }
        }
    }
}
