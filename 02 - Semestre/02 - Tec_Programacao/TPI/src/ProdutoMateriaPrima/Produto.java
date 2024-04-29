/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProdutoMateriaPrima;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class Produto {
    /* Atributos da Classe */
    private int id;
    private String nome;
    private String descricao;
    private double valorVenda;
    
    private List impostos;
    private List materiaPrima;
    private List margens;
    
    /* Construtores */
    public Produto(int id, String nome, String descricao){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
    public Produto(int id, String nome, String descricao, double valorCompra){
        this(id,nome, descricao);
        this.valorVenda = 0;
        impostos = new ArrayList<>(); 
    }
    /* Métodos Getter */
    public int getId(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public double getValorVenda(){
        return this.valorVenda;
    }
    public List getImpostos(){
        return this.impostos;
    }
    public List getMateriaPrima(){
        return this.materiaPrima;
    }
    public List getMargens(){
        return this.margens;
    }
    /* Métodos Setter */
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setValorVenda(double valorVenda){
        this.valorVenda = valorVenda;
    }
    public void setImpostos(List impostos){
        this.impostos = impostos;
    }
    public void setMateriaPrima(List materiaPrima){
            this.materiaPrima = materiaPrima;
    }
    public void setMargens(List margens){
        this.margens = margens;
    }
    /* Método que adiciona imposto a lista */
    public void addImposto(Imposto imposto){
        impostos.add(imposto);
    }
    public boolean removerImposto(Imposto imposto){
        return impostos.remove(imposto);
    }
    
}
