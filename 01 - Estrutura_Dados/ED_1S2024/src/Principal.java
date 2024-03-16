/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PilhaVetor pilhaA = new PilhaVetor(4);
        
        pilhaA.empilhar("A");
        pilhaA.empilhar("B");
        pilhaA.empilhar("C");
        pilhaA.empilhar("D");
        pilhaA.empilhar("E");
        
        
        // Desempilha
        System.out.println("Pilha Cheia? " + pilhaA.verificaPilhaCheia());
        
        System.out.println("Desempilhar: " + pilhaA.desempilha());
        System.out.println("Desempilhar: " + pilhaA.desempilha());
        System.out.println("Desempilhar: " + pilhaA.desempilha());
        System.out.println("Desempilhar: " + pilhaA.desempilha());
        
        
        System.out.println("Pilha Vazia: " + pilhaA.verificaPilhaVazia());
        
        
        

        
    }
    
}
