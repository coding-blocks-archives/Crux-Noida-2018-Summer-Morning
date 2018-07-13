package com.codingblocks.ds;

public class DynamicStack extends Stack {

    @Override
    public void push(int item) throws Exception {
        if (this.isFull()){
            int[] temp = new int[data.length*2];

            System.out.println("Now I am doubling to " + temp.length);

            for (int i = 0; i < data.length ; i++) {
                temp[i] = data[i];
            }

            this.data = temp;
        }

        super.push(item);
    }
}
