package com.agibank.s8matriz.s2ex3;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int [] diag = new int [m.length];

        for (int i = 0; i < m.length ; i++) for (int j = 0; j < m.length ; j++) if (j==i) diag[i] = m[i][j];
        System.out.print("Diagonal: " + Arrays.toString(diag));
    }
}
