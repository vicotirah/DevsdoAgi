package com.agibank.s7vetores.s2ex6;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        float [] vet = new float[10];
        int alta = 0, baixa = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("\nDia " +(i+1)+ " - Insira o preço: ");
            vet[i] = sc.nextFloat();
            if (i>0) {
                if (vet[i] > vet[i-1]) alta++;
                else if (vet[i] < vet[i-1]) baixa++;
                }
            }
        System.out.printf("\nAlta: %d | Baixa: %d", alta, baixa);
    }
}
