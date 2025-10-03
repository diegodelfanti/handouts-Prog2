package it.unimi.di.prog2.h03;

import java.util.Scanner;

public class SommaArray {

    static int somma(int[] valori) {
        int somma = 0;
        for (int v : valori)
            somma += v;
        return somma;
    }

    public static void main(String[] args) {
        // ora ho lo scanner istanziato

        int[] valori = new int[10];
        int letti = 0;

        try (Scanner sc = new Scanner(System.in)) {
            while (letti < valori.length && sc.hasNextInt()) {
                // posso scrivere next per avaere una stinrga, poi ho varianti per vari tipi, in
                // questo caso per interi nextInt
                valori[letti++] = sc.nextInt();
                /*
                 * con CTRL + D posso terminare inserimento, però questo alza eccezion
                 * perchè non c'è più nulla da leggere
                 * fortunatamente lo scanner ha un metodo che mi dice se c'è ancora qualcosa da
                 * leggere di quel tipo
                 * sc.hasNextInt()
                 */
            }
        }

        System.out.println(somma(valori));
    }

}
