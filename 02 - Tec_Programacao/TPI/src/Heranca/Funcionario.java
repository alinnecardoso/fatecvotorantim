/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author Alunos
 */
public class Funcionario extends Pessoa {
    
    private String cargo;
    private float salarioBase;
    
    
    // CONSTRUTORES
    public Funcionario(String nome){
        super(nome);
    }
    
    public Funcionario(String nome, String cargo){
        this(nome);
        this.cargo = cargo;
    }
    public Funcionario(String nome, String cargo, float salarioBase){
        this(nome, cargo);
        this.salarioBase = salarioBase;
    }
    
    // MÉTODO GET
    public String getCargo(){
        return cargo;
    }
    public float getSalarioBase(){
        return salarioBase;
    }
    
    //MÉTODOS - Sem uso
    
        //método retorna o salario base
    public float calculaSalario(){
        return salarioBase;
    }
    
    
    
}
