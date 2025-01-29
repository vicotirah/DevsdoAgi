package com.agibank.s3condicional.s3switch1;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int op;

        System.out.print("Menu:\n1-CDB\n2-CDI\n3-Tesouro\n4-FII\nDigite a opção desejada: ");
        op = scan.nextInt();
        scan.close();

        switch (op){
            case 1:
                System.out.print("Investimento: CDB");
                break;
            case 2:
                System.out.print("Investimento: CDI");
                break;
            case 3:
                System.out.print("Investimento: Tesouro Direto");
                break;
            case 4:
                System.out.print("Investimento: FII");
                break;
            default:
                System.out.print("Insira uma opção válida");
        }
    }
}