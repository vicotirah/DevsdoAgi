package com.agibank.s7vetores.s2ex8;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        float [] compra = new float[5];
        float [] venda = new float[5];
        float lucro = 0, imp = 0.15F, dif=0;

        for (int i = 0; i < 5 ; i++) {
            System.out.print("\nInsira o valor de compra: ");
            compra[i] = sc.nextFloat();
            System.out.print("\nInsira o valor de venda: ");
            venda[i] = sc.nextFloat();
            lucro += venda[i]-compra[i];
        }

        if (lucro>20000) {
            dif = lucro - 20000;
            lucro -= (dif*imp);
            System.out.print("Imposto de 15% aplicado");
        } else System.out.print("Sem imposto aplicado");
        System.out.printf("\nLucro total: R$%.2f", lucro);
    }
}
