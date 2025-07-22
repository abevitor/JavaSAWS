package JavaProjects;
import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado do retângulo:");
        double lado = scanner.nextDouble();

        System.out.println("Digite o valor da base do retângulo: ");
        double base = scanner.nextDouble();

        double area = lado * base;
        
        System.out.println("A área do quadrado é:" + area);

        scanner.close();

    }
    
}
