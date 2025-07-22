package JavaProjects;
import java.util.Scanner;

public class ExercicioTabuada {
    public static void main(String[] args) {

        var scanner =  new Scanner(System.in);

        System.out.println("Digite o número que voce deseja!");
        var num = scanner.nextInt();


        for(var i = 1 ; i <= num; i++) {
            System.out.println("tabuada do: " + i + ":");

            for(var j = 1; j <= 10; j++) {

                    System.out.println(i + " x " + j + " = " + (i * j));

            }


        }
       
        scanner.close();
    }
    
    
}
