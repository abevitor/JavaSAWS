package JavaProjects;
import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        
        var name = "exit";

        //nem entra pois faz a verificação antes.
        while(!name.equalsIgnoreCase("exit")) {
            System.out.println("Informe um nome: ");
            name = scanner.nextLine();

            System.out.println(name);

            
        }
         //entra pois faz a verificação depois de fazer.
        do {
            System.out.println("Informe um nome: ");
            name = scanner.nextLine();
            System.out.println(name);
        } while (!name.equalsIgnoreCase("exit"));
        
        scanner.close();
        
    }



    
}
