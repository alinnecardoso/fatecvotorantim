/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeiraoVeiculos.Controller;

import FeiraoVeiculos.Model.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Controlador {
    private int id;
    private List<Veiculo> listaVeiculo;
    private List<Pessoa> listaPessoa;
    
    public Controlador(){
        listaPessoa = new ArrayList<Pessoa>();
        listaVeiculo = new ArrayList<Veiculo>();
    }
    
    //Método para Cadastrar Cliente
    public void cadastrarCliente(String nome, String telefone, String cpf, float valorMax, float valorMin,
    String tipoVeiculo){
        listaPessoa.add(new Cliente(nome, telefone, cpf, valorMax, valorMin, tipoVeiculo));
    }
    
    //MÉTODOS
    /*cadastrar Cliente
    Cadastrar Veiculo
    Editar Cliente (Seleciona o item e modifica -> indexOf(): retorna o indice da lista em que o objeto do paramentro estiver)
    Editar Veiculo
    Salvar
    Abrir*/
    
    
}
