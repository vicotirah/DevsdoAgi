package com.agibank.s2condicional.s2if3;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite seu peso: ");
        float p = scan.nextFloat();
        System.out.print("Digite sua altura: ");
        float h = scan.nextFloat();
        scan.close();
        double imc = p/Math.pow(h , 2);

        if (imc <= 16) {
            System.out.print("IMC:" + imc + "-Magreza Severa");
        } else if ((imc > 16 ) && (imc <= 17)) {
            System.out.print("IMC:" + imc + "-Magreza Moderada");
        } else if ((imc > 17 ) && (imc <= 18.5)) {
            System.out.print("IMC:" + imc + "-Magreza Leve");
        } else if ((imc > 18.5 ) && (imc <= 25)) {
            System.out.print("IMC:" + imc + "-Saudável");
        } else if ((imc > 25 ) && (imc <= 30)) {
            System.out.print("IMC:" + imc + "-Sobrepeso");
        } else if ((imc > 30 ) && (imc <= 35)) {
            System.out.print("IMC:" + imc + "-Obesidade Grau 1");
        } else if ((imc > 35 ) && (imc <= 40)) {
            System.out.print("IMC:" + imc + "-Obesidade Grau 2");
        } else if (imc > 40 ) {
            System.out.print("IMC:" + imc + "-Obesidade Grau 3");
        }

    }
}
