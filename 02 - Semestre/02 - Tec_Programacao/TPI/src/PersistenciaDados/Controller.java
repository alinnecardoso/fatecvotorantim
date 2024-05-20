/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaDados;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

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
    public int getSizeListaMotocicleta(){
        return listaMotocicleta.size();
    }
    
    // MÉTODO PARA CADASTRAR A MOTOCICLETA
    //public List<Motocicleta> cadastrar(String marca, String modelo, float velocidade) {
    //    Motocicleta novaMotocicleta = new Motocicleta(marca, modelo, velocidade);
    //    listaMotocicleta.add(novaMotocicleta);
    //   return listaMotocicleta;
    //};

    // MÉTODO PARA CADASTRAR A MOTOCICLETA
    public Motocicleta cadastrar(int id, String marca, String modelo, float velocidade) {
        Motocicleta novaMotocicleta = new Motocicleta(id, marca, modelo, velocidade);
        if (existeId(id)) {
            System.err.println("ID ja existe!");
            return null;
    }
        
        //System.out.println("ID cadastrar: " + id);
        return novaMotocicleta;
    }
    // MÉTODO PARA VERIFICAR SE O ID EXISTE NA LISTA
    private boolean existeId(int id) {
        for (Motocicleta motocicleta : listaMotocicleta) {
            if (motocicleta.getId() == id) {
                return true;
            }
        }
        return false;
    }
    public List<Motocicleta> addLista(int id, String marca, String modelo, float velocidade){
        listaMotocicleta.add(cadastrar(id, marca, modelo, velocidade));
        //System.out.println("ID addList: " + id);
        return listaMotocicleta;
        
    }
    
    
    //MÉTODO PARA REMOVER UMA MOTOCICLETA POR ID
public List<Motocicleta> deletar(int id) {
    if (!existeId(id)) {
        System.err.println("ID nao encontrado!");
        return null;
    }
    for (int i = 0; i < listaMotocicleta.size(); i++) {
        Motocicleta motocicleta = listaMotocicleta.get(i);
        if (motocicleta.getId() == id) {
            //System.out.println("id da motocicleta deletada: "+ motocicleta.getId());
            listaMotocicleta.remove(i);
            return listaMotocicleta;
        }
    }
    return listaMotocicleta;
}
    
    
    public void gravarMotocicleta(int id, String endereco, Object Motocicleta) throws IOException{
        Serializador.gravar(endereco, Motocicleta);
    }
    
    
    public void lerMotocicleta(String endereco) throws IOException, FileNotFoundException, ClassNotFoundException{
        Serializador.ler(endereco);
    }
    
    public DefaultTableModel listarMotocas() {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Marca");
        tableModel.addColumn("Modelo");
        tableModel.addColumn("Velocidade");
        
        for (int i = 0; i < listaMotocicleta.size(); i++) {
            Motocicleta motocicleta = listaMotocicleta.get(i);
            //System.out.println("listarMotoca ID: " + motocicleta.getId());
            Object[] row = { String.valueOf(motocicleta.getId()), motocicleta.getMarca(), motocicleta.getModelo(), motocicleta.getVelocidade()};
            tableModel.addRow(row);
        }
        

        return tableModel;
    }

    
}
