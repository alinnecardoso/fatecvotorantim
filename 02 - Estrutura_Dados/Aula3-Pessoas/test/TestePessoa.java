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
public class TestePessoa {
    
    @Test
    public void testeArvoreGenealogica() {
        /* Pessoa deverá retornar sua árvore genealógica materna */
        
        Pessoa maria = new Pessoa("Maria");
        Pessoa isabela = new Pessoa ("Isabela", maria);
        Pessoa bia = new Pessoa ("Bia", isabela);
        
        assertEquals("Bia -> Isabela -> Maria == Fim ==", bia.arvoreGenealogica());
        
        System.out.println(bia.arvoreGenealogica());
        
        
        assertEquals("Maria -> Isabela -> Bia == Fim ==", maria.arvoreGenealogicaFilha());
        System.out.println(bia.arvoreGenealogicaFilha());
    }

    
}
