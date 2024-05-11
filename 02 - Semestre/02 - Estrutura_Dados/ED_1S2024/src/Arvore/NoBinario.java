/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvore;

/**
 *
 * @author Alunos
 */
public class NoBinario {
    //ATRIBUTOS DA CLASSE
    private Object info;
    private NoBinario esquerda, direita;
    
    //CONSTRUTORES
    public NoBinario(Object info, NoBinario esquerda, NoBinario direita){
        this.info = info;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    //MÉTODOS GETTERS
    public Object getInfo() {
        return info;
    }

    public NoBinario getEsquerda() {
        return esquerda;
    }

    public NoBinario getDireita() {
        return direita;
    }
    
    //MÉTODOS SETTERS
    public void setInfo(Object info) {
        this.info = info;
    }

    public void setEsquerda(NoBinario esquerda) {
        this.esquerda = esquerda;
    }

    public void setDireita(NoBinario direita) {
        this.direita = direita;
    }
    
}
