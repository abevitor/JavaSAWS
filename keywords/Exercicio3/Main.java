package keywords.Exercicio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista de produtos");
        System.out.println();
        System.out.println("==============================");
        System.out.println("1- Alimentação");
        System.out.println("2- Saude e Bem estar");
        System.out.println("3- Vestuario");
        System.out.println("4- Cultura");
        System.out.println();
        System.out.println("==============================");
        System.out.println();
        System.out.println("Qual deseja acessar?");

        var escolha = scanner.nextInt();
         
        Produto produto = null;

        System.out.println("Digite o preço do produto: ");
        var preco = scanner.nextDouble();

        

        switch (escolha) {
            case 1:
                     produto = new Alimentacao(preco);
                     break;
            
            case 2:
                     produto = new SaudeBemEstar(preco);
                    break;
            case 3:
                     produto = new Vestuario(preco);
                    break;
            case 4: 
                     produto = new Cultura(preco);
                    break;
            default: 
            System.out.println("Opção inválida!");
            break;
            
        }

        if(produto != null){
            System.out.println("\n" + produto.calcularImposto());
        }

        scanner.close();
    }
    
}
