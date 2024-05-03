/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Balanceamento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diver
 */
public class Pilha {
    
    List<Object> pilha = new ArrayList<Object>();
   
 
    public void empilhar(Object item) {
        pilha.add(item);
    }
  
    public Object desempilhar() {
        if(!pilha.isEmpty()){
            return pilha.remove(pilha.size()-1);
        }
        else
           return null;
    }    

    public boolean pilhaVazia() {
        return pilha.isEmpty();
    }
    
    public Object exibirTopo(){
        if (!pilhaVazia()){
            return pilha.get(pilha.size()-1);
        }
        else
            return false;
    }
    
}
