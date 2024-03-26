/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDuplaLigada;

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
}   }
