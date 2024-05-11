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
public class ArvoreBinaria {
    //ATRIBUTOS DA CLASSE
    private NoBinario raiz;
    
    //CONSTRUTORES
    public ArvoreBinaria(Object info){
        //Iremos criar o primeiro nó raiz
        raiz = new NoBinario(info, null, null);
    }
    
    //MÉTODOS
    
    
    //Método para imprimir a árvore
    
    public void imprimir(){
        imprimir(raiz);
    }
    private void imprimir(NoBinario no){
        System.out.println("No: " + no.getInfo());
        if(no.getEsquerda() != null){
            imprimir(no.getEsquerda());
        }
        if(no.getDireita() != null){
            imprimir(no.getDireita());
        }
    }
    
    public int buscar(int valor){
        return buscar(valor, raiz, 0);
    }
    
    //Busca o nó com o valor do parametro e retorna a profundidade
    private int buscar(int valor, NoBinario no, int profundidade){
        int resposta = -1;
        if((int)no.getInfo() == valor){
            return profundidade;
        }
        else{
            //verifica se os nós da esquerda ou da direita não e nulo
            //senão for nulo, busca nesses nós
            if(valor < (int)no.getInfo() && no.getEsquerda() != null){
                resposta = buscar(valor, no.getEsquerda(), profundidade++);
            }
            else if(no.getDireita() != null){
                resposta = buscar(valor, no.getDireita(), profundidade++);
            }
            return resposta;
        }
    }
    
    
    public void addNoOrdenado(int valor, NoBinario no){
        //Se o valor for menor que o valor do nó
        //adicionamos a esquerda senão a direita
        if(valor < (int)no.getInfo()){
            if(no.getEsquerda() == null){
                no.setEsquerda(new NoBinario(valor, null, null));
            }
            else{
                addNoOrdenado(valor, no.getEsquerda());
            }
        }
        else{
            if(no.getDireita() == null){
                no.setDireita(new NoBinario(valor, null, null));
            }
            else{
                addNoOrdenado(valor, no.getDireita());
            }
        }
    }
    
    
}
