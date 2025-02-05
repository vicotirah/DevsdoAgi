package com.agibank.s7vetores.s2ex7;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*1) Crie um programa que recebe um vetor com os preços diários de uma ação ao longo de 10 dias. O programa deve:

identificar se o mercado está em uma tendêndia de alta
(preços aumentam continuamente em 3 dias consecutivos);
Exibir os dias que compõem essa tendência;
Caso contrário, exibir "Sem tendência de alta identificada.*/

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        float [] preco = new float [10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("\n%d - Insira o preço: ", (i+1));
            preco[i] = sc.nextFloat();

            if (i>=3){
                if ((preco[i]>preco[i-1])&& (preco[i-1]>preco[i-2]){
                    System.out.printf("\nTendência de alta! Dias: %d %d %d ", (i-2), (i-1), i);
                } else System.out.print("Sem tendência!")
            }
        }
    }
}