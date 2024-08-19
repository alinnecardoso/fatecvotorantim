/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package teste;

import controller.UserController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import service.UserService;
import model.UserModel;

/**
 *
 * @author guest
 */
public class ControllerTest {
    // Criação do controlador e configuração inicial
        UserController userController = new UserController();
    
    public ControllerTest() {
        // Criação de usuários para teste
        UserService userService = new UserService();
        userService.saveUser(new UserModel(1L, "john_doe", "password123", "john@example.com"));
        userService.saveUser(new UserModel(2L, "jane_doe", "password456", "jane@example.com"));
        
        // Testando a autenticação
        userController.authenticateUser("john@example.com", "password123"); // Deve imprimir "Login Efetuado"
        userController.authenticateUser("john@example.com", "wrongpassword"); // Deve imprimir "E-mail ou senha incorretos"
        userController.authenticateUser("unknown@example.com", "password123"); // Deve imprimir "E-mail ou senha incorretos"
    }
}
