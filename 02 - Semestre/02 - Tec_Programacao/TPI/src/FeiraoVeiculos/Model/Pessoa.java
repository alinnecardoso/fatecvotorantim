/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeiraoVeiculos.Model;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    private String nome;
    private String telefone;
    private String cpf;
    public Pessoa(String nome, String telefone, String cpf) {
    }
    
    //Métodos Getters

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }
    
    //Métodos Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
