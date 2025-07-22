package JavaProjects;
import java.util.Scanner;

public class ExercicioIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Quantos anos você tem?");
        int idade = scanner.nextInt();
        
        System.out.println("Olá " + nome + ", você tem " + idade + " anos" );

        scanner.close();

        
    }
    
}
