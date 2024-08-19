/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import model.UserModel;
import service.UserService;

/**
 *
 * @author guest
 */
public class UserController {
    //Atributos
    private UserService userService = new UserService();
    
    
    //Métodos
    
    //Criar Usuário
    public UserModel createUser(String usuario, String senha, String email){
        UserModel user = new UserModel(null, usuario, senha, email);
        UserModel createdUser = userService.saveUser(user);
        System.out.println("Usuário criado: " + createdUser.getId());
        return createdUser;
    }
    
    //Listar Usuário List<UserModel>
    public void  listUsers(){
        List<UserModel> users = userService.getAllUsers();
        System.out.println("Usuários:");
        users.forEach(System.out::println);
    }
    
    // Verifica se o Usuário existe pelo ID
    public boolean checkUserExists(Long userId) {
        
        UserModel user = userService.getUserById(userId);
        boolean exists = user != null;
        System.out.println("Usuário com ID " + userId + (exists ? " existe." : " não existe."));
        return exists;
    }
    
    // Autenticar Usuário
    public boolean authenticateUser(String email, String senha) {
        return userService.authenticateUser(email, senha);
        
    }
    
    

    
    
}
