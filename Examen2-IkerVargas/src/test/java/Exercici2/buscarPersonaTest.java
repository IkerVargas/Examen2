/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Exercici2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class buscarPersonaTest {
    
     public void testExisteixNom() {
        String[] llista = {"Juan", "Ana", "Pedro"};
        assertTrue(Metodes.existeixNom(llista, "Ana"));
        assertFalse(Metodes.existeixNom(llista, "Jose"));
        assertFalse(Metodes.existeixNom(new String[]{}, "Ana"));
        assertFalse(Metodes.existeixNom(llista, null));
    }
    
    @Test
    public void testPosicioArray() {
        String[] llista = {"Juan", "Ana", "Pedro"};
        assertEquals(1, Metodes.posicioArray(llista, "Ana"));
        assertEquals(-1, Metodes.posicioArray(llista, "Jose"));
        assertEquals(-1, Metodes.posicioArray(new String[]{}, "Ana"));
        assertEquals(-1, Metodes.posicioArray(llista, null));
    }
    
}