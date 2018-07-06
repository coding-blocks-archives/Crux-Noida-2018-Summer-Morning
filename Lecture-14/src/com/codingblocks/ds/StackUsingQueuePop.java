package com.codingblocks.ds;

public class StackUsingQueuePop extends Stack {

    private Queue first;
    private Queue second;

    public StackUsingQueuePop(){
        first = new DynamicQueue();
        second = new DynamicQueue();
    }

    @Override
    public boolean isEmpty() {
        return first.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void push(int item) throws Exception {
        while (!first.isEmpty()){
            second.insert(first.remove());
        }

        first.insert(item);

        while (!second.isEmpty()){
            first.insert(second.remove());
        }
    }

    @Override
    public int pop() throws Exception {
        return first.remove();
    }
}
