package com.codingblocks;

public class Maze {
    public static void main(String[] args) {

        System.out.println(mazeItrSS(4, 4));

    }

    public static int mazeItr(int row, int col) {

        int[][] mem = new int[row + 1][col + 1];

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || j == 1) {
                    mem[i][j] = 1;
                } else {
                    mem[i][j] = mem[i - 1][j] + mem[i][j - 1];

                }

            }
        }

        return mem[row][col];

    }

    public static int mazeItrSS(int row, int col) {

        int[] mem = new int[col + 1];

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || j == 1) {
                    mem[j] = 1;
                }
                else {
                    mem[j] = mem[j] + mem[j - 1];
                }

            }
        }

        return mem[col];

    }

    public static int mazeDP(int row, int col, int[][] mem) {
        if (row == 1 || col == 1) {
            return 1;
        }

        if (mem[row][col] != 0) {
            return mem[row][col];
        }

        mem[row][col] = mazeDP(row - 1, col, mem) +
                mazeDP(row, col - 1, mem);

        return mem[row][col];
    }

    public static int maze(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        return maze(row - 1, col) + maze(row, col - 1);
    }
}
