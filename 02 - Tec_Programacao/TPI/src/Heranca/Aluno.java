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
public class Aluno extends Pessoa {
    private float[] listaNotas = new float[10];
    private float nota;
    private float soma=0;
    private int indice=0;
    private float media=0;

    
    //CONSTRUTORES
    public Aluno(String nome) {
        super(nome);
    }
    public Aluno(String nome, float nota){
        this(nome);
        this.nota = nota;
    }
    
    //MÉTODO GET
    public float[] getListaNotas(){
        return listaNotas;
    }
    public float getNota(){
        return nota;
    }
    public float getSoma(){
        return soma;
    }

    public int getIndice() {
        return indice;
    }

    public float getMedia() {
        return media;
    }
    
    
    //MÉTODO SET

    public void setListaNotas(float[] listaNotas) {
        this.listaNotas = listaNotas;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setSoma(float soma) {
        this.soma = soma;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    
    
    //Método para adicionar notas
    public void addNota(float nota){
        listaNotas[indice] = nota;
        indice++;
        
    }
    
    //Método para calcular a média
    public float calculaMedia(){
        // percorre lista de notas
        
        for(int i = 0; i < listaNotas.length; i++){
            
            
            soma += nota;
            
            media = soma/listaNotas.length;
             
            
        }
        return media;
        
    }

    
    
    
    
    
}
