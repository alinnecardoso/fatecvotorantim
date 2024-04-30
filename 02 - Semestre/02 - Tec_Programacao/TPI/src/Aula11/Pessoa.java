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
public abstract class Pessoa {
    // Atributos da Classe
    protected String nome;
    private int idade;
    private Genero genero;
    
    //Construtores

    public Pessoa(String nome, Genero genero) {
        this.nome = nome;
        this.genero = genero;
    }
    public Pessoa(String nome, int idade, Genero genero){
        this(nome, genero);
        this.idade = idade;
    }
    
    //Métodos Getter
    
    //Métodos abstratos deverão ser implementados nas classes filhas
    public abstract String getNome();
    
    public Genero getGenero(){
        return this.genero;
    }
    public int getIdade(){
        return this.idade;
    }
    
    //Métodos Setter

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setGenero(Genero genero){
        this.genero = genero;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
}
