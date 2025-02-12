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
        
        /* CON CICLO WHILE */
        // int i = 0;
        // while (!bool && i < invited.length) {
            
        //     // == non funziona bene quando si tratta di stringhe, in quanto non sono primitive
        //     if (name.equals(invited[i].toLowerCase())) { 
        //         bool=true;
        //     } else i++;

        // }


        /* CON CICLO FOR */
        for (int i = 0; i < invited.length; i++) {
            if (name.equals(invited[i].toLowerCase())) { 
                bool=true;
                break;
            }
        }

        System.out.println(bool ? "Può entrare" : "Non può entrare");

    }


}
