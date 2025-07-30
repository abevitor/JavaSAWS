package com.exemplo.app;

import com.exemplo.model.User;
import com.exemplo.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        userService.adicionarUsuario(new User("Beatriz", "bea@email.com"));
        userService.adicionarUsuario(new User("Carlos", "carlos@email.com"));

        System.out.println("Usuários cadastrados:");
        for (User u : userService.listarUsuarios()) {
            System.out.println(" - " + u);
        }
    }
}
