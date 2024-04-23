/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProdutoMateriaPrima;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Testar Classe Imposto */
        Imposto imposto = new Imposto("ICMS", " Imposto sobre Operações de Mercadorias ou Serviços", 18);
        
        imposto.setNome("IPI");
        System.out.println("imposto: " + imposto.getNome());
        imposto.setDescricao("Imposto sobre Produtos Industrializados");
        System.out.println("imposto: " + imposto.getDescricao());
        imposto.setPercentual(30);
        System.out.println("imposto: " + imposto.getPercentual());
        
        /* Testar Classe MateriaPrima s/Lista de imposto*/
        MateriaPrima materiaPrima = new MateriaPrima("Cobre", "Descrição");
        System.out.println("\nMatéria prima: " + materiaPrima.getNome());
        System.out.println("Matéria prima: " + materiaPrima.getDescricao());
        
        /* Testar Classe Margem */
        Margem margem  = new Margem("Nome margem", "Descrição Margem", 20);
        System.out.println("\nMargem: " + margem.getNome());
        System.out.println("Margem: " + margem.getDescricao());
        System.out.println("Margem: " + margem.getPercentual() + "%");
    }
    
    
}
