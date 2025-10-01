package it.unimi.di.prog2.h03;

public class SommaArray {

    static int somma(int[] valori) {
        int somma = 0;
        for (int v : valori)
            somma += v;
        return somma;
    }

    public static void main(String[] args) {
        int[] primi = { 1, 2, 3, 4, 5 };
        int[] secondi = { 1, 2 };
        IO.println(somma(primi));
        IO.println(somma(secondi));
    }

}
