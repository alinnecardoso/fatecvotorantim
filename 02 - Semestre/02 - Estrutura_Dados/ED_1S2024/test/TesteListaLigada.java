/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class TesteListaLigada {
    
    @Test
    public void testeCriacaoDeNos() {
        
        
        Object info = "Alinne";
        No proximoNo = null;
        No meuPrimeiroNo = new No(info, proximoNo);
        
        //ListaLigada minhaLista = new ListaLigada();
        
        assertEquals("Alinne", meuPrimeiroNo.getInfo());
        
        
    }
    
    @Test
    public void testeCriacaoLista() {
        
        ListaLigada minhaLista = new ListaLigada();
        
        minhaLista.addNo("Alinne");
        minhaLista.addNo("Rafael");
        minhaLista.addNo("Matheus");
        minhaLista.addNo("Gabriel");
        
        assertEquals("Alinne", minhaLista.get(0));
        assertEquals("Rafael", minhaLista.get(1));
        assertEquals("Matheus", minhaLista.get(2));
        assertEquals("Gabriel", minhaLista.get(3));
        
        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(1));
        System.out.println(minhaLista.get(2));
        System.out.println(minhaLista.get(3));
        
        
        
        
        
    }  
    
}
