package com.exemplo.service;

import com.exemplo.model.User;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class UserServiceTest {

    @Test
    public void testAdicionarUsuario() {
        UserService service = new UserService();
        User user = new User("Ana", "ana@email.com");

        service.adicionarUsuario(user);
        List<User> lista = service.listarUsuarios();

        assertEquals(1, lista.size());
        assertEquals("Ana", lista.get(0).getNome());
    }
}
