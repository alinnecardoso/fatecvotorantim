/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Aula03.Matematica;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class CauculoPotencias {
    
    @Test
    public void testePotenciaDeDois() {
        Matematica mat = new Matematica();
        // Teste 2^0 = 1
        int base = 2;
        int potencia = 0;
        
        potencia = 0;
        assertEquals(1, mat.pot(base,potencia));
        
        // Teste 2^1 = 2
        potencia = 1;
        assertEquals(2, mat.pot(base,potencia));
        
        // Teste 2^2 = 4
        potencia = 2;
        assertEquals(4, mat.pot(base,potencia));
        
    }
    
}
