package TesteAula06;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Aula06.ContaBancaria;
import Aula06.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class Aula06 {
    
    @Test
    public void Aula06() {
        
        //Instanciar Cliente
        Cliente cliente = new Cliente("Alinne", "111.111.111-11", "Avenida Santos Dummont");
            //Nome Cliente
        System.out.println("Cliente: " + cliente.getNome());
            //Endereço Cliente
        System.out.println("Cliente: " + cliente.getEndereco());
            //CPF Cliente
        System.out.println("Cliente: " + cliente.getCpf());
        
        //Instanciar Conta
        ContaBancaria conta = new ContaBancaria(cliente, "CC", 1000, "Aberta");
            //Nome do objeto cliente
        System.out.println("Nome do objeto cliente: " + conta.getCliente().getNome());
            //Tipo da Conta
        System.out.println("Tipo da Conta: " + conta.getTipoConta());
            //Saldo da Conta
        System.out.println("Saldo da Conta: R$" + conta.getSaldoConta());
            //Status da conta
        System.out.println("Status da Conta: " + conta.getStatusConta());
        
        
        //Depositar um valor na Conta
        System.out.println("Valor depositado: R$" + conta.depositarValor(1000));
        
        
        //Retirar um valor na Conta
        System.out.println("Valor retirado: R$" + conta.retirarValor(200));
        
        //Exibir a taxa
        System.out.println("Taxa: R$" + conta.cobrarTaxa());
        
        //Verificar Saldo: retorna o valor atual do saldo da conta
        System.out.println("Saldo atual da conta: " + conta.verificarSaldo());
        
        //Retorna na forma de texto as operações de deposito, saque e taxas
        System.out.println("Extrato: " + conta.extrato);
    }   
    
}
