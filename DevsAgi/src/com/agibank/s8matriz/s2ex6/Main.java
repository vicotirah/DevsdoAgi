package com.agibank.s8matriz.s2ex6;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int [][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n;

        System.out.print("Insira o número procurado: ");
        n = sc.nextInt();

        for (int i = 0; i < m.length; i++) for (int j = 0; j < m[0].length ; j++) if (n == m[i][j]) System.out.printf("O número %d está na linha %d e na coluna %d", n, (i+1), (j+1));

    }
}
