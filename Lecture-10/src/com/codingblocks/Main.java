package com.codingblocks;

public class Main {

    public static void main(String[] args) {
        int row = 4;
        int col = 4;

        boolean[][] maze = new boolean[row][col];

        mazepath("", maze, 0, 0);
    }

    private static void mazepath(String path, boolean[][] maze, int row, int col) {

        if (row == maze.length - 1 &&
                col == maze[0].length - 1){
            System.out.println(path);
            return;
        }


        if ( col > 0 && !maze[row][col-1]) {
            maze[row][col - 1] = true;
            mazepath(path + "L", maze, row, col - 1);
            maze[row][col - 1] = false;
        }

        if ( col < maze[0].length - 1 && !maze[row][col+1]) {
            maze[row][col + 1] = true;
            mazepath(path + "R", maze, row, col + 1);
            maze[row][col + 1] = false;
        }

        if (row > 0 && !maze[row-1][col]) {
            maze[row - 1][col] = true;
            mazepath(path + "U", maze, row - 1, col);
            maze[row - 1][col] = false;
        }

        if (row < maze.length - 1 && !maze[row + 1][col]) {
            maze[row + 1][col] = true;
            mazepath(path + "D", maze, row + 1, col);
            maze[row + 1][col] = false;
        }

    }
}
