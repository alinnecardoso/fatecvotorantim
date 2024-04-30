/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario p = new Funcionario("Pedro", Genero.MASCULINO);
        
        System.out.println(p.getNome());
        
        Aluno pedro = new Fundamental("Pedro", 8, Genero.MASCULINO);
        System.out.println("Nota: " + pedro.getNota());
        
        
        pedro.setNota(10);
        System.out.println("Nota: " + pedro.getNota());
        
        pedro = new Colegio("Pedro", 8, Genero.MASCULINO);
        pedro.setNota(8);
        System.out.println("Nota: " + pedro.getNota());
        
    }
    
}
