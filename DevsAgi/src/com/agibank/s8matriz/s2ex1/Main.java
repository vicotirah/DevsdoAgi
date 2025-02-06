package com.agibank.s8matriz.s2ex1;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int [][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) {
            System.out.print(matriz[i][j] + " ");
            if (j == 2) System.out.print("\n");
        }
    }
}