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
import javax.swing.table.TableModel;

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
    public Motocicleta cadastrar(String marca, String modelo, float velocidade) {
        Motocicleta novaMotocicleta = new Motocicleta(marca, modelo, velocidade);
        return novaMotocicleta;
    }
    public List<Motocicleta> addLista(String marca, String modelo, float velocidade){
        listaMotocicleta.add(cadastrar(marca, modelo, velocidade));
        return listaMotocicleta;
        
    }
    
    
    //MÉTODO PARA REMOVER UMA MOTOCICLETA POR ID
    public List<Motocicleta> deletar(int id) {
        for (int i = 0; i < listaMotocicleta.size(); i++) {
            Motocicleta motocicleta = listaMotocicleta.get(i);
            motocicleta.setId(id);
            System.out.println("ID in list: " + motocicleta.getId());
            if (motocicleta.getId() == id) {
                System.out.println("id da motocicleta deletada: "+ motocicleta.getId());
                listaMotocicleta.remove(id);
                return listaMotocicleta;
            }
        }
        return listaMotocicleta;
    }
    public DefaultTableModel upadteDeletelistarMotocas(){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Marca");
        tableModel.addColumn("Modelo");
        tableModel.addColumn("Velocidade");
        
        for (int i = 0; i < listaMotocicleta.size(); i++) {
            tableModel.removeRow(i-1);
        }
        

        return tableModel;
    }
    
    
    public void gravarMotocicleta(String endereco, Object Motocicleta) throws IOException{
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
            Object[] row = {i + 1, motocicleta.getMarca(), motocicleta.getModelo(), motocicleta.getVelocidade()};
            tableModel.addRow(row);
        }
        

        return tableModel;
    }

    
}
