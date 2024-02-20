package aula1;

/**
 *
 * @author Alunos
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa mae;
        mae = new Pessoa();
        mae.nome = "Alinne";
        mae.qtdFilhos = 0;
        mae.qtdIrmaos = 3;
        System.out.println("A " + mae.Apresentar());
        
        Pessoa pai = new Pessoa();
        pai.nome = "Gabriel";
        pai.qtdFilhos = 0;
        pai.qtdIrmaos = 2;
        
        System.out.println("O " + pai.Apresentar());
        
        
        pai.nomeFilhos[0] = "Maria";
        pai.nomeFilhos[1] = "João";
        
        System.out.println(pai.ApresentarFilhos());
                
    }
    
}
