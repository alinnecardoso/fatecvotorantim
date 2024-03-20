
public class Pessoa {
    // Atributos da Classe
    private String nome;
    private String cpf;
    private String genero;
    private String telefone;
    private Pessoa mae;
    private Pessoa pai;
    private Pessoa[] listaFilhos = new Pessoa[10];
    private int qtdFilhos=0;
    //**********************//
    
    // Construtor
        // construtor n�o tem retorno (void, int, char etc)
        // exatamente o mesmo nome da classe
        // atributo global != do atributo construtor
        // O que define a asssinatura do metodo é  o nome do método + o tipo dentro do parametro
    
    // *** Construtor 1 *** //
    public Pessoa(String nome){
        // "this" acessa a vari�vel dele mesmo, a vari�vel global
        this.nome = nome;
    }// encerra o construtor e apaga as vari�veis dentro dele
    
    // *** Construtor 2 *** //
    public Pessoa(String nome, Pessoa mae){
        this(nome); // chama o construtor 1
        this.mae = mae;
    }
    
    // *** Construtor 3 *** //
    public Pessoa(String nome, Pessoa mae, Pessoa pai){
        this(nome, mae);
        this.pai = pai;
        
    }
    
    
    // Métodos de acesso aos atributos privados
    
    // ****** metódo Get ******//
    
    // NOME
    public String getNome(){
        return this.nome;
    }
    // MÃE
    public Pessoa getMae(){
        return this.mae;
    }
    // PAI
    public Pessoa getPai(){
        return this.pai;
    }
    // LISTA FILHOS
    public Pessoa[] getListaFilhos(){
        return listaFilhos;
    }
    
    // ****** metódo Set ******//
    
    // NOME
    public void setNome(String nome){
        this.nome = nome;
    }
    // MÃE
    public void setMae(Pessoa mae){
        this.mae = mae;
    }
    // PAI
    public void setPai(Pessoa pai){
        this.pai = pai;
    }
    
    
    //****** Método para adicionar um filho a lista ******//
    public void addFilho(Pessoa filho){
        listaFilhos[qtdFilhos]=filho;
        qtdFilhos++;
    }
    public String retornaListaFilho(){
        // Este método deve retornar uma String com todos os filhos concatenados
        // e separados por ", "
        this.qtdFilhos = qtdFilhos;
        String retorno = "";
        for(int i=0; i<qtdFilhos; i++){
            retorno += listaFilhos[i].getNome() + ", ";
            
            if(listaFilhos[i] == null){
                retorno += listaFilhos[i].getNome() + ". ";
            }
        }
        
        
        return retorno;
    }
}
