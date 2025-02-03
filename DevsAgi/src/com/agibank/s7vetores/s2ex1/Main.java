package com.agibank.s7vetores.s2ex1;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        float[] vet = new float[10];

        for (int i = 1; i <= 10; i++) {
            System.out.print("\nInsira o valor da ação no dia " + i + " : ");
            vet[i] = sc.nextFloat();
            System.out.printf("\nPosição %d: %.2f\n", i, vet[i]);

            if (i >= 3) {
                if ((vet[i] > vet[i - 1]) && (vet[i - 1] > vet[i - 2])) {
                    System.out.printf("\nTendência de alta!\nDias: %d, %d, %d\n", i - 2, i - 1, i);
                } else {
                    System.out.print("\nSem tendência de alta identificada\n");
                }
            }
        }
    }
}