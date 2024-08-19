package service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.UserModel;

public class UserService {
    private List<UserModel> users = new ArrayList<>();
    private long idCounter = 1;
    
    //Métodos
    //salvar Usuário
    public UserModel saveUser(UserModel user) {
        if (user.getId() == null) {
            user.setId(idCounter++);
            users.add(user);
        } else {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getId().equals(user.getId())) {
                    users.set(i, user);
                    break;
                }
            }
        }
        return user;
    }
    //Listar Usuários
    public List<UserModel> getAllUsers() {
        return users;
    }
    
    // Pega o Usuário pelo ID
    public UserModel getUserById(Long userId) {
        for (UserModel user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        return null; // Retorna null se o usuário não for encontrado
    }
    
    public boolean authenticateUser(String email, String senha) {
    // Obtém a lista de todos os usuários
    List<UserModel> users = getAllUsers();

    // Variável para verificar se o usuário foi encontrado
    boolean userFound = false;

    // Itera sobre a lista de usuários
    for (int i = 0; i < users.size(); i++) {
        UserModel user = users.get(i);

        // Verifica se o e-mail e a senha correspondem a um usuário na lista
        if (user.getEmail().equals(email) && user.getSenha().equals(senha)) {
            userFound = true;
            break; // Encerra o loop assim que o usuário é encontrado
        }
    }

    // Mensagem de sucesso ou erro dependendo da autenticação
    if (userFound) {
        System.out.println("Login efetuado com sucesso.");
        return true;
    } else {
        System.out.println("E-mail ou senha incorretos.");
    }
    return false;
}

}

