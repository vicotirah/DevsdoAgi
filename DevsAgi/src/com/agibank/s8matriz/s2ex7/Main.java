package com.agibank.s8matriz.s2ex7;

public class Main {
    public static void main(String[] args) {

        int [][] m = {{1, 2, 3}, {4, 5, 6}, {0, 8, 9}};
        int diag=0, diagS=0;

        for (int i = 0; i < m.length; i++) diag += m[i][i];
        for (int i = 0; i< m.length; i++)diagS += m[i][m.length-1-i];

        System.out.printf("Principal: %d\nSecundária: %d", diag, diagS);
    }
}
