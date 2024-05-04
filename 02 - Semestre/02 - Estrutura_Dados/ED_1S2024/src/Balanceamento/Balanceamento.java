/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Balanceamento;

/**
 *
 * @author Alunos
 */
public class Balanceamento {
    public static void main(String[] args){
        
        String vetor[] = new String[]{"(", ")"};
        
        System.out.println(validaBalanceamento(vetor));
        
        String vetor2[] = new String[]{"{", "}","]"};
        
        System.out.println(validaBalanceamento(vetor2));
        
        
    }
    
    public static boolean validaBalanceamento(String[] vetor){
        Pilha p = new Pilha();
        for(int i=0; i<vetor.length; i++){
            // vetor[i] == simbolo de abertura
            if(vetor[i] == "(" || vetor[i] == "{" || vetor[i] == "["){
                if(vetor[i] == "(")
                    p.empilhar(")");
                else if("{".equals(vetor[i]))
                    p.empilhar("}");
                else if(vetor[i] == "[")
                    p.empilhar("]");
            }
            if(vetor[i] == ")" || vetor[i] == "}" || vetor[i] == "]"){
                if(p.pilhaVazia())
                    return false;
                else if(vetor[i] != p.desempilhar())
                    return false;
            }
        }if(p.pilhaVazia())
            return true;
        else
            return false;
    }
}
