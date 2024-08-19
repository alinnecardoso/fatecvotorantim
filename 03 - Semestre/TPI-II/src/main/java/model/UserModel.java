/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author guest
 */
public class UserModel {
    //Atributos
    private Long id;
    private String usuario;
    private String senha;
    private String email;

    public UserModel(Long id, String usuario, String senha, String email) {
        this.id = id;
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
    }
    
    public Long getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
