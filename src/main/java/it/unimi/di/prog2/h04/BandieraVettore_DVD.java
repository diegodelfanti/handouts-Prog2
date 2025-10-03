package it.unimi.di.prog2.h04;

import java.util.Scanner;
import java.util.Vector;

@SuppressWarnings({ "rawtypes", "unchecked" }) // Per evitare warning

public class BandieraVettore_DVD {
    public static void main(String[] args) {
        Vector parole = new Vector(); // vettore è un contenitore di oggetti (Object), qualsiasi. sta al programmatore
                                      // stare attento a cosa ci mette dentro e a sapere cosa tira fuori quanto lo va
                                      // a leggere
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                parole.add(sc.next());
            }
        }

        int maxLen = 0;
        for (Object oggetto : parole) {
            String parola = (String) oggetto; // il programmatore consapevole versa in una scatola [vector] della roba e
                                              // deve essere consapevole di tirare fuori delle stringhe
            int len = parola.length();
            if (len > maxLen)
                maxLen = len;
            System.out.println(maxLen);
        }

        for (Object oggetto : parole) {
            String parola = (String) oggetto; // il programmatore consapevole versa in una scatola [vector] della roba e
                                              // deve essere consapevole di tirare fuori delle stringhe
            String parolaBandieraSpazi = String.format("%" + maxLen + "s", parola);
            System.out.println(parolaBandieraSpazi.replace(" ", "#"));
        }
    }
}
