package com.agibank.s5repeticao.s2forwhile3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float compra = 0, total = 0, desconto = 0;
        float valor;
        char cliente, prod;

        do {
            do {
                System.out.print("Digite o valor do produto: \n");
                valor = sc.nextFloat();
                compra +=valor;
                System.out.print("Adicionar outro produto? \n");
                prod = sc.next().charAt(0);
            }while (prod == 's');

            if (compra <= 500){
                desconto = (float) (compra*0.05);
                total = compra - desconto;

            } else if ((compra > 500) && (compra<=1000)){
                desconto = (float) (compra*0.1);
                total = compra - desconto;
            } else {
                desconto = (float) (compra*0.12);
                total = compra - desconto;
            }

            System.out.printf("\nCompra: R$ %.2f\nDesconto: R$ %.2f" +
                    "\nValor Total: R$ %.2f", compra, desconto, total);
            compra=0;
            System.out.print("\nPróximo cliente? \n");
            cliente = sc.next().charAt(0);
        } while (cliente=='s');
        sc.close();
    }
}
