package Collections.Map;

public class Main {
    public static void main(String[] args) {
        UsuarioRepository repo = new UsuarioRepository();

        // Criar usuários
        repo.salvar(new Usuario(1, "Ana", "ana@email.com"));
        repo.salvar(new Usuario(2, "Bruno", "bruno@email.com"));
        repo.salvar(new Usuario(3, "Carlos", "carlos@email.com"));

        System.out.println("📋 Todos os usuários:");
        repo.listarTodos();

        // Buscar usuário
        System.out.println("\n🔍 Buscando usuário com ID 2:");
        System.out.println(repo.buscarPorId(2));

        // Atualizar usuário
        System.out.println("\n✏️ Atualizando usuário com ID 2:");
        repo.atualizar(new Usuario(2, "Bruno Silva", "brunos@email.com"));
        System.out.println(repo.buscarPorId(2));

        // Remover usuário
        System.out.println("\n🗑️ Removendo usuário com ID 1:");
        repo.remover(1);

        // Mostrar usuários restantes
        System.out.println("\n📋 Usuários restantes:");
        repo.listarTodos();
    }
}

