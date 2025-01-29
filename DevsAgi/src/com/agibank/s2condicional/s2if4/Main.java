package com.agibank.s2condicional.s2if4;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite a média: ");
        float media = scan.nextFloat();
        System.out.print("Digite o valor: ");
        float valor = scan.nextFloat();
        scan.close();
        double porcentagem = media - (valor/media*100);

        if (porcentagem < 0 ){
            porcentagem *= (-1);
        }

        System.out.printf("Média: %.2f\nValor: %.2f\nPercentual: %.2f", media, valor, porcentagem);

    }
}
