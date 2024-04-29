/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class PilhaVetor {
    
    // Atributos da Clasee
    int  registraTopo;
    String[] vetorPilha;
    
    
    // Construtor da Classe 1
    public PilhaVetor(int tamanho){
        registraTopo = 0;
        vetorPilha = new String[tamanho];
    }
    
    // Método ou Ações da Classe
    public String empilhar (String entrada){
        if(verificaPilhaCheia() == false){
            vetorPilha[registraTopo] = entrada;
            registraTopo++;
        }
        return "Pilha Cheia";
    }
    public String desempilha(){
        if(verificaPilhaVazia() == false){
            registraTopo--;
            return vetorPilha[registraTopo];
        }
        else
            return "Pilha Vazia";
    }
    public boolean verificaPilhaCheia(){
        if(vetorPilha.length == registraTopo)
            return true;
        else 
            return false;
    }
    public boolean verificaPilhaVazia(){
        if(registraTopo == 0)
            return true;
        else
            return false;
    }
}
