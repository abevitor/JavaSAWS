package JavaProjects;
import java.util.Scanner;

public class ExercicioPeso {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Entre com seu peso: ");
        var peso = scanner.nextDouble();

        System.out.println("Entre com sua altura: ");
        var alt = scanner.nextDouble();

        var imc = (peso/(alt * alt));

        scanner.close();

        if(imc <= 18.5) {
            System.out.println("Abaixo do peso!");
            return;

        }

        if(imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso Ideal!");
            return;

        }

        if(imc >= 25 && imc <= 29.9){
            System.out.println("Levemente Acima do peso!");
            return;
        }

        if(imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade Grau I!");
            return;
        }
        if(imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II(Severa)!");
            return;
        }
        
        if(imc > 40) {
            System.out.println("Obesidade Grau III(Mórbida)!");
            return;
            
        }


        
        
        
    }

    


    
}
