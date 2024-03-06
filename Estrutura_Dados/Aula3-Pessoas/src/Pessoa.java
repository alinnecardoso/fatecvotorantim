
public class Pessoa {
    // Atributos da Classe
    private String nome;
    private String cpf;
    private String genero;
    private String telefone;
    private Pessoa mae;
    private Pessoa pai;
    private Pessoa[] listaFilhos = new Pessoa[10];
    private Pessoa[] listaIrmaos = new Pessoa[10];
    private int qtdFilhos=0;
    private int qtdIrmaos=0;
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
        return this.listaFilhos;
    }
    // TELEFONE
    public String getTelefone(){
        return this.telefone;
    }
    // GÊNERO
    public String getGenero(){
        return this.genero;
    }
    // CPF
    public String getCpf(){
        return this.cpf;
    }
    //LISTA IRMÃOS
    public Pessoa[] getListaIrmaos(){
        return this.listaIrmaos;
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
    // LISTA FILHOS
    public void setListaFilhos(Pessoa[] listaFilhos){
        this.listaFilhos = listaFilhos;
    }
    // TELEFONE
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    //  GÊNERO
    public void setGenero(String genero){
        this.genero = genero;
    }
    // CPF
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    // LISTA IRMÃOS
    public void setListaIrmaos(Pessoa[] listaIrmaos){
        this.listaIrmaos = listaIrmaos;
    }
    
    
    //****** Método para adicionar um filho a lista ******//
    public void addFilho(Pessoa filho){
        listaFilhos[qtdFilhos]=filho;
        qtdFilhos++;
    }
    public String retornaListaFilho(){
        // Este método deve retornar uma String com todos os filhos concatenados
        // e separados por ", "
        String retorno = "";
        for (int i = 0; i < qtdFilhos; i++) {
            if (listaFilhos[i].getNome() != null) {
                retorno += listaFilhos[i].getNome();
                if (i < qtdFilhos - 1) {
                    retorno += ", ";
                }
            }
        }
        
        retorno += ".";
        return "Possui " + qtdFilhos + " filhos: " + retorno;
    }
    
    public void addIrmao(Pessoa irmao){
        listaIrmaos[qtdIrmaos]=irmao;
        qtdIrmaos++;
    }
    
    
    public String retornaListaIrmaos(){
        String retorno = "";
        for(int i = 0; i < qtdIrmaos; i++){
            if (listaIrmaos[i].getNome() != null){
                retorno += listaIrmaos[i].getNome();
                if (i < qtdIrmaos - 1) {
                    retorno += ", ";
                }
            }
        }
        retorno += ".";
         return "Possui " + qtdIrmaos + " irmãos: " + retorno;
    
    }
    
}
