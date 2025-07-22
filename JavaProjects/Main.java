package JavaProjects;
import  java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("Quanto é 2x5? ");
        var result = scanner.nextInt();
       // boolean isWrong = result != 10;
        boolean isCorrect = result == 10;// pode ser tambem var isCorrect = result == 10;

        System.out.printf("O resultado é 10, você acertou? (%s)", isCorrect);// !isWrong logica inversa se for correto 
                                                                                   //vai ser falso se for falso vai ser correto


        scanner.close();
    }
    
}
