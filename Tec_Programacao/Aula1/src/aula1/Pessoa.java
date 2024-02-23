package aula1;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    //Atributos da classe
    String nome;
    int qtdFilhos, qtdIrmaos;
    String[] nomeFilhos = new String[20];
    String[] nomeIrmaos = new String[20];
    
    
    /*Método "Apresentar", responde com o Nome concatenado com a quantidade de Filhos.*/
    
    public String Apresentar(){
        return "[1]" + nome + " possui " + qtdFilhos + " filhos e " + qtdIrmaos + " irmãos.";
    }
        
    public String ApresentarFilhos(){
        String resposta =  "[2]" + nome + " - Filhos: ";
        int qtdFilhosAux = 0;
        
        for(int i = 0; i < 20; i++){
            if(nomeFilhos[i] != null){
                qtdFilhosAux++;
                
                if(qtdFilhosAux > 1){
                    resposta += ", ";
                }
                resposta += nomeFilhos[i];
            }   
        }
        resposta += ".";

        if(qtdFilhosAux > 0){
            return resposta + "\n[2]QTD Filhos: " + qtdFilhosAux;
        }
        else{
            return "Não tem filhos!";
        }
    }
    
    public String ApresentarIrmaos(){
        String resposta = "[3]" + nome + " - Irmãos: ";
        int qtdIrmaosAux = 0;
        
        for(int i=0; i<20; i++){
            if(nomeIrmaos[i] != null){
                qtdIrmaosAux++;
                if(qtdIrmaosAux > 1){
                    resposta += ", "; 
                }
                resposta += nomeIrmaos[i];
            }
        }
        resposta += ".";
        
        if(qtdIrmaosAux > 0){
            return resposta + "\n[3]QTD Irmãos: " + qtdIrmaosAux;
        }
        else{
            return "Não tem irmãos!";
        }  
    }    
}
