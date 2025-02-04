package com.agibank.s5repeticao.s2forwhile1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int fat = 1;

        System.out.print("Digite um número inteiro positivo: ");
        num = sc.nextInt();

        if (num == 0) System.out.printf("Fatorial de 0 é 0");
        else if (num<0)System.out.printf("Não existe fatorial de número negativo");
        else {
            for (int i = 1; i <= num; i++) fat *= i;
            System.out.printf("%d! = %d", num, fat);
        }
    }
}
