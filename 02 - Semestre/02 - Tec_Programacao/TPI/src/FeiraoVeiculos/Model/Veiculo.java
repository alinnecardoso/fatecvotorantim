/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeiraoVeiculos.Model;

/**
 *
 * @author Alunos
 */
public class Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private String ano;
    private float valorVenda;

    public Veiculo(String marca, String modelo, String cor, String ano, float valorVenda) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valorVenda = valorVenda;
    }
    
    //Métodos Getters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getAno() {
        return ano;
    }

    public float getValorVenda() {
        return valorVenda;
    }
    
    //Métodos Setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    
}
