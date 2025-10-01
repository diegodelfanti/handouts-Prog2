package it.unimi.di.prog2.h03;

public class FraUgua {
    public static void main(String[] args) {
        // così non va bene, args è un array di stringhe e non di interi
        /*
         * int a = args[0];
         * int b = args[1];
         * int c = args[2];
         * int d = args[3];
         */

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        System.out.println(
                (double) a / b == (double) c / d ? "uguali" : "diversi");
    }

    /*
     * per eseguire il programma:
     * ./gradlew build
     * e poi questo con i parametri alla fine
     * java -cp build/classes/java/main it.unimi.di.prog2.h03.FraUgua 1 2 2 4
     * per fare il controllo bisognoa fare moltiplicazioni come alle elementari
     * a * d == b * c
     */
}
