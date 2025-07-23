package HerancaPolimorfismo.Exercicio2;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Atendente atendente = new Atendente();
        Vendedor vendedor = new Vendedor();
        Gerente gerente = new Gerente();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quem deseja entrar é:");
        System.out.println("1-Gerente");
        System.out.println("2-Vendedor");
        System.out.println("3-Atendente");

        var escolha = scanner.nextInt();

        if(escolha == 1 && gerente.adm == true) {

            gerente.realizarLogin(scanner);

            return;

        }

        if(escolha == 2 && vendedor.adm == false) {

             vendedor.realizarLogin(scanner);

            return;
            
        }

        if(escolha == 2 && atendente.adm == false) {

            atendente.realizarLogin(scanner);

            return;
            
        }


    }
    
}
