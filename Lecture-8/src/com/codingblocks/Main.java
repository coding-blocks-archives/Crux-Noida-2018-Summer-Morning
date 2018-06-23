package com.codingblocks;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // convert from String to Integer
        // eg "1356" to 1356

        System.out.println(mazeReturn("", 3, 3));


    }

    public static int maze(int row, int col){

        if (row == 1 && col == 1 ){
            return 1;
        }

        int count = 0;

        if (row > 1){
            count += maze(row - 1, col);
        }

        if (col > 1){
            count += maze(row, col - 1);
        }

        return count;
    }

    public static void mazePrint(String path, int rows, int cols){

        if (rows == 1 && cols == 1){
            System.out.println(path);
            return;
        }

        if (rows > 1){
            mazePrint(path + "V", rows - 1, cols);
        }

        if (cols > 1){
            mazePrint(path + "H", rows, cols - 1);
        }


        if (rows > 1 && cols > 1){
            mazePrint(path + "D", rows - 1, cols - 1);
        }

    }


    public static ArrayList mazeReturn(String path, int rows, int cols){

        if (rows == 1 && cols == 1){
            ArrayList list = new ArrayList();
            list.add(path);
            return list;
        }

        ArrayList list = new ArrayList();

        if (rows > 1){
            ArrayList temp = mazeReturn(path + "V", rows - 1, cols);
            list.addAll(temp);
        }

        if (cols > 1){
            ArrayList temp = mazeReturn(path + "H", rows, cols - 1);
            list.addAll(temp);
        }


        if (rows > 1 && cols > 1){
            ArrayList temp = mazeReturn(path + "D", rows - 1, cols - 1);
            list.addAll(temp);
        }

        return list;

    }


    public static int mazeSimple(int row, int col){

        if (row == 1 || col == 1 ){
            return 1;
        }

        return mazeSimple(row - 1, col) +
                mazeSimple(row, col - 1);

    }
}
