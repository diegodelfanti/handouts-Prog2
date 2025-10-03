package it.unimi.di.prog2.h04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SommaList_DVD {

    static int somma(List<Integer> valori) {
        int somma = 0;
        for (int v : valori)
            somma += v; // unboxing, lo fa in automatico, non serve più fare v.intValue()
        return somma;
    }

    public static void main(String[] args) {
        // ora ho lo scanner istanziato

        // int[] valori = new int[10];
        List<Integer> valori = new ArrayList<>();

        /*
         * PERCHè NON HO SCITTO List<Integer> valori = new List<>(); ? oppure
         * ArrayList<Integer> valori = new ArrayList<>();?
         * ArrayList e LinkedList sono due tipi particolari di List
         * Esiste una seprazione netta tra LIST che è il contratto principale e le sue
         * implementazioni. quindi a destra devo mettere i fatti, non le promesse.
         * quindi una implementazione
         * se uno si inventa una nuova implementazione di List, io posso usarla solo
         * quando dichiaro la variabile
         * quindi divido le PROMESSE (List) dai FATTI/COME LE REALIZZO (ArrayList)
         * Quindi List è importate dichairarla per conocrdare quali sono le promesse di
         * abilità che mi aspetto
         * non mi interessa come sono fatte, quindi le implementazioni e come queste
         * promesse sono realizzate
         */

        int letti = 0;

        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                // posso scrivere next per avaere una stinrga, poi ho varianti per vari tipi, in
                // questo caso per interi nextInt
                Integer i = Integer.valueOf(sc.nextInt()); // autoboxing TYPE WRAPPING per i TIPI PRIMITIVI
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
