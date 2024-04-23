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
class Imposto {
    /* Atributos da Classe */
    private String nome;
    private String descricao;
    private double percentual;
    
    /* Construtor */
    public Imposto(String nome, String descrição, double percentual){
        this.nome = nome;
        this.descricao = descrição;
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
