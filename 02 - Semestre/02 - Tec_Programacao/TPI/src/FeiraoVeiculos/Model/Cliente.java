/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeiraoVeiculos.Model;

/**
 *
 * @author Alunos
 */
public class Cliente extends Pessoa{
    private float valorMax;
    private float valorMin;
    private String tipoVeiculo;
    
    public Cliente(String nome, String telefone, String cpf, float valorMax, float valorMin,
    String tipoVeiculo) {
        super(nome, telefone, cpf);
        this.valorMax = valorMax;
        this.valorMin = valorMin;
        this.tipoVeiculo = tipoVeiculo;
    }
    
}
