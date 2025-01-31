package com.agibank.s6maratona1.s1esquenta.s2ex1;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        float gasto;
        float totalGasto = 0;

        do {
            System.out.print("\nInsira o valor de pagamento ou digite um valor negativo para sair do programa: ");
            gasto = sc.nextFloat();

            if (gasto >=0) {
                totalGasto += gasto;
            }

            if (totalGasto>= 5000) {
                System.out.print("Seus gastos ultrapassaram R$5000!");
            }

        } while (gasto>=0);
        sc.close();
        System.out.printf("\nTotal gasto: %.2f", totalGasto);
    }
}