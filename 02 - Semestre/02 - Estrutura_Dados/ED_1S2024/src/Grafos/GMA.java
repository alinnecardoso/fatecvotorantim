/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos;

/**
 *
 * @author Alunos
 */
public class GMA {
    //ATRIBUTOS
    private Integer matriz[][];
    private Object listaVertices[];
    private boolean grafoDirecional;
    private int qtdVertices;
    private int indexVertice;
    
    //CONSTRUTOR
    public GMA(int qtdVertices, boolean grafoDirecional){
        this.qtdVertices = qtdVertices;
        matriz = new Integer[qtdVertices][qtdVertices];
        listaVertices = new Object[qtdVertices];
        this.grafoDirecional = grafoDirecional;
        indexVertice = 0;
    }

    public Integer[][] getMatriz() {
        return matriz;
    }

    public Object[] getListaVertices() {
        return listaVertices;
    }
    
    public void setMatriz(Integer[][] matriz) {
        this.matriz = matriz;
    }

    public void setListaVertices(Object[] listaVertices) {
        this.listaVertices = listaVertices;
    }
    
    
    //MÉTODOS
    public void adicionarVertices(Object vertice){
        if(indexVertice<listaVertices.length){
            listaVertices[indexVertice] = vertice;
            indexVertice++;
        }
        /*if(listaVertices.length < qtdVertices){
            for(int i=0; i<listaVertices.length; i++){
                listaVertices[i] = vertice;
            }
        }
        else
            System.out.println("Erro ao adicionar o Vertice");
        */
    }
    
    public void removerVertices(Object vertice){
        int iVertice = procuraVertice(vertice);
        if(iVertice != -1){
            //remove o vertice da lista
            listaVertices[iVertice] = null;
            //remove da matriz
            for(int iDestino=0; iDestino<matriz.length; iDestino++){
                    matriz[iVertice][iDestino] = null;
                    matriz[iDestino][iVertice] = null;
                    
            }
        }
        /*if(listaVertices.length != 0){
            for(int i=0; i<listaVertices.length; i++){
                
                if(vertice == listaVertices[i]){
                    listaVertices[i] = null;
            }
        }
        }
        */
    }
    public int procuraVertice(Object vertice){
        int index = 0;
        for(Object aux: listaVertices){ //aux = lista[i]
            if(aux.equals(vertice))
                return index;
            index++;
        }
        
        return -1;
    }
    //Adicionar Arestas sem Peso
    //Atribuir valor zero ao peso
    public void adicionarAresta(Object origem, Object destino){
        adicionarAresta(origem, destino, 0);
            
    }
    
    // Adicionar Arestas com Peso
    public void adicionarAresta(Object origem, Object destino, int peso){
        int iOrigem, iDestino;
        iOrigem = procuraVertice(origem);
        iDestino = procuraVertice(destino);
        
        //grafo é direcional
        if(grafoDirecional){
            matriz[iOrigem][iDestino] = peso;
            matriz[iDestino][iOrigem] = peso;
        }
        //grafo não é direcional
        else{
            matriz[iOrigem][iDestino] = peso;
        }
    }
    
    public void imprimirMatrixAdj(){
        //Imprime a matriz de adjacencias utilizando
        //System.out.println();
        /*
        |   Vertice   |    0    |    1    |    2    |
        |      0      |
        |      1      |
        |      2      |
        
        */
    }
}
