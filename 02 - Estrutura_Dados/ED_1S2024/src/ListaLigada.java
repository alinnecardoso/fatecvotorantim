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
    
    private No primeiroNo; // Referência para o primeiro nó
    private No ultimoNo; // Referência para o último nó
    private int tamanhoLista; // Tamanho da lista (quantidade de nós)
    
    // Construtor da classe ListaLigada
    public ListaLigada(){
        tamanhoLista=0; // Inicializa o tamanho da lista como 0
        primeiroNo = ultimoNo = null; // Inicializa as referências como nulas
    }
    
    // Método para adicionar um nó no final da lista
    public void addNo(Object elemento){
        
        // Adiciona um nó na última posição
        No aux = new No(elemento, null); // Cria um novo nó com o elemento fornecido
        
            // Para o primeiro nó
            // Se a lista estiver vazia, define o novo nó como o primeiro e o último nó
        if (primeiroNo == null && ultimoNo == null) {
            primeiroNo = ultimoNo = aux;
            tamanhoLista++;
        }
            // Para os demais nós
            // Caso contrário, adiciona o novo nó após o último nó atual
        else {
            ultimoNo.setProximoNo(aux);
            ultimoNo = aux;  // Atualiza a referência para o último nó
            tamanhoLista++;
        }
        
    }
    
    // Método para adicionar um nó em uma posição específica (dada pelo índice)
    public void addNo(Object elemento, int indice){
        /* Método deverá adicionar o elemento na posição 
        indicada pelo indice*/
        
        if (indice >= 0 && indice <= tamanhoLista) {
            No aux = new No(elemento, null); // Cria um novo nó com o elemento fornecido
            
            // Se o índice for 0, insere o novo nó como o novo primeiro nó
            if (indice == 0) {
                aux.setProximoNo(primeiroNo);
                primeiroNo = aux;
            }
            
            // Caso contrário, encontra o nó no índice anterior e atualiza as referências
            else {
                No anterior = percorreLista(indice - 1);
                aux.setProximoNo(anterior.getProximoNo());
                anterior.setProximoNo(aux);
            }
            tamanhoLista++;
        }
    
    }
    
    // Método para remover um nó em uma posição específica (dada pelo índice)
    public Object remover(int indice){
        if (indice >= 0 && indice < tamanhoLista) {
            
            // Se o índice for 0, remove o primeiro nó e atualiza as referências
            if (indice == 0) {
                No removido = primeiroNo;
                primeiroNo = primeiroNo.getProximoNo();
                tamanhoLista--;
                return removido.getInfo();
            } 
            
             // Caso contrário, encontra o nó no índice anterior e atualiza as referências
            else {
                No anterior = percorreLista(indice - 1);
                No removido = anterior.getProximoNo();
                anterior.setProximoNo(removido.getProximoNo());
                if (indice == tamanhoLista - 1) {
                    ultimoNo = anterior;
                }
                tamanhoLista--;
                return removido.getInfo();
            }
        }
        return null;
    }
    
    // Método para obter o elemento em uma posição específica (dada pelo índice)
    public Object get(int indice){
        // Recebe o índice em zero
        // e retorna o campo Info de Nó
        // correspondente
        
        /* Irei criar um método que irá percorrer
        a lista, retornando o nó correspondente
        ao indice solicitado.*/
        if (indice >= 0 && indice < tamanhoLista) {
            return percorreLista(indice).getInfo();
        }
        return null;
        
    }
    
    // Método privado para percorrer a lista e encontrar o nó no índice dado
    private No percorreLista(int indice) {
        No aux = primeiroNo;
    
        for(int i = 0; i < indice; i++){
            aux = aux.getProximoNo();
            
        }
        return aux;
    
    }
}

