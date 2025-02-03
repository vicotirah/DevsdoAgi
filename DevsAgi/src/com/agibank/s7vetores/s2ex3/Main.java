package com.agibank.s7vetores.s2ex3;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        float [] vet = new float[5];
        float crescDiario = 0, anterior=0, porcentagem=0;
        float atual;

        System.out.print("Insira o valor inicial:");
        anterior = sc.nextFloat();

        for (int i = 0; i <5 ; i++) {
            System.out.print("\nDia " + (i+1) + " - Preço do ativo: ");
            atual = sc.nextFloat();

            if (atual > 0) {
                crescDiario += (atual-anterior)/anterior;
                anterior = atual;
            } else {
                System.out.print("\nValor inválido!\n");
            }
        }

        System.out.printf("\nCrescimento acumulado: %.2f%%", (crescDiario*100) );
    }
}
