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
public class Colegio extends Aluno {

    public Colegio(String nome, int idade, Genero genero) {
        super(nome, idade, genero);
    }

    @Override
    public String getNota() {
        return super.nota + "";
    }   
    
}
