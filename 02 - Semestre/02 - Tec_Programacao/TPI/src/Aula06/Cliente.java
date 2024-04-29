/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06;

/**
 *
 * @author Alunos
 */
public class Cliente {
    //ATRIBUTOS
    private String nome;
    private String cpf;
    private String endereco;
    
    
    //CONSTRUTORES
   public Cliente(String nome){
       this.nome = nome;
   }
   public Cliente(String nome, String cpf){
       this(nome);
       this.cpf = cpf;
   }
   public Cliente(String nome, String cpf, String endereco){
      this(nome, cpf);
      this.endereco = endereco;
   }
   
   //METODOS GET

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }
   
    //MÉTODOS SET

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
