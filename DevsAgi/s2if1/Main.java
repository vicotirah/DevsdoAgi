package com.agibank.s2if1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.close();
        if (i>0) {
            System.out.println("Positive");
        } else if (i == 0){
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }
}
