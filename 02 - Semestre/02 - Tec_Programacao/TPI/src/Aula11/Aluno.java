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
public abstract class Aluno extends Pessoa {
    protected float nota;
    
    public Aluno(String nome, Genero genero){
        super(nome, genero);
    }
    public Aluno(String nome, int idade, Genero genero) {
        super(nome, idade, genero);
    }

    @Override
    public String getNome() {
        return super.nome;
    }
    //A nota deverá ser retornada no formato de 0 a 10
    public abstract String getNota();

    public void setNota(float nota) {
        this.nota = nota;
    }
    
}
