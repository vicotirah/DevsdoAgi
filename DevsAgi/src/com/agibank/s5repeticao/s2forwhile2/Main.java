package com.agibank.s5repeticao.s2forwhile2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int a = 0, b = 1;

        System.out.print("Insira o número desejado: ");
        num = sc.nextInt();

        System.out.println(a);

        for (int i = 0; i < num; i++) {
                int c = a + b;
                a = b;
                b = c;
                System.out.println(a);
            if (c>=num) {
                break;
            }
        }
    }
}