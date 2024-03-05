

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
        
        Pessoa voDoJoao = new Pessoa("Ana");
        // apenas o nome da mãe do joão
        // não tem necessidade da mãe do João ter o nome da sua mãe como parâmetro
        Pessoa maeDoJoao = new Pessoa("Maria", voDoJoao);
        
        Pessoa paiDoJoao = new Pessoa("José");
        
        // João está recebendo 3 parâmetros (nome, mae, pai)
        Pessoa Joao = new Pessoa("João", maeDoJoao, paiDoJoao);
        
        Pessoa irmaoJoao = new Pessoa("Jorel", maeDoJoao);
        Pessoa irmao2 = new Pessoa("Rafael", maeDoJoao);
        
        // Nome João
        System.out.println("Nome: " + Joao.getNome());
        Joao.setNome("João dos Santos");
        System.out.println("Nome: " + Joao.getNome());
        
        // Mãe João
        
        System.out.println("Mãe: " + Joao.getMae().getNome());
        // Adiciona Filhos
        maeDoJoao.addFilho(irmaoJoao);
        
        maeDoJoao.addFilho(irmao2);
        
        //System.out.println("Filhos da " + Joao.getMae().getNome()+": ");
        //System.out.println(Joao.getMae().getListaFilhos()[0].getNome());
        
        // Vó João
        System.out.println("Vó: " + Joao.getMae().getMae().getNome());
        
        // Pai João
        System.out.println("Pai: " + Joao.getPai().getNome());
        
        //Lista filhos
        System.out.println(Joao.getMae().retornaListaFilho());
        
    }
    
}
