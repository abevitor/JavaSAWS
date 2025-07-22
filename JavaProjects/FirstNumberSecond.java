package JavaProjects;
import java.util.Scanner;

public class FirstNumberSecond {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        var num1 = scanner.nextInt();

        System.out.println("Digite um segundo número, maior que o primeiro: ");
        var num2 = scanner.nextInt();

        scanner.nextLine(); // Limpar o buffer

        System.out.println("Deseja que apareça números ímpares ou pares?");
        var imPar = scanner.nextLine();

        // Se o primeiro número for menor que o segundo
        if (num1 < num2) {
            for (var i = num1; i < num2; i++) {
                if (imPar.equalsIgnoreCase("impar") && i % 2 != 0) {
                    System.out.println(i);
                }

                if (imPar.equalsIgnoreCase("par") && i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

        // Se o primeiro número for maior que o segundo
        if (num1 > num2) {
            System.out.println("O primeiro número tem que ser menor que o segundo! Por favor digite novamente: ");
            var num3 = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            if (num1 < num3) {
                for (var i = num1; i < num3; i++) {
                    if (imPar.equalsIgnoreCase("impar") && i % 2 != 0) {
                        System.out.println(i);
                    }

                    if (imPar.equalsIgnoreCase("par") && i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("O segundo número ainda é menor ou igual ao primeiro. Encerrando.");
            }
        }

        scanner.close();
    }
}

