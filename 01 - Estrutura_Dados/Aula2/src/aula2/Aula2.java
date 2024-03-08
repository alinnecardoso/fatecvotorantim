/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;
/**
 *
 * @author Alunos
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VetoresMatrizes vM1 = new VetoresMatrizes();
        
        int[] entrada = new int[]{0,1,2,3,4,5,6,7};
        int[] saida;
        
        saida = vM1.inverterVetor(entrada);
        
        
        System.out.println("Boa Noite!");
    }
    
}
