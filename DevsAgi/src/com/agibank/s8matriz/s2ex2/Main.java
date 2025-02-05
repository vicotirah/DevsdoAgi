package com.agibank.s8matriz.s2ex2;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int [][] m = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16}};
        int total = 0, linha = 0, diag = 0;

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                total += m[i][i];
                if (i)
            }



    }
}
