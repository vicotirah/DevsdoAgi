package com.agibank.s8matriz.s2ex9;

public class Main {
    public static void main(String[] args) {

        int[][] m = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int diag = 0, total = 0;

        for (int i = 0; i < m.length; i++) {
            if (m[i][i] == 1) diag +=m[i][i];
            for (int j = 0; j < m[0].length; j++) total+=m[i][j];
        }

        if (total == diag) System.out.printf("É uma matriz identidade");
        else System.out.print("Não é uma matriz identidade");
    }
}

