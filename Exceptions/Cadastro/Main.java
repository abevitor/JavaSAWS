package Exceptions.Cadastro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    private static final UserDAO dao = new UserDAO();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS!");
            System.out.println("Selecione uma operação:");
            System.out.println("=======================================");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Buscar por identificador");
            System.out.println("5 - Listar");
            System.out.println("6 - Sair");

            var userInput = scanner.nextInt();
            scanner.nextLine(); // Limpa quebra de linha pendente

            if (userInput < 1 || userInput > 6) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            var selectedOption = MenuOption.values()[userInput - 1];

            switch (selectedOption) {
                case SAVE -> {
                    var user = dao.save(requestToSave());
                    System.out.printf("Usuário salvo: ", user);
                }
                case UPDATE -> {
                    var user = dao.update(requestToUpdate());
                    System.out.printf("Usuário atualizado: ", user);
                }
                case DELETE -> {
                    dao.delete(requestId());
                    System.out.println("Usuário excluído.");
                }
                case FIND_BY_ID -> {
                    var id = requestId();
                    var user = dao.findById(id);
                    System.out.printf("Usuário com id ", id, user);
                }
                case FIND_ALL -> {
                    var users = dao.findAll();
                    System.out.println("Usuários cadastrados:");
                    users.forEach(System.out::println);
                }
                case EXIT -> {
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                }
            }
        }
    }

    private static long requestId() {
        System.out.println("Informe o identificador do usuário:");
        var id = scanner.nextLong();
        scanner.nextLine(); // limpa \n
        return id;
    }

    private static UserModel requestToSave() {
        System.out.println("Informe o nome do usuário:");
        var name = scanner.nextLine();

        System.out.println("Informe o email do usuário:");
        var email = scanner.nextLine();

        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy):");
        var birthdayString = scanner.nextLine();

        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);

        return new UserModel(0, name, email, birthday);
    }

    private static UserModel requestToUpdate() {
        System.out.println("Informe o identificador do usuário:");
        var id = scanner.nextLong();
        scanner.nextLine(); 

        System.out.println("Informe o nome do usuário:");
        var name = scanner.nextLine();

        System.out.println("Informe o email do usuário:");
        var email = scanner.nextLine();

        System.out.println("Informe a data de nascimento do usuário (dd/MM/yyyy):");
        var birthdayString = scanner.nextLine();

        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);

        return new UserModel(id, name, email, birthday);
    }
}
