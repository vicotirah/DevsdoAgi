package com.agibank.s8matriz.s2ex4;

public class Main {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 6, 7}};
        int l = m.length, c=m[0].length;
        int[][] t = new int[c][l];

        for (int i = 0; i < l; i++) for (int j = 0; j < c; j++) t[j][i] = m[i][j];

        System.out.println("Transposta: ");
        for (int i = 0; i < t.length; i++)
            for (int j = 0; j < t[0].length ; j++) {
                System.out.print(t[i][j] + " ");
                if (j==(t[0].length-1)) System.out.printf("\n");
            }
    }
}
