package JavaProjects;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         System.out.println("forneça o primeiro número: ");
         double num1 = scanner.nextDouble();
         
         System.out.println("forneça o segundo número: ");
         double num2 = scanner.nextDouble();
         
         scanner.nextLine();

         System.out.println("Escolha a operação: SOMA (+), SUBTRAÇÃO(-), MULTIPLICAÇÃO (*), DIVISÃO(/), POTÊNCIAÇÃO(^), RAIZ QUADRADA(√)");
         String operacao = scanner.nextLine();

         scanner.close();

         if(operacao.equals("+")) {
            System.out.println("Resultado: " + (num1 + num2));
            return;
         }

         if(operacao.equals("-")){
            System.out.println("Resultado: " + (num1 - num2));
            return;
         }

         if(operacao.equals("*")) {
            System.out.println("Resultado: " + (num1* num2));
            return;
         }

         if(operacao.equals("/")) {
            System.out.println("Resultado: " + (num1 / num2));
            return;
         }

         if( operacao.equals("/")) {
            System.out.println("Resultado: " + Math.pow(num1, num2));
            return;
             
         }

         if(operacao.equals("√")) {
            System.out.println("Resultado: " + Math.sqrt(num1));
            System.out.println("Resultado num 2: + " + Math.sqrt(num2));
            return;
         } 
          
    }   
}
