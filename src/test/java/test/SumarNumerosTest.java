/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.mycompany.ejerciciojenkins.sumarNumeros;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author siamp-amoino
 */
public class SumarNumerosTest {
    sumarNumeros sumar;
    
    public SumarNumerosTest() {
    }
    
    @Before
    public void setUp(){
         sumar = new sumarNumeros();
    }
    
    @Test
    public void prueba(){
        assertEquals("SUMO BIEN", 4, sumar.sumaNumeros(2, 2));
    }
    
}
