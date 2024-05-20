/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersistenciaDados;

import java.io.IOException;

/**
 *
 * @author Alunos
 */
public class TesteMotocicleta {
    public static void main(String[] args) {
        Motocicleta motoca = new Motocicleta(1,"Honda", "Cg 150", 100);
        Motocicleta motoca2 = null;
        
        System.out.println("Velocidade atual: " + motoca.getVelocidade());
        motoca.alterarVelocidade(1.5f);
        System.out.println("Velocidade Atual: " + motoca.getVelocidade());
        
        try {
            Serializador.gravar("motoca.dat", motoca);
        } catch (IOException ex) {
            System.out.println("Erro Gravar: " + ex.getMessage());
        }
        
        motoca.alterarVelocidade(1.5f);
        System.out.println("Velocidade Atual: "+ motoca.getVelocidade());
        
        
        try {
            motoca2 = (Motocicleta)Serializador.ler("motoca.dat");
        } catch (Exception ex) {
            System.out.println("Erro Ler: " + ex.getMessage());
        }
        
        System.out.println("Motoca 2 = " + motoca2.getVelocidade());
    }
}
