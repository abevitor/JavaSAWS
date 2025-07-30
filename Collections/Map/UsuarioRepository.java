package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class UsuarioRepository {
    private Map<Integer, Usuario> banco = new HashMap<>();

    // Criar
    public void salvar(Usuario usuario) {
        banco.put(usuario.getId(), usuario);
    }

    // Ler
    public Usuario buscarPorId(Integer id) {
        return banco.get(id);
    }

    // Atualizar
    public void atualizar(Usuario usuario) {
        if (banco.containsKey(usuario.getId())) {
            banco.put(usuario.getId(), usuario);
        } else {
            System.out.println("Usuário não encontrado para atualização.");
        }
    }

    // Deletar
    public void remover(Integer id) {
        banco.remove(id);
    }

    // Listar todos
    public void listarTodos() {
        for (Usuario usuario : banco.values()) {
            System.out.println(usuario);
        }
    }
}

