package Exercicio1;
import java.util.Scanner;

public class Bicicleta {
     public static void main(String[] args) {

        Bicicletinha bicicletinha = new Bicicletinha();
       
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Digite o modelo da sua bicicleta: ");
        String modelo = scanner.nextLine();
        bicicletinha.setModelo(modelo);
        
        System.out.println("Digite o nivel de força: ");
        String nivelStr = scanner.nextLine();
        bicicletinha.setNivelStr(nivelStr);

        System.out.println("BATERIA: ");
        int nivelBateria = Integer.parseInt(nivelStr);
        bicicletinha.setBateria(nivelBateria);

        System.out.println(bicicletinha.obterMensagem());

        scanner.close();
    }

}
    
