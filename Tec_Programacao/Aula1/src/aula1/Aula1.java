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
        mae = new Pessoa("4444");
        mae.nome = "Alinne";
        mae.qtdFilhos = 2;
        mae.qtdIrmaos = 2;
        
        
//        
        System.out.println(mae.Apresentar());
        
        mae.nomeFilhos[0] = "Maria";
        mae.nomeFilhos[1] = "João";
        
        mae.nomeIrmaos[0] = "Rafael";
        mae.nomeIrmaos[1] = "Matheus";
        
        
        Pessoa pai = new Pessoa("Gabriel", "1234567");
        pai.qtdFilhos = 2;
        pai.qtdIrmaos = 1;
        
//        Apresenta o Pai
        System.out.println(pai.Apresentar() + "\n");
        
        
        pai.nomeFilhos[0] = "Maria";
        pai.nomeFilhos[1] = "João";
        
        pai.nomeIrmaos[0] = "Carol";
        
//        Apresenta Filhos
        System.out.println(pai.ApresentarFilhos()+"\n"+ mae.ApresentarFilhos() + "\n");
        
//        Apresenta Irmãos
        System.out.println(mae.ApresentarIrmaos());
        
        System.out.println(pai.ApresentarIrmaos() + "\n");
        
//        Mostrar CPF Pai
        System.out.println("CPF do pai: " + pai.getCpf());
        pai.setCpf("00000");
        System.out.println("CPF do pai Novo: " + pai.getCpf());
    }
    
}
