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
        String vetor[] = new String[]{"(", "}"};
        
        System.out.println(validaBalanceamento(vetor));
        
        String vetor2[] = new String[]{"{", "}"};
        
        System.out.println(validaBalanceamento(vetor2));
    }
    
    public static boolean validaBalanceamento(String[] vetor){
        
        return false;
    }
}
