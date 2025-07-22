package POO.Exercicio2Corrijido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        String opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ligar carro");
            System.out.println("2. Desligar carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Desacelerar");
            System.out.println("5. Trocar marcha");
            System.out.println("6. Virar");
            System.out.println("7. Ver estado do carro");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1" -> carro.ligar();
                case "2" -> carro.desligar();
                case "3" -> carro.acelerar();
                case "4" -> carro.desacelerar();
                case "5" -> {
                    System.out.print("Informe a nova marcha (0 a 6): ");
                    int marcha = Integer.parseInt(scanner.nextLine());
                    carro.trocarMarcha(marcha);
                }
                case "6" -> {
                    System.out.print("Digite a direção (esquerda/direita): ");
                    String direcao = scanner.nextLine();
                    carro.virar(direcao);
                }
                case "7" -> carro.mostrarEstado();
                case "0" -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (!opcao.equals("0"));

        scanner.close();
    }
}

