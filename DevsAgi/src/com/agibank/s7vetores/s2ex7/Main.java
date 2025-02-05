package com.agibank.s7vetores.s2ex7;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        float [] acao = new float[5];
        float [] porcentagem = new float[5];
        float total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("\nInsira o valor da ação " + (i+1) + ": ");
            acao[i] = sc.nextFloat();
            if (acao[i] > 0){
                total += acao[i];
            }
            else if (acao[i] < 0){
                acao[i] = 0;
            }
        }

        for (int i = 0; i < 5; i++) porcentagem[i] = (acao[i]/total)*100;

        System.out.printf("Total = R$ %.2f\n", total);
        System.out.print("Porcentagem: " + Arrays.toString(porcentagem));
    }
}