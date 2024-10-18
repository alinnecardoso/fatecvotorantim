/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class USUARIOS {
    private String id;
    private String senha;
    private int numAge;
    private int numCC;

    public USUARIOS(String id, String senha, int numAge, int numCC) {
        this.id = id;
        this.senha = senha;
        this.numAge = numAge;
        this.numCC = numCC;
    }
    
    public String dadosSQLInsert(){
        String dadosUsuarios;
        dadosUsuarios = "'"
                + this.getId() + "','"
                + this.getSenha() + "','"
                + this.getNumAge() + "','"
                + this.getNumCC() + "'";
        return dadosUsuarios;
    }

    public USUARIOS() {
    }

    public String getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }

    public int getNumAge() {
        return numAge;
    }

    public int getNumCC() {
        return numCC;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public void setNumCC(int numCC) {
        this.numCC = numCC;
    }
    
    
}
