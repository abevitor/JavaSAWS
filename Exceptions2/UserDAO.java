package Exceptions2;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    // Lista de usuários armazenados em memória
    private List<User> users = new ArrayList<>();

    // ID auto-incrementável
    private long nextId = 1;

    // Método para salvar um novo usuário
    public User save(String name, String email) {
        validate(name, email); // chama método para validar os dados

        // Cria novo usuário com ID automático
        User user = new User(nextId++, name, email);
        
        // Adiciona o usuário à lista
        users.add(user);

        // Retorna o usuário criado
        return user;
    }

    // Validação dos dados do usuário
    private void validate(String name, String email) {
        if (name == null || name.trim().isEmpty()) {
            // Se o nome estiver vazio ou nulo, lança exceção personalizada
            throw new InvalidUserException("Nome não pode ser vazio.");
        }

        if (email == null || !email.contains("@")) {
            // Se o email for nulo ou inválido, lança exceção personalizada
            throw new InvalidUserException("Email inválido.");
        }
    }

    // Retorna a lista de todos os usuários cadastrados
    public List<User> findAll() {
        return users;
    }
}

