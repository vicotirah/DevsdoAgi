package com.agibank.s6maratona1.s2avaliacao;
import java.util.Locale;
import java.util.Scanner;
/* Proprietario Nome: Victoria Rocha nota: 100
*  Tester Nome: Leandro Rocha */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        float vInicial, graus;
        float t=0.01F, g= 9.8F;
        double x = 0, y =0;
        double rad;
        int cont = 0;

        System.out.print("Insira a velocidade inicial em m/s: ");
        vInicial = sc.nextFloat();

        System.out.print("Insira o ângulo em graus: ");
        graus = sc.nextFloat();
        rad = Math.toRadians(graus);

         if (((rad > 0) && (rad < 2)) && ((vInicial>0))) {
            do  {
                cont ++;
                x = vInicial * Math.cos(rad) * t;
                y = ((vInicial * Math.sin(rad) * t) - (0.5 * g * Math.pow(t, 2)));
                System.out.printf("\nPosição %d:", cont);
                System.out.printf("\n X: %.2f | Y: %.2f", x, y);
                t+=0.01;
            } while (y > 0);
        }
    }
}