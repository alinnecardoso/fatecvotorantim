/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDuplaLigada;

import ListaDuplaLigada.TipoOrdenacao.*;
import static ListaDuplaLigada.TipoOrdenacao.TipoOrdenacao.CRESCENTE;
import static ListaDuplaLigada.TipoOrdenacao.TipoOrdenacao.DECRESCENTE;

/**
 *
 * @author alinn
 */
public class ListaDuplamenteLigada {
    
    //ATRIBUTOS
    
    NoDuplo primeiroNo; // Referência ao primeiro nó
    NoDuplo ultimoNo; // Referência ao último nó
    int tamanhoLista; //Quantidade de nós (Tamanho da Lista)
    
    
    
    //CONSTRUTOR DA CLASSE ListaDuplamenteLigada
    public ListaDuplamenteLigada(){
        tamanhoLista=0; //Inicializa o tamanho da lista como 0
        primeiroNo = ultimoNo = null; // Inicializa as referências como nulas
    }
    
    //MÉTODOS
    
        //Método adiciona um novo nó no final da lista
    public void adicionar(Object elemento){
        NoDuplo aux = new NoDuplo(elemento, null); //Cria um novo nó com o elemento fornecido
        
            //Para o primeiro nó
            /* Se a lista estiver vazia,
               define um novo nó como
               o primeiro e o último nó*/ 
        if(primeiroNo == null && ultimoNo == null){
           primeiroNo = ultimoNo = aux;
           tamanhoLista++;
        }
            //Para os demais nós
            // Caso contrário, adiciona o novo nó após o último nó atual
        else{
            ultimoNo.setProximoNo(aux);
            ultimoNo = aux; // Atualiza a referência para o último nó
            tamanhoLista++;
        }
    }
    
    //Método para adicionar um nó em uma posição específica(dada pelo índice)
    public void adicionar(Object elemento, int indice){
        NoDuplo aux = new NoDuplo(elemento, null); // Cria um novo nó com o elemento fornecido
        
        // Se o indice for 0, insere o novo nó como o novo primeiro nó
        if (indice >= 0 && indice <= tamanhoLista){
            aux.setProximoNo(primeiroNo);
            primeiroNo = aux;
        }
        
        // Caso contrário, encontra o nó no índice anterior e atualiza as referências
        else{
            NoDuplo anterior = percorreLista(indice - 1);
            aux.setProximoNo(anterior.getProximoNo());
            anterior.setProximoNo(aux);
        }
        tamanhoLista++;
    }
    
    // Método para remover um nó um uma posição específica (dada pelo índice)
    public Object remover(int indice){
        if (indice >= 0 && indice < tamanhoLista){
            
            // Se o índice for 0, remove o primeiro nó e atualiza as referências
            if(indice == 0){
                NoDuplo removido = primeiroNo;
                primeiroNo = primeiroNo.getProximoNo();
                tamanhoLista--;
                return removido.getInfo();
            }
            
            // Caso contrário, encontra o nó no índice anterior e atualiza as refências
            else{
                NoDuplo anterior = percorreLista(indice - 1);
                NoDuplo removido = anterior.getProximoNo();
                anterior.setProximoNo(removido.getProximoNo());
                
                if(indice == tamanhoLista - 1){
                    ultimoNo = anterior;
                }
                tamanhoLista--;
                return removido.getInfo();
            }
        }
        return null;
    }
    
    // Retorna a informação do nó definido pela posição
    public Object getLista(int indice){
        /* Recebe o índice em zero e retorna
           o campo Info de Nó correspondente */
        
        /* Percorre a lista e retorna o nó correspondente
           ao índice solicitado.*/
        if(indice >= 0 && indice < tamanhoLista){
            return percorreLista(indice).getInfo();
        }
        return null;
    }
    
    //Método privado para percorrer a lista e encontrar o nó no índice dado
    public NoDuplo percorreLista(int indice){
        NoDuplo aux = primeiroNo;
        
        for(int i = 0; i < indice; i++){
            aux = aux.getProximoNo();
        }
        return aux;
    }
    
    // Método que retorna a quantidade de elementos da lista
    public int tamanhoLista(){
        return tamanhoLista;
    }
    
    // Método que retorna um String com as informações do primeiro ao último item concatenado
    public String imprimirLista(){
        
        String listaConcatenada = ""; //Inicializa a String Vazia
        
        NoDuplo aux = primeiroNo; // Começa com o primeiro Nó
        
        for(int i=0;i<tamanhoLista;i++){
            
            if(aux.getProximoNo() != null){
                listaConcatenada += aux.getInfo() + ", ";// Concatena a informação do nó atual à lista
            }
            else{
                return listaConcatenada + (aux.getInfo() + ".");// Adiciona o último item com um ponto final
            }
            aux = aux.getProximoNo(); //avança para o próximo nó

            }
        return listaConcatenada; //Retorna a lista concatenada

    }
    
    // método que adiciona valores numéricos em ordem crescente ou decrescente
    public void adicionarOrdenado(int valor, TipoOrdenacao tipo){
       NoDuplo novoNo = new NoDuplo(valor, null);

        if (primeiroNo == null) {
            // Se a lista estiver vazia, insere o novo nó como o primeiro e o último nó
            primeiroNo = ultimoNo = novoNo;
        } else {
            NoDuplo atual = primeiroNo;
            NoDuplo anterior = null;

            // Percorre a lista até encontrar a posição correta para inserir o novo nó
            
            while (atual != null) {
                if 
                (
                (tipo == CRESCENTE && valor < atual.getInfo()) 
                        ||
                (tipo == DECRESCENTE && valor > atual.getInfo())
                        
                )
                {break;
                }
                anterior = atual;
                atual = atual.getProximoNo();
            }

            if (anterior == null) {
                // Inserção no início da lista
                novoNo.setProximoNo(primeiroNo);
                primeiroNo = novoNo;
            } 
            else {
                // Inserção após o nó anterior
                novoNo.setProximoNo(atual);
                anterior.setProximoNo(novoNo);
                if (atual == null) {
                    // Atualiza o último nó se o novo nó for o último da lista
                    ultimoNo = novoNo;
                }
            }
        }

        tamanhoLista++;
    }

    
}   


    
