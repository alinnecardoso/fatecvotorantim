/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProdutoMateriaPrima;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
class MateriaPrima {
    /* Atributos da classe */
    private String nome;
    private String descricao;
    private double valorCompra;
    private List impostos;
    
    /* Construtor */
    public MateriaPrima(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
        this.valorCompra = 0;
        impostos = new ArrayList<>();
    }
    public MateriaPrima(String nome, String descricao, double valorCompra, List impostos){
        this(nome, descricao);
        this.valorCompra = valorCompra;
        impostos = new ArrayList<>();
    }
    
    /* Métodos Getter */
    public String getNome(){
        return this.nome;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public double getValorCompra(){
        return this.valorCompra;
    }
    public List<Imposto> getImposto(){
        return this.impostos;
    }
    
    /* Métodos Setter */
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setValorCompra(double valorCompra){
        this.valorCompra = valorCompra;
    }
    public void setImposto(List<Imposto> impostos){
        this.impostos = impostos;
    }
    
    /* Método que adiciona imposto a lista */
    public void addImposto(Imposto imposto){
        impostos.add(imposto);
    }
    public boolean removerImposto(Imposto imposto){
        return impostos.remove(imposto);
    }
}
