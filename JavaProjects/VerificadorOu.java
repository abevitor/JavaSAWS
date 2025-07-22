package JavaProjects;
import java.util.Scanner;

public class VerificadorOu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos anos voce tem? ");
        int idade = scanner.nextInt();
        System.out.println("Você é emancipado?");
        boolean emancipado = scanner.nextBoolean();

        boolean canDrive = idade >= 18 || (emancipado && idade >=16);

        System.out.println("Voce pode dirigir? " + canDrive);

        scanner.close();





        
    }
    
}
