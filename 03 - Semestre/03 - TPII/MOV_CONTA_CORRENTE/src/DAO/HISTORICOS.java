/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class HISTORICOS {
    private int idHis;
    private String desHis;

    public HISTORICOS() {
    }

    public HISTORICOS(int idHis, String desHis) {
        this.idHis = idHis;
        this.desHis = desHis;
    }
    
    public String alteraDadosSQlValues(){
        String dadosClientes;
        dadosClientes = "ID_HIS='"
                + this.getIdHis()+ "',DES_HIS='"
                + this.getDesHis()+ "'";
        
        return dadosClientes;
    }
    
    public String dadosSQLValues(){
        /* 
            private int idHis;
            private String desHis;
        */
        
        String dadosHistoricos;
        dadosHistoricos = "'"
                + this.getIdHis() + "','"
                + this.getDesHis() + "'";
        
        return dadosHistoricos;
    }

    public int getIdHis() {
        return idHis;
    }

    public String getDesHis() {
        return desHis;
    }

    public void setIdHis(int idHis) {
        this.idHis = idHis;
    }

    public void setDesHis(String desHis) {
        this.desHis = desHis;
    }
    
    
}
