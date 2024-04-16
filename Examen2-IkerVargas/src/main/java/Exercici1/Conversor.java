package exercici1;

import static exercici1.Metodes.*;

public class Conversor {

    public static void main(String[] args) {
        double euros = introduirEuros();
        String moneda = introduirMoneda();
        double canvi = canviarMoneda(moneda, euros);
        System.out.printf("\033[35m %.2f € són %.2f %s \n" , euros, canvi, moneda);

        imprimir(canvi);
    }

}
