package com.agibank.s8matriz.s2ex10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int l = m.length;
        int[][] t = new int[l][l];

        for (int i = 0; i < m.length;i++) {
            for (int j = 0; j < m[i].length; j++) {
               t[j][l - 1 - i] = m[i][j];

            }
        }

        System.out.println(Arrays.deepToString(t));



//        System.out.println("Rotacionada: ");
//        for (int i = 0; i < t.length; i++)
//            for (int j = 0; j < t[0].length ; j++) {
//                System.out.print(t[i][j] + " ");
//                if (j==(t[0].length-1)) System.out.printf("\n");
//            }
    }
}


