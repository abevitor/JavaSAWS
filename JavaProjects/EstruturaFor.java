package JavaProjects;
import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        
        var scanner = new Scanner (System.in);
            

        for(;;) {
            System.out.println("Digite um nome:");
            var name = scanner.nextLine(); // esse le a linha toda
            //var name1 = scanner.next(); esse le apenas ate o primeiro espaço
             
            if(name.equalsIgnoreCase("exit")) break;

            System.out.println(name);
            
           scanner.close();
        }

        System.out.println("<=============================>");
        //mostrar numeros impares
        for(var i = 1; i <100; i+=2) {

            System.out.println(i);
            
        }

        System.out.println("<===========================>");
         
        // ir do 200 ate o 0
        for(var i = 20; i >= 0; i--) {

            System.out.println(i);
        }

        System.out.println("<==========================>");

        //mostrar numeros pares
        for(var i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                
            }
            
        }

        System.out.println("<==========================>");

        //mostrar args
        for(var i = 0; i<args.length; i++) {
            System.out.println(args[i]);
            
        }

        

        

    }
    
    
}
