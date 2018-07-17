package com.codingblocks;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Human[] insaan = new Human[5];

        insaan[0] = new Human(24, "Cnuj 1");
        insaan[1] = new Human(25, "Bnuj 2");
        insaan[2] = new Human(21, "Dnuj 3");
        insaan[3] = new Human(28, "Anuj 4");
        insaan[4] = new Human(19, "Enuj 5");


        Arrays.sort(insaan, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        for (Human human : insaan) {
            System.out.println(human);
        }



//        float[] weight = {12, 4, 1, 5, 11};
//        float[] price = {234, 544, 453, 345, 345};
//
//        Item[] items = new Item[weight.length];
//
//        for (int i = 0; i < weight.length; i++) {
//            float rate = price[i] / weight[i];
//            items[i] = new Item(rate, weight[i]);
//        }
//
//        Arrays.sort(items, new Comparator<Item>() {
//            @Override
//            public int compare(Item o1, Item o2) {
//                if (o1.rate > o2.rate) {
//                    return 1;
//                } else if (o1.rate < o2.rate) {
//                    return -1;
//                }
//
//                return 0;
//            }
//        });
//
//        for (Item item : items) {
//            System.out.println(item);
//        }


    }

    private static class Item {
        private float rate;
        private float weight;

        public Item(float rate, float weight) {
            this.rate = rate;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return rate + " : " + weight;
        }

//        @Override
//        public int compareTo(Item o) {
//             if (o.rate > this.rate){
//                 return 1;
//             } else if (o.rate < this.rate ){
//                 return -1;
//             }
//
//             return 0;
//        }
    }
}
