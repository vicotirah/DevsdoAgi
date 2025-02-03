package com.agibank.s7vetores.s2ex2;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        float [] vet = new float[7];
        float media = 0;


        for (int i = 1; i <=7 ; i++) {
            System.out.printf("\nDia %d - Preço do ativo: ", i);
            vet[i-1] = sc.nextFloat();

            if (i==7) {
                media = (vet[6] + vet[5] + vet[4])/3;
                System.out.printf("\nMédia: %.2f", media);
            }
        }



    }
}
