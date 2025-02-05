package com.agibank.s7vetores.s2ex9;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int meses = 6;
        float inv = 1000.0F, taxa = 0.02F;
        float [] val = new float[meses];

        for (int i = 0; i < meses; i++) val[i] = (float) (inv *Math.pow((1+taxa), (i+1)));

        System.out.print("Valores Furutos: " + Arrays.toString(val));
    }
}
