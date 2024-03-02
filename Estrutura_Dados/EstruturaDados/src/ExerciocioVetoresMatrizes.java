/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class ExerciocioVetoresMatrizes {
    
    /* Ex3: Crie um método que receba como parâmetro 
    um vetor de números binários com 8 posições,
    calcule e retorne o valor em decimal */
    
    public int converterBinarioDecimal(int[] entrada){
        int[] decimal = new int[]{128, 64, 32, 16, 8, 4, 2, 1};
        double[] decimalAndreza = new double[8];
        int soma = 0;
        
        
        for(int pot=7; pot>=0; pot--){
            decimalAndreza[pot] = Math.pow(2, pot);
  
            System.out.print(decimalAndreza[pot] + "\t");

 
        }
        System.out.println("\n");
        for(int i=0;i<8;i++){
            System.out.print(entrada[i]+"\t");
            
            soma = soma + (decimal[i] * entrada[i]);
            
           
            
        }
        System.out.println("\n");
        System.out.println("Resposta: " + soma);
        
        
        
        return 0;
    }
   

}
