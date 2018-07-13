package com.codingblocks.ds;

public class StackUsingQueuePush extends Stack {

    private Queue first;
    private Queue second;

    public StackUsingQueuePush(){
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
        first.insert(item);
    }

    @Override
    public int pop() throws Exception {

        int last = 0;

        while (!first.isEmpty()){
            last = first.remove();

            if (!first.isEmpty()){
                second.insert(last);
            }
        }

        while (!second.isEmpty()){
            first.insert(second.remove());
        }

        return last;

    }
}
