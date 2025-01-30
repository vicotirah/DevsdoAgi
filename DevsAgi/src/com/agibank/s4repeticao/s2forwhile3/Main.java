package com.agibank.s4repeticao.s2forwhile3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, exp;

        System.out.print("Digite a base: ");
        x = sc.nextInt();
        System.out.print("Digite o expoente: ");
        y = sc.nextInt();
        exp = Math.abs(y); //módulo do expoente
        sc.close();

        double potencia = 1;
        for (int i = 0; i < exp; i++) {
            potencia *= x;
        }
        if (y < 0) {
            potencia = 1 / potencia;
        }

        System.out.printf("O valor %d elevado a %d é igual a %.4f", x, y, potencia);
    }
}

