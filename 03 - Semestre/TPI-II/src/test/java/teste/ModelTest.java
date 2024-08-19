/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package teste;

import model.UserModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author guest
 */
public class ModelTest {
    
    @Test
    public void testUserConstructorAndGetters() {
        // Arrange
        String usuario = "alinne";
        String senha = "password123";
        String email = "alinne@example.com";

        // Act
        UserModel user = new UserModel(null,usuario, senha, email);

        // Assert
        assertEquals(usuario, user.getUsuario(), "O usuário deve ser 'alinne");
        assertEquals(senha, user.getSenha(), "A senha deve ser 'password123'");
        assertEquals(email, user.getEmail(), "O e-mail deve ser 'alinne@example.com'");
    }

    @Test
    public void testSetters() {
        // Arrange
        UserModel user = new UserModel(null,"initial_user", "initial_password", "initial.email@example.com");

        // Act
        user.setUsuario("new_user");
        user.setSenha("new_password");
        user.setEmail("new.email@example.com");

        // Assert
        assertEquals("new_user", user.getUsuario(), "O usuário deve ser 'new_user'");
        assertEquals("new_password", user.getSenha(), "A senha deve ser 'new_password'");
        assertEquals("new.email@example.com", user.getEmail(), "O e-mail deve ser 'new.email@example.com'");
    }

}
