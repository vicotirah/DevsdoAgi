package com.agibank.s8matriz.s2ex2;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int[][] m = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int [] linha = new int [m.length];
        int [] coluna = new int[m.length];
        int total = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                total += m[i][j];
                linha[i]+= m[i][j];
                coluna[j] += m[i][j];
                if (j==3) {
                    System.out.printf("\nLinha %d = %d", (i+1), linha[i]);
                    linha[i] = 0;
                }
                if (i==3) {
                    System.out.printf("\nColuna %d = %d", (j+1), coluna[j]);
                    coluna[j] = 0;
                }
                }
            }
        System.out.printf("\nTotal = %d", total);
        }
    }

