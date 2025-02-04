package com.agibank.s2condicional.s2if5;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite a nota do aluno: ");
        float n = scan.nextFloat();
        scan.close();

        if (n >=6) System.out.print("Aprovado");
        else if (n >= 4) System.out.print("Recuperação");
        else System.out.print("Reprovado");
    }
}

