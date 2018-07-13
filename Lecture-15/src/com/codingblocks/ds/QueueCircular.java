package com.codingblocks.ds;

public class QueueCircular extends Queue{

    protected int start = 0;
    protected int end = 0;
    protected int size = 0;
    private int DEFAULT_SIZE = 5;
    protected int[] data = new int[DEFAULT_SIZE];

    public boolean isEmpty(){
        return this.size == 0;
    }

    public boolean isFull(){
        return this.size == this.data.length;
    }

    public void insert(int item) throws Exception{
        if (isFull()){
            throw new Exception("Queue is full");
        }

        this.data[this.end] = item;
        this.end = (this.end + 1) % this.data.length;
        this.size++;

    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }

        int temp = this.data[this.start];
        this.start = (this.start + 1) % this.data.length;
        this.size--;
        return temp;
    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }

        return this.data[0];
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        try {

            queue.insert(32456);
            queue.insert(546);
            queue.insert(32456756);
            queue.insert(657);
            queue.insert(657);
            queue.insert(657);

            System.out.println(queue.remove());
            System.out.println(queue.remove());
            System.out.println(queue.remove());
            System.out.println(queue.remove());
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("I am still working");
    }

}
