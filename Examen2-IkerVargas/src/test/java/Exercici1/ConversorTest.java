package Exercici1;


import java.util.Scanner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTest {

    @Test
    public void testCanviarMoneda() {
        assertEquals(8.39, Metodes.canviarMoneda(Metodes.LLIURES, 10), 0.01);
        assertEquals(11.38, Metodes.canviarMoneda(Metodes.DOLARS, 10), 0.01);
        assertEquals(1316.15, Metodes.canviarMoneda(Metodes.IENS, 10), 0.01);
    }
    
    @Test
    public void testIntroduirEuros() {
        Metodes.entrada = new Scanner("10\n");
        assertEquals(10.0, Metodes.introduirEuros(), 0.01);
    }
    
    @Test
    public void testIntroduirMoneda() {
        Metodes.entrada = new Scanner("lliures\n");
        assertEquals(Metodes.LLIURES, Metodes.introduirMoneda());
        
        Metodes.entrada = new Scanner("yenes\nlliures\n");
        assertEquals(Metodes.LLIURES, Metodes.introduirMoneda());
    }
    
}
