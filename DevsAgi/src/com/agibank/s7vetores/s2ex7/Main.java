package com.agibank.s7vetores.s2ex7;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        float[] vet = new float[5];
        float[] perc = new float[5];
        float total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("\nInsira o valor investido na ação" + (i + 1) + ": ");
            vet[i] = sc.nextFloat();
            total += vet[i];
        }
        for (int i = 0; i<5;i++ ) perc[i] = (vet[i]/total)*100;

        System.out.printf("\nTotal investido: %.2f", total);
        System.out.print("\nPorcentagem:" + Arrays.toString(perc));
    }
}
