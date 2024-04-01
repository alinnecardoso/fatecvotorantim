package TesteListaDuplaLigada;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ListaDuplaLigada.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class TesteListaDuplaLigada {
    
    @Test
    public void testeCriacaoDeNos() {
        ListaDuplamenteLigada minhaLista = new ListaDuplamenteLigada();
        TipoOrdenacao CRESCENTE = TipoOrdenacao.TipoOrdenacao.CRESCENTE;
        TipoOrdenacao DECRESCENTE = TipoOrdenacao.TipoOrdenacao
        
        /* minhaLista.adicionar("Alinne");
        minhaLista.adicionar("Rafael");
        minhaLista.adicionar("Matheus");
        minhaLista.adicionar("Gabriel");
        
        assertEquals("Alinne", minhaLista.getLista(0));
        assertEquals("Rafael", minhaLista.getLista(1));
        assertEquals("Matheus", minhaLista.getLista(2));
        assertEquals("Gabriel", minhaLista.getLista(3));
        
        System.out.println(minhaLista.getLista(0));
        System.out.println(minhaLista.getLista(1));
        System.out.println(minhaLista.getLista(2));
        System.out.println(minhaLista.getLista(3));
        
        
        System.out.println("Tamanho da Lista: " + minhaLista.tamanhoLista());
        System.out.println("Lista: " + minhaLista.imprimirLista());
        */
        
        minhaLista.adicionarOrdenado(22, CRESCENTE);
        minhaLista.adicionarOrdenado(21, CRESCENTE);
        
        System.out.println(minhaLista.imprimirLista());
         
        
        
       
    }  
}
