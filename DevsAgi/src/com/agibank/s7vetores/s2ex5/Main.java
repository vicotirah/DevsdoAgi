package com.agibank.s7vetores.s2ex5;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        float [] vet = new float [5];
        float [] vari = new float [4];

        for (int i = 0; i < 5; i++) {
            System.out.print("\nDia" +(i+1)+ " - Insira o preço da ação: ");
            vet[i] = sc.nextFloat();
            System.out.printf("\nPreços: %.2f", vet[i]);

            if (i>=1){
                    vari[i-1]= ((vet[i] - vet[i-1])/vet[i-1])*100;
                    System.out.printf("\nVariação: %.2f%%", vari[i-1]);
                }
            }
        }
    }

