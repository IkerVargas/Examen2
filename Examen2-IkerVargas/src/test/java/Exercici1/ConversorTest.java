/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Exercici1;


import java.util.Scanner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class ConversorTest {

    @Test
    public void testCanviarMoneda() {
        assertEquals(8.39, Metodes.canviarMoneda(Metodes.LLIURES, 10), 0.01);
        assertEquals(11.38, Metodes.canviarMoneda(Metodes.DOLARS, 10), 0.01);
        assertEquals(1316.15, Metodes.canviarMoneda(Metodes.IENS, 10), 0.01);
    }
    
    @Test
    public void testIntroduirEuros() {
        // Mocking user input
        Metodes.entrada = new Scanner("10\n");
        assertEquals(10.0, Metodes.introduirEuros(), 0.01);
    }
    
    @Test
    public void testIntroduirMoneda() {
        // Testing valid currency
        Metodes.entrada = new Scanner("lliures\n");
        assertEquals(Metodes.LLIURES, Metodes.introduirMoneda());
        
        // Testing invalid currency
        Metodes.entrada = new Scanner("yenes\nlliures\n");
        assertEquals(Metodes.LLIURES, Metodes.introduirMoneda());
    }
    
}
