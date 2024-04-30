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
public class Funcionario extends Pessoa {
   
    //Construtores
    public Funcionario(String nome, Genero genero){
        super(nome, genero);
    }
    public Funcionario(String nome, int idade, Genero genero) {
        super(nome, idade, genero);
    }
    
    //Métodos get
    @Override
    public String getNome(){
        if(super.getGenero().equals(Genero.MASCULINO)){
            return "Sr. " + super.nome;
        }
        else
            return "Sra. " + super.nome;
    }
}
