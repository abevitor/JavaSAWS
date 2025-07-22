package JavaProjects;
import java.util.Scanner;

public class ExercicioDiferencaIdade {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        

        System.out.println("Digite a idade da pessoa 1");
        var idade1 = scanner.nextInt();
        
        System.out.println("Digite a idade da pessoa 2");
        var idade2 = scanner.nextInt();

        var difIdade = idade2 - idade1;

        System.out.println("A diferença da idade das duas pessoas é de: " + difIdade + " anos");

        scanner.close(); 
    }
    
    
}
