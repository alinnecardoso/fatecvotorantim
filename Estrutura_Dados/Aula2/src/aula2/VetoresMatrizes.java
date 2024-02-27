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
public class VetoresMatrizes {
    
        public static void main(String[] args){
            VetoresMatrizes vM1 = new VetoresMatrizes();
            
            /************** Exercício 1 **************/
            int[] entrada = new int[]{0,1,2,3,4,5,6,7};
            int[] saida;
            
            saida = vM1.inverterVetor(entrada);
            String retorno = "";
            String entradaConcatenado = "";
            
            for(int i=0; i<8; i++){
                entradaConcatenado += entrada[i];
                retorno += saida [i];
            }
            System.out.println("Vetor de entrada: " + entradaConcatenado);
            System.out.println("vetor Invertido: " + retorno);
            
            /************** Exercício 2 **************/
            int matrizRetorno[][] = vM1.concatenaVetorEMmatriz( new int[]{0,1,2,3,4,5,6,7},  new int[]{0,1,2,3,4,5,6,7},  new int[]{0,1,2,3,4,5,6,7});
            System.out.println("Fim!");
        }
        
        
        public int[] inverterVetor(int[] vetorEntrada){
            /* Crie um método que inverta o vetor de entrada e retorne o vetor onvertido */
            
            int [] vetorSaida = new int[8];
            
            for(int i=0; i<8; i++){
                vetorSaida[7-i] = vetorEntrada[i];          
            }
            
            return vetorSaida;
        }
        
        // Criação de matriz
        public int[][] concatenaVetorEMmatriz(int[] vetor1, int[] vetor2, int[] vetor3){
            /* Recebe 3 vetores de 8 posições e retorna uma matriz 8x3 com os vetores concatenados */
            int[][] matrizSaida = new int [8][3];
            
            for(int i=0; i<8; i++){
                matrizSaida[i][0] = vetor1[i];
                matrizSaida[i][1] = vetor2[i];
                matrizSaida[i][2] = vetor3[i];
            }
            
            return null;
        }
    }
