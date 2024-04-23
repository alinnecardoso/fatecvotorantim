/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProdutoMateriaPrima;

/**
 *
 * @author Alunos
 */
class Margem {
    /* Margem de Lucro, Margem de Garantia, Margem de Desconto */
    /* Atributos da Classe */
    private String nome;
    private String descricao;
    private double percentual;
    
    /* Construtor */
    public Margem(String nome, String descricao, double percentual){
        this.nome = nome;
        this.descricao = descricao;
        this.percentual = percentual;
    }
    
    /* Métodos Getter */
    public String getNome(){
        return this.nome;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public double getPercentual(){
        return this.percentual;
    }
    
    /* Métodos Setter */
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setPercentual(double percentual){
        this.percentual = percentual;
    }
}
