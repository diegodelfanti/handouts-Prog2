package it.unimi.di.prog2.h03;

import java.util.Scanner;

public class SommaValute {
    public static void main(String[] args) {
        /*
         * 0,10+ 0,20 = 0.30000000000000004
         * non va sempre bene per tutti i numeri, il problema è che alcuni centesimi
         * esercizio da fare per casa è
         */
        double somma = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextDouble()) {
                somma += sc.nextDouble();
            }
            System.out.println(somma);
        }
    }
}
