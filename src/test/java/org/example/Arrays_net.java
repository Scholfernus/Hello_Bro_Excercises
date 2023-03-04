package org.example;

import java.util.Arrays;

public class Arrays_net {
    public static void main(String[] args) {
        int[][] arrays = {
                {4, 28, 45, 40, 19, -17, -43, 22},
                {46, -42, 34, 27, -17, 45, 5, 0},
                {17, 5, -45, -21, 32, 28, 26, 13},
                {-23, 14, 17, 12, 2, 4, -5, 58},
                {50, -41, -31, -33, -14, 8, 41, 12},
        };
        for (int row = 0; row < arrays.length; row++) {
            for (int column = 0; column < arrays.length - 1; column++) {
                int min = arrays[row][column];
                int index = column;
                for (int j = column + 1; j < arrays.length; j++) {
                    if (min > arrays[row][j]) {
                        min = arrays[row][j];
                        index = j;
                    }
                }
                if (index != column) {
                    arrays[row][index] = arrays[row][column];
                    arrays[row][column] = min;
                }
                System.out.print(arrays[row][column] + ", ");
            }
        }
        System.out.println();
    }
}
