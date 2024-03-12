

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Pessoa voDoJoao = new Pessoa("Ana");
        // apenas o nome da mãe do joão
        // não tem necessidade da mãe do João ter o nome da sua mãe como parâmetro
        Pessoa mae = new Pessoa("Maria"); //voDoJoao -> parametro (nome, mae))
        
        Pessoa pai = new Pessoa("José");
        
        // João está recebendo 3 parâmetros (nome, mae, pai)
        Pessoa Joao = new Pessoa("João", mae, pai);
        
        // Irmãos João
        Pessoa irmaoJoao = new Pessoa("Jorel", mae);
        Pessoa irmao2 = new Pessoa("Rafael", mae);
        Pessoa irmao3 = new Pessoa("Matheus", mae);
        
         // Adiciona irmãos a João
        Joao.addIrmao(irmaoJoao);
        
        Joao.addIrmao(irmao2);
        
        Joao.addIrmao(irmao3);
        
        
        // Nome João
        System.out.println("Nome: " + Joao.getNome());
        //Joao.setNome("João dos Santos");
        // System.out.println("Nome: " + Joao.getNome());
        
        // Mãe João
        
        System.out.println("Mãe: " + Joao.getMae().getNome());
            // Adiciona Filhos
        //Joao.addIrmao(irmaoJoao);
        
        //maeDoJoao.addFilho(irmao2);
        
        //maeDoJoao.addFilho(irmao3);
        
        //maeDoJoao.addFilho(Joao);
        
        
        // Vó João
        //System.out.println("Vó: " + Joao.getMae().getMae().getNome());
        
        // Pai João
        System.out.println("Pai: " + Joao.getPai().getNome());
        
        //Lista filhos
        System.out.println(mae.getNome() + " e " + pai.getNome() + " " + mae.retornaListaFilho());
        
        //Lista Irmãos
        System.out.println(Joao.getNome() + " " + Joao.retornaListaIrmaos());
        
    }
    
}
