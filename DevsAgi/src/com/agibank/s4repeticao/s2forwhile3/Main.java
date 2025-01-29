package com.agibank.s4repeticao.s2forwhile3;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int x, y;

        System.out.print("Digite a base: ");
        x = sc.nextInt();
        System.out.print("Digite o expoente: ");
        y = sc.nextInt();
        sc.close();

        int potencia = x;
        for (int i = 1; i < y; i++) {
            potencia *= x;
        }
        System.out.print("o valor " +x+ " elevado a " + y + " é " + potencia);
    }
}

