/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici1;

import static exercici1.Metodes.*;

/**
 *
 * @author esther
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double euros = introduirEuros();
        String moneda = introduirMoneda();
        double canvi = canviarMoneda(moneda, euros);
        System.out.printf("\033[35m %.2f € són %.2f %s \n" , euros, canvi, moneda);

        imprimir(canvi);
    }

}
