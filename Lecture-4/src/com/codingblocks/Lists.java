package com.codingblocks;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(1);
        list.add(5);
        list.add(9);

        list.set(3, 34);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
