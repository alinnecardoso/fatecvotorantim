/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaDados;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alinn
 */
public class Controller {
    //ATRIBUTOS DO CONTROLLER
    List<Motocicleta> listaMotocicleta;
    
    //CONSTRUTOR DA CLASSE
    public Controller() {
        listaMotocicleta = new ArrayList<>();
    }
    
    // MÉTODO PARA CADASTRAR A MOTOCICLETA
    //public List<Motocicleta> cadastrar(String marca, String modelo, float velocidade) {
    //    Motocicleta novaMotocicleta = new Motocicleta(marca, modelo, velocidade);
    //    listaMotocicleta.add(novaMotocicleta);
    //   return listaMotocicleta;
    //};

    // MÉTODO PARA CADASTRAR A MOTOCICLETA
    public Motocicleta cadastrar(String marca, String modelo, float velocidade) {
        Motocicleta novaMotocicleta = new Motocicleta(marca, modelo, velocidade);
        return novaMotocicleta;
    }
    public List<Motocicleta> addLista(String marca, String modelo, float velocidade){
        listaMotocicleta.add(cadastrar(marca, modelo, velocidade));
        return listaMotocicleta;
        
    }
    
    
    //MÉTODO PARA REMOVER UMA MOTOCICLETA POR ID
    // O ID será a ordem em que foi adicionado à lista -> Ainda não sei fazer por ID
    public List<Motocicleta> deletar(String marca, String modelo, float velocidade) {
        for(int i=0;i<listaMotocicleta.size();i++){
            if(listaMotocicleta.get(i).getMarca().equals(marca) &&
                listaMotocicleta.get(i).getModelo().equals(modelo)&&
                listaMotocicleta.get(i).getVelocidade() == velocidade){
                
                listaMotocicleta.remove(i);
                return listaMotocicleta;
            }
        }
        return listaMotocicleta;
    }
    
    public void gravarMotocicleta(String endereco, Object Motocicleta) throws IOException{
        Serializador.gravar(endereco, Motocicleta);
    }
    
    
    public void lerMotocicleta(String endereco) throws IOException, FileNotFoundException, ClassNotFoundException{
        Serializador.ler(endereco);
    }
    
    
}
