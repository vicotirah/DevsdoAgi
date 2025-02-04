package com.agibank.s6maratona1.s1esquenta.s2ex3;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        float divida, pagamento;
        int cont = 1;

        System.out.print("\nInsira o valor da divida : ");
        divida = sc.nextFloat();

        do {
            System.out.printf("\nInsira o valor do pagamento do mês %d: ", cont);
            pagamento = sc.nextFloat();
            if (pagamento >= 0) {
                divida -= pagamento;
                if (divida < 0) divida = 0;
                System.out.printf("Mês %d - Saldo restante: R$ %.2f", cont, divida);
                cont++;
            } else System.out.print("\nInsira um valor positivo! ");
        } while (divida>0);

        System.out.printf("\nMês %d - Divida quitada!", cont);
    }
}