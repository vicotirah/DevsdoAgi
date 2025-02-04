package com.agibank.s7vetores.s2ex4;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        float [] vet = new float[10];
        float maiorNum = 0, menorNum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("\nDia " +(i+1)+ " - Insira o preço: ");
            vet[i] = sc.nextFloat();

            if (i == 0) {
                menorNum = vet[i];
                maiorNum = vet[i];
            } else {
                if (vet[i] > maiorNum) maiorNum = vet[i];
                else if (vet[i] < menorNum) menorNum = vet[i];
            }
        }

        System.out.printf("\nMaior valor: %.2f | Menor valor: %.2f", maiorNum, menorNum);

    }
}
