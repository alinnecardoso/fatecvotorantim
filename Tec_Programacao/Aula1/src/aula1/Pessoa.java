package aula1;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    
    //Atributos da classe
    String nome;
    int qtdFilhos, qtdIrmaos;
     String[] nomeFilhos;
     String[] nomeIrmaos;
     String cpf;
    
    /* Método construtor */
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf) {
        this(nome);//chama o construtor Pessoa(String nome)
        this.cpf = cpf;
    }
    public Pessoa(String nome, String cpf, String[] nomeFilhos, String[] nomeIrmaos) {
        this(nome, cpf); //chama o construtor Pessoa(String nome, String cpf)
        this.nomeIrmaos = new String[20];
        this.nomeFilhos = new String[20];
    }


    /****************************************/
    
    /***** Métodos Setter Getter
    
    /* resolver o exercício com get e set
        realizar isso com irmãos e filhos
        agora as variáveis estão privadas
        deve-se usar esse novo método para resolver*/
    
    // CPF
    public void setCpf(String cpf) {
        if (this.cpf == null) {
            this.cpf = cpf;
        }
    }
    public String getCpf() {
        return this.cpf;
    }
    
    // FILHOS
    public void setNomeFilhos(String[] nomeFilhos) {
        if (this.nomeFilhos == null) {
            this.nomeFilhos = nomeFilhos;
        }
    }
    public String[] getNomeFilhos(){
        return this.nomeFilhos;
    }
    
    // IRMÃOS
    public void setNomeIrmaos(String[] nomeIrmaos) {
        if (this.nomeIrmaos == null) {
            this.nomeIrmaos = nomeIrmaos;
        }
    }

    public String[] getNomeIrmaos() {
        return this.nomeIrmaos;
    }
    /*Método "Apresentar", responde com o Nome concatenado com a quantidade de Filhos.*/
    
    public String Apresentar() {
        return nome + " possui " + nomeFilhos.length + " filhos e " + nomeIrmaos.length + " irmãos.";
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
