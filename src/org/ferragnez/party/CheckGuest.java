package org.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {
        
        // Invited list
        String[] invited = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        Scanner sc = new Scanner(System.in);    
        System.out.print("Inserire proprio nome: ");
        String name = sc.nextLine().toLowerCase();
        sc.close(); // Chiude subito lo scanner in quanto in questo caso non servirà più

        boolean bool = false;
        int i = 0;

        while (!bool && i < invited.length) {
            
            // == non funziona bene quando si tratta di stringhe, in quanto non puntano alla stessa memoria
            if (name.equals(invited[i].toLowerCase())) { 
                bool=true;
            } else i++;

        }

        System.out.println(bool ? "Può entrare" : "Non può entrare");

    }


}
