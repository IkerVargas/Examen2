/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici2;

import java.util.Scanner;

/**
 *
 * @author esther
 */
public class Metodes {

    public static boolean existeixNom(String[] llista, String busqueda) {
        for (int i = 0; i < llista.length; i++) {
            if (llista[i].equals(busqueda)) {
                return true;
            }
        }
        return false;
    }

    public static int posicioArray(String[] llista, String busqueda) {
        for (int x = 0; x < llista.length; x++) {
            if (llista[x].equals(busqueda)) {
                return x;
            }
        }
        return -1;
    }

    public static void introduirLlistaGrup(String[] llista) {
        int i = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("\n  \u001B[34m Introdueix els noms de l'alumnat del grup \n");
        while (i < llista.length) {
            System.out.print((i + 1) + " : ");
            llista[i] = entrada.next();
            System.out.println("");
            i++;
        }

    }

    public static String introduirNomBuscat() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nIntrodueix el nom de l'alumne que busques :  ");
        String nom = entrada.next();
        return nom;
    }
}

