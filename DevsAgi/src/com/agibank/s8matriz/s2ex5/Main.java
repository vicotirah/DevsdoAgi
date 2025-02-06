package com.agibank.s8matriz.s2ex5;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int m, n, p;

        System.out.print("Insira o valor de m: ");
        m = sc.nextInt();
        System.out.print("Insira o valor de n: ");
        n = sc.nextInt();
        System.out.print("Insira o valor de p: ");
        p = sc.nextInt();

        int[][] a = new int[m][n];
        int[][] b = new int[n][p];
        int[][] c = new int[m][p];

        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) {
                System.out.print("Insira o valor de A" + (i + 1) + (j + 1) + ": ");
                a[i][j] = sc.nextInt();
            }

        for (int i = 0; i < n; i++) for (int j = 0; j < p; j++) {
                System.out.print("Insira o valor de B" + (i + 1) + (j + 1) + ": ");
                b[i][j] = sc.nextInt();
            }

        for (int i = 0; i < m; i++) for (int j = 0; j < p; j++) for (int k = 0; k < n; k++) c[i][j] += a[i][k] * b[k][j];

        for (int i = 0; i < c.length; i++) for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
                if (j == (c[0].length - 1)) System.out.printf("\n");
            }
    }
}