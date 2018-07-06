package com.codingblocks.ds;

public class DynamicQueue extends QueueCircular {

    @Override
    public void insert(int item) throws Exception {
        if (this.isFull()){
            int[] temp = new int[this.data.length*2];

            for (int i = 0; i < size; i++) {
                temp[i] = data[(start + i)% data.length];
            }

            start = 0;
            end = size;

            this.data = temp;
        }

        super.insert(item);
    }
}
