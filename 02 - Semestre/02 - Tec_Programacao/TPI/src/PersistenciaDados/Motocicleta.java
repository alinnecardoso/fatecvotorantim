/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersistenciaDados;

import java.io.Serializable;

/**
 *
 * @author Alunos
 */
public class Motocicleta implements Serializable{
    //ATRIBUTOS DA CLASSE
    private String marca, modelo;
    private float velocidade;
    
    // CONSTRUTOR -> Constrói o objeto
    public Motocicleta(String marca, String modelo, float velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
    //MÉTODOS GETTER

    public float getVelocidade() {
        return velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    //MÉTODOS SETTER

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    
    
    // MÉTODOS
    public float alterarVelocidade(float fatorAceleracao){
        velocidade = velocidade * fatorAceleracao;
        return velocidade;
    }
    public float parar(){
        velocidade = 0;
        return velocidade;
    }
}
