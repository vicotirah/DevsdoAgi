package com.agibank.s6maratona1.s1esquenta.s2ex2;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        float saldo, saque;

        System.out.print("\nInsira o valor do saldo : ");
        saldo = sc.nextFloat();

        do {
            System.out.print("\nInsira o valor do saque: ");
            saque = sc.nextFloat();

            if (saque > 0) {
                if (saldo < saque) System.out.print("Erro: Saldo insuficiente!");
                else if ((saldo - saque) == 0) {
                    saldo -= saque;
                    System.out.print("Saldo zerado! Conta vazia!");
                } else {
                    saldo -= saque;
                    System.out.printf("Novo Saldo: %.2f", saldo);
                }
            }
        } while (saldo>0);
    }
}