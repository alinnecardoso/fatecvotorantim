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
    
    
    /*Método "Apresentar", responde com o Nome concatenado com a quantidade de Filhos.*/
    
    public String Apresentar(){
        return nome + " possui " + qtdFilhos + " filhos e " + qtdIrmaos + " irmãos.";
    }
        
    public String ApresentarFilhos(){
        String resposta = "Meu filhos são ";
        int qtdFilhosAux = 0;
        
        
        for(int i =0;i<20; i++){
            
            if(nomeFilhos[i] !=  null){
                qtdFilhosAux ++;
                resposta += nomeFilhos[i] + ", ";
                
                
            }
        if(qtdFilhosAux>0)
            return resposta + "QTD Filhos: " + qtdFilhosAux;
        else
            return "Não tem filhos!";
        }
        
        return resposta + "QTD Filhos: " + qtdFilhosAux;
           
    
    }
}
