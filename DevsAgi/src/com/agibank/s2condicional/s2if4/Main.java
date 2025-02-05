package com.agibank.s2condicional.s2if4;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        float media, valor, porcentagem;

        System.out.print("Digite a média: ");
        media = scan.nextFloat();
        System.out.print("Digite o valor: ");
        valor = scan.nextFloat();
        scan.close();
        porcentagem = Math.abs(((valor-media)/media)*100);

        System.out.printf("Média: %.2f\nValor: %.2f\nPercentual: %.2f", media, valor, porcentagem);

    }
}
