package com.codingblocks.ds;

public class DynamicStack extends Stack {

    @Override
    public void push(int item) throws Exception {
        if (this.isFull()){
            int[] temp = new int[this.data.length*2];
            for (int i = 0; i < this.data.length; i++) {
                temp[i] = this.data[i];
            }

            this.data = temp;
        }

        super.push(item);
    }
}
