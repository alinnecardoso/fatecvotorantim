/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author Alunos
 */
public class Exemplo1 {
    private JFrame janela;
    
    public Exemplo1(){
        janela = new JFrame("Minha Janela");
        //Encerra o processo após fechar a janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
    
    public static void main(String[] args){
        System.out.println("Método principal");
        Exemplo1 p = new Exemplo1();
        
    }
}
