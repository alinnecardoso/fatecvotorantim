/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08;

import java.util.Scanner;
/**
 *
 * @author Alunos
 */
public class Calculadora {
    
    int a; //primeiro número a ser inserido pelo usuário
    int b; //segundo número a ser inserido pelo usuário
     //Cria Scanner para obter a entrada a partir da janela de comendo
    Scanner input = new Scanner(System.in);
    
    Calculo c = new Calculo();
        
    
    // Método
    public int Menu(){
        
        
        int comando = -1;
        while(comando != 0){
            System.out.println(""
                    + "||-------------------------------------||\n"
                    + "||  Comando  ||  Ação                  ||\n"
                    + "||-------------------------------------||\n"
                    + "||     1     ||  Somar                 ||\n"
                    + "||     2     ||  Subtrair              ||\n"
                    + "||     3     ||  Multiplicar           ||\n"
                    + "||     4     ||  Dividir               ||\n"
                    + "||     0     ||  Encerrar Calculadora  ||\n"
                    + "||-------------------------------------||\n");
            
            System.out.print("Escolha uma opção: ");
            comando = input.nextInt();
            
            if(comando != 0){
                System.out.print("Insira um número: ");
                a = input.nextInt();

                System.out.print("Insira um número: ");
                b = input.nextInt();

                if (comando == 1){
                    System.out.printf("A soma será: %d%n", c.soma(a, b));
                }
                if (comando == 2){
                    System.out.printf("A subtração será: %d%n", c.subtracao(a, b));
                }
                if (comando == 3){
                    System.out.printf("A multiplicação será: %d%n", c.multiplicacao(a, b));
                }
                if (comando == 4){
                    if(b == 0){
                        System.out.println("Não é possível realizar a divisão por ZERO!");
                    }
                    else
                    System.out.printf("A divisão será: %d%n", c.divisao(a, b));

                }
            }
            else{
                System.out.println("Calculadora Encerrada!");
                break;
            }

            }
        
        return -1;
    }
}
