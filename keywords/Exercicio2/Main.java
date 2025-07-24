package keywords.Exercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a formula que você deseja usar:");
        System.out.println();
        System.out.println("1-Quadrado");
        System.out.println("2-Retângulo");
        System.out.println("3-Circular");


         
        var opcao = scanner.nextInt();

        Formas figura = null;

        scanner.nextLine();

        

        switch(opcao){

            case 1:
               System.out.println("Digite o lado do Quadrado:");
               var lado = scanner.nextDouble();
               figura = new Formas.Quadrado(lado);
               break;

            case 2:
            System.out.println("Digite a base do retângulo:");
            var base = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Digite a altura do retângulo: ");
            var altura = scanner.nextDouble();
            figura = new Formas.Retangulo(base, altura);

             break;

            case 3:
            System.out.println("Digite o raio do Circulo:");
            var raio = scanner.nextDouble();
            figura = new Formas.Circular(raio);

            default:
            System.out.println("Opção inválida.");
            break;
           
        }
             
        if(figura != null){
            System.out.println("\n" + figura.calcularArea());
        }

        scanner.close();
        
    }
    
}
