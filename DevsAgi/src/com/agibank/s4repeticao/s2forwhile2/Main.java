package com.agibank.s4repeticao.s2forwhile2;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n;
        int soma = 0;
        int odd = 1;

        System.out.print("Digite o número desejado (positivo): ");
        n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            soma+=odd;
            odd +=2;
        }
        System.out.print("O quadrado de " + n + "é" + soma);
    }
}
