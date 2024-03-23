/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class ListaLigada {
    // Atributos
    
    No PrimeiroNo;
    No ultimoNo;
    int tamanhoLista;
    
    public ListaLigada(){
        tamanhoLista=0;
        PrimeiroNo = ultimoNo = null;
    }
    public void addNo(Object elemento){
        // Adiciona um nó na última posição
        No aux = new No(elemento, null);
            // Para o primeiro nó
        if(PrimeiroNo == null && ultimoNo == null){
            PrimeiroNo = ultimoNo = aux;
            tamanhoLista ++;
        }
            // Para os demais nós
        else{    
            ultimoNo.setProximoNo(aux);
            tamanhoLista ++;
        }
        
    }
    public void addNo(Object elemento, int indice){
        /* Método deverá adicionar o elemento na posição 
        indicada pelo indice*/
    }
    public void remover(int indice){
        /* return Object 
            Remove o elemento indicado pelo indice
        e retorna esse objeto*/
    }
    public Object get(int indice){
        // Recebe o índice em zero
        // e retorna o campo Info de Nó
        // correspondente
        
        /* Irei criar um método que irá percorrer
        a lista, retornando o nó correspondente
        ao indice solicitado.*/
        if(indice>=0 && indice < tamanhoLista)
            return percorreLista(indice).getInfo();
        else return null;
        
    }
    public String concatenaNos(){
        /* Retorna o Info de todos os Nós concatenados */
        return "";
    }

    private No percorreLista(int indice) {
        No aux = PrimeiroNo;
    
        for(int i = 0; i <= indice; i++){
            aux = aux.getProximoNo();
            
        }
        return aux;
    
    }
}
