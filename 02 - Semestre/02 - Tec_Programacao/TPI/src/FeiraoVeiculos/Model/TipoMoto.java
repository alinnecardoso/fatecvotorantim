/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeiraoVeiculos.Model;

/**
 *
 * @author Alunos
 */
public class TipoMoto extends TipoVeiculo{
    private String tipoMotos;
    
    public TipoMoto(String nome, String tipoMotos){
        super(nome);
        this.tipoMotos = tipoMotos;
    }
}
