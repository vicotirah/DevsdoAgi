package com.agibank.s3condicional.s3switch2;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int op;

        System.out.print("Pesquisa de satisfação!\n0-Péssimo\n1-Muito Ruim\n2-Ruim\n" +
                "3-Regular\n4-Bom\n5-Ótimo\nDigite a opção desejada: ");
        op = scan.nextInt();
        scan.close();

        switch (op){
            case 0:
                System.out.print("Péssimo - Obrigado por responder a pesquisa! \n" +
                        "Sentimos muito, trabalharemos para melhorar nossos serviços");
                break;
            case 1:
                System.out.print("Muito Ruim - Obrigado por responder a pesquisa! \n" +
                        "Sentimos muito, trabalharemos para melhorar nossos serviços");
                break;
            case 2:
                System.out.print("Ruim - Obrigado por responder a pesquisa! \n" +
                        "Sentimos muito, trabalharemos para melhorar nossos serviços");
                break;
            case 3:
                System.out.print("Regular - Obrigado por responder a pesquisa! Trabalharemos para melhorar nossos serviços");
                break;
            case 4:
                System.out.print("Bom - Obrigado por responder a pesquisa! Ficamos felizes!");
                break;
            case 5:
                System.out.print("Muito Bom - Obrigado por responder a pesquisa! Ficamos felizes!");
                break;
            default:
                System.out.print("Insira uma opção válida");
        }
    }
}