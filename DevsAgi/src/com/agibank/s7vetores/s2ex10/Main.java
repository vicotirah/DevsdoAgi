package com.agibank.s7vetores.s2ex10;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        float [] valor = {100, 105, 102, 110, 100, 107, 95, 97, 99, 103};
        float dDown;
        float picoMax = valor[0], maiordDown=0 ;

        for (int i = 0; i < valor.length; i++) {
            if (picoMax < valor[i]) picoMax = valor[i];
            else {
                dDown = ((valor[i]-picoMax)/picoMax)*100;
                if (dDown<maiordDown) maiordDown = dDown;
            }
        }
        System.out.printf("Maior DrawnDown: %.2f%%", maiordDown);
    }
}
