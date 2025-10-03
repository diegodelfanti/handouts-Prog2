package it.unimi.di.prog2.h04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SommaList_DVD {

    static int somma(List<Integer> valori) {
        int somma = 0;
        for (Integer v : valori)
            somma += v.intValue(); // unboxing, devo togliere il tipo wrapper
        return somma;
    }

    public static void main(String[] args) {
        // ora ho lo scanner istanziato

        // int[] valori = new int[10];
        List<Integer> valori = new ArrayList<>();
        int letti = 0;

        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                // posso scrivere next per avaere una stinrga, poi ho varianti per vari tipi, in
                // questo caso per interi nextInt
                Integer i = Integer.valueOf(sc.nextInt()); // autoboxing TYPE WRAPPING
                valori.add(i);
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
