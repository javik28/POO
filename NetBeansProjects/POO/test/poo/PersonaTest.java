/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class PersonaTest {
    
    public PersonaTest() {
    }
    

    /**
     * Test of mayorEdad method, of class Persona.
     */
    @Test
    public void testMayorEdad() {
        System.out.println("mayorEdad");
        Persona instance = new Persona();
        instance.setEdad(18);
        boolean expResult = true;
        boolean result = instance.mayorEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
            
    }
    
}
