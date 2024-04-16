/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici1;

import java.util.Scanner;

/**
 *
 * @author esther
 */
public class Metodes {

    static Scanner entrada = new Scanner(System.in);
    public static final String LLIURES = "lliures";
    public static final String DOLARS = "dolars";
    public static final String IENS = "iens";

    /**
     * @return la quantitat d'euros que volem canviar.

     */
    public static double introduirEuros() {
        System.out.print("Introdueix una quantitat d'euros: ");
        double euros = entrada.nextDouble();
        entrada.nextLine();
        return euros;
    }

    /**
     * @return la moneda a la que volem fer el canvi.
     */
    public static String introduirMoneda() {
        String moneda;
        System.out.print("Introdueix moneda de canvi: ");
        System.out.println("Les opcions vàlides son: " + LLIURES + ", " + DOLARS + ", " + IENS + ":");

        moneda = entrada.nextLine();
        switch (moneda.toLowerCase()) {
            case "lliures":
            case "dolars":
            case "iens":  
                
                break;
            default:
                moneda = null;
                System.out.println("Error, Les opcions vàlides son: " + LLIURES + ", " + DOLARS + ", " + IENS);
        }
        if (moneda == null) {
            moneda = introduirMoneda();
        }
        System.out.println("La moneda introduïda és " + moneda);
        
        return moneda.toLowerCase();
    }

    /**
     * Convertirà els euros a la moneda indicada retornant la quantitat
     * obtinguda.    
     *
     * @param moneda
     * @param euros
     * @return
     */
    public static double canviarMoneda(String moneda, double euros) {
        double canvi = 0.0;
        switch (moneda) {
            case LLIURES:
                canvi = euros * 0.839;
                break;
            case DOLARS:
                canvi = euros * 1.138;
                break;
            case IENS:
                canvi = euros * 131.615;
                break;
        }
        return canvi;
    }

    /**
     * Visualitzará por pantalla el resultat
     *
     * @param canvi
     */
    public static void imprimir(double canvi) {
        System.out.printf("El resultat de la conversió és %.2f " , canvi);
    }
}
