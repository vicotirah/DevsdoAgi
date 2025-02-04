package com.agibank.s2condicional.s2if2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.close();
        if (i%2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
