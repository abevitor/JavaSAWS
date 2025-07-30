package com.exemplo.service;

import com.exemplo.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private final List<User> usuarios = new ArrayList<>();

    public void adicionarUsuario(User user) {
        usuarios.add(user);
    }

    public List<User> listarUsuarios() {
        return new ArrayList<>(usuarios);
    }
}
