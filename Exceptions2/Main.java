package Exceptions2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um Scanner para ler dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Cria um DAO que gerencia os usuários
        UserDAO dao = new UserDAO();

        // Loop principal do programa
        while (true) {
            System.out.println("\nDigite o nome do usuário:");
            String name = scanner.nextLine(); // lê o nome do usuário

            System.out.println("Digite o email do usuário:");
            String email = scanner.nextLine(); // lê o email do usuário

            try {
                // Tenta salvar o usuário com os dados fornecidos
                User user = dao.save(name, email);

                // Se der certo, imprime sucesso
                System.out.println("Usuário cadastrado com sucesso: " + user);
            } catch (InvalidUserException e) {
                // Se der erro de validação, imprime mensagem amigável
                System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
            }

            // Pergunta se o usuário quer continuar
            System.out.println("Deseja cadastrar outro usuário? (s/n)");
            String again = scanner.nextLine();

            // Se não for "s", sai do loop
            if (!again.equalsIgnoreCase("s")) break;
        }

        // Ao final, mostra todos os usuários cadastrados
        System.out.println("\nUsuários cadastrados:");
        dao.findAll().forEach(System.out::println); // imprime cada usuário

        scanner.close();
    }
}
