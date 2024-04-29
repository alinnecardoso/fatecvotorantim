/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteHeranca;

import Heranca.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class TesteHeranca {
    
    
    
    @Test
    public void TestePessoa() {
       /* Pessoa p1 = new Pessoa("Creison");

        System.out.println("Nome: " + p1.getNome());

        Funcionario f1 = new Funcionario("José", "Tio da Limpeza", 1500);
        
        System.out.println("Nome: " + f1.getNome() + "\nCargo: " + f1.getCargo() + "\nsalário: " + f1.calculaSalario());
        */
       
        Aluno a1 = new Aluno("André");
        a1.addNota((float) 10.5);
        a1.addNota((float) 10.5);
        a1.addNota((float) 10.5);
        a1.addNota((float) 10.5);
        a1.addNota((float) 10.5);
        a1.addNota((float) 10.5);
        a1.addNota((float) 10.5);
        a1.addNota((float) 10.5);
        a1.addNota((float) 10.5);
        
        
        
        //System.out.println("Nome: " + a1.getNome() + "\nNota: " + a1.getNota());
        
        //System.out.println("Teste: \n" + a1.calculaMedia() + "\n" + a2.calculaMedia());
        
        System.out.println("Média: " + a1.calculaMedia());
    }
    
}
