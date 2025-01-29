package com.agibank.s4repeticao.s2forwhile1;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n, m;

        System.out.print("Digite o número desejado: ");
        n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            m = n * i;
            System.out.printf("%d x %d = %d\n", n, m, i);
        }
    }
}
