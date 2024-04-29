/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula06;

/**
 *
 * @author Alunos
 */
public class ContaBancaria {
    //ATRIBUTOS
    private Cliente cliente;
    private String tipoConta;
    private float saldoConta;
    private String statusConta;
    public float taxa = 0;
    public String extrato = "Meu extrato";
    
    //CONSTRUTORES

    public ContaBancaria(Cliente cliente){
        this.cliente = cliente;
    }
    public ContaBancaria(Cliente cliente, String tipoConta){
        this(cliente);
        this.tipoConta = tipoConta;
    }
    public ContaBancaria(Cliente cliente, String tipoConta, float saldoConta){
        this(cliente, tipoConta);
        this.saldoConta = saldoConta;
    }
    public ContaBancaria(Cliente cliente, String tipoConta, float saldoConta, String statusConta){
        this(cliente, tipoConta, saldoConta);
        this.statusConta = statusConta;
    }
    
    
    //MÉTODOS GET

    public Cliente getCliente() {
        return cliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public String getStatusConta() {
        return statusConta;
    }
    
    //MÉTODOS SET

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void setStatusConta(String statusConta) {
        this.statusConta = statusConta;
    }
    
    //MÉTODOS
        //Despositar valores incrementando o saldo
    public float depositarValor(float valor){
        saldoConta = valor + saldoConta;
        registraExtrato("Depósito: " + valor);
        return valor;
    }
        //Retirar valores, decrementando o saldo
    public float retirarValor(float valor){
        saldoConta = saldoConta - valor;
        registraExtrato("saque: " + valor);
        return valor;
    }
        //Cobrar Taxa
    public float cobrarTaxa(){
        
        if (tipoConta == "CC"){
            taxa = (float) 19.99;
            saldoConta = saldoConta - taxa;
        }
        if(tipoConta == "CP"){
            taxa = (float) 9.99;
            saldoConta = saldoConta - taxa;
        }
    return taxa;
    }
        //Verificar Saldo
    public float verificarSaldo(){
        return saldoConta;
    }
    
        //Extrato da Conta
    public String extratoConta(){
        return extrato; 
    }
    
    private void registraExtrato(String mensagem){
        extrato = extrato +"\n"+ mensagem;
    }
    
}
