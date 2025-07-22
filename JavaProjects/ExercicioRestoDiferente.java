package JavaProjects;

import java.util.Scanner;

public class ExercicioRestoDiferente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial (base): ");
        int base = scanner.nextInt();

        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero < base) {
                System.out.println("Número ignorado (menor que o número base).");
                continue;
            }

            if (numero % base != 0) {
                System.out.println("Resto diferente de 0. Encerrando.");
                break;
            }

            System.out.println("Número aceito: " + numero);
        }

        scanner.close();
    }
    
}
