package com.agibank.s6maratona1.s1esquenta.s2ex4;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        float real, dolar;
        float limite = 0;

        do {
            System.out.print("\nInsira o valor a converter ou um valor negativo para sair: ");
            real = sc.nextFloat();
            limite += real;
            if (((real <= 1000) && (real > 0) && (limite <1000))) {
                dolar = real / 5;
                System.out.printf("Você receberá: $ %.2f", dolar);
            } else if (limite >= 1000) {
                System.out.print("\nLimite de R$1000 atingido. Encerrando transações.");
                break;
            }
        } while (real > 0);

    }
}