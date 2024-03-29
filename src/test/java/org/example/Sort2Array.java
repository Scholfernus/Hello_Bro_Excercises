package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2Array {
    public static void main(String[] args) {
        int[][] tab1 = {
                {15, 9, 4},
                {-3, 12, 7},
                {5, 22, -5},

        };
        int[] tab2 = {12, 8, 4, 15};
        for (int i = 0; i < tab1.length; i++) {
            System.out.print("[");
            for (int j = 0; j < tab1[i].length; j++) {
                System.out.print(tab1[i][j] + ", ");
            }
            System.out.println("]");
        }
        sort2ArrayBasedOnColumn(tab1, 3);
        System.out.println("After sorting");
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length; j++) {
                System.out.print(tab1[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("Pojedyncza tablica przed sortowaniem: " + Arrays.toString(tab2));
        Arrays.sort(tab2);
//        for (int i = 0; i < tab2.length; i++) {
//
//            System.out.print(tab2[i] + ", ");
//        }
        System.out.println("Pojedyncza tablica po sortowaniu: " + Arrays.toString(tab2));
    }

    public static void sort2ArrayBasedOnColumn(int[][] array, final int columnNumber) {
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] second) {
                if (first[columnNumber - 1] > second[columnNumber - 1])
                    return 1;
                else return -1;
            }
        });
        int[][] tabStars = new int[4][];
        tabStars[0] = new int[1];
        tabStars[1] = new int[2];
        tabStars[2] = new int[3];
        tabStars[3] = new int[4];
        int k = 0;
        for (int i = 0; i < tabStars.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                tabStars[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < tabStars.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(tabStars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Kolejna pętla.");
        int[][] tab4 = new int[4][5];
        int z = 0;
        for (int i = 0; i < tab4.length; i++) {
            for (int j = 0; j < tab4[i].length; j++) {
                tab4[i][j] = z;
                z++;
            }
        }
        for (int i = 0; i < tab4.length; i++) {
            for (int j = 0; j < tab4[i].length; j++) {
                System.out.print(tab4[i][j] + ", ");
            }
            System.out.println();
        }
        int[] tab6 = { 33, 22, 11, 21, 55, 32, 3, 4 };
        System.out.println("Array before sorting : " + Arrays.toString(tab6));
        Arrays.sort(tab6); System.out.println("Array after sorting in ascending order : " + Arrays.toString(tab6));


        int[][] tab5 = {{7, 8, 2, 1},
                {0, 3, 2, 9},
                {6, 5, 3, 2},
                {8, 3, 7, 9}
        };
        sortArrays(tab5);    }


    static int sortArrays(int array2[][]) {
        //sortowanie poszczególnych wierszy
        for (int i = 0; i < array2.length; i++) {
            Arrays.sort(array2[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + ", ");
            }
            System.out.println();
        }
        return 0;

    }

}
