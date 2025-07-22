package HerancaPolimorfismo.Exercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        IngressoMeia ingressoMeia = new IngressoMeia();
        IngressoFamilia ingressoFamilia = new IngressoFamilia();
        IngressoInteira ingressoInteira = new IngressoInteira();
// anônimo para representar inteira

        Scanner scanner = new Scanner(System.in);

        System.out.println("Que filme você deseja ver?");
        String nomeFilme = scanner.nextLine();

        System.out.println("Deseja ver dublado ou legendado?");
        String tipoAudio = scanner.nextLine();

        System.out.println("Qual vai ser o tipo da sua entrada? =MEIA==INTEIRA==FAMILIA==");
        String tipo = scanner.nextLine();

        switch (tipo.toUpperCase()) {
            case "MEIA" -> {
                ingressoMeia.setFilme(nomeFilme);
                ingressoMeia.setDublado(tipoAudio);
                ingressoMeia.ingressoMeiaBill(ingressoMeia);
                printIngresso(ingressoMeia);
            }

            case "INTEIRA" -> {
                ingressoInteira.setFilme(nomeFilme);
                ingressoInteira.setDublado(tipoAudio);
                printIngresso(ingressoInteira);
            }

            case "FAMILIA" -> {
                System.out.println("Quantos membros?");
                int membros = scanner.nextInt();
                scanner.nextLine(); // consome quebra de linha

                ingressoFamilia.setFilme(nomeFilme);
                ingressoFamilia.setDublado(tipoAudio);
                ingressoFamilia.setPessoas(membros);
                printIngresso(ingressoFamilia);
            }

            default -> System.out.println("Tipo inválido.");
        }

        scanner.close();
    }

    public static void printIngresso(Ingressos ingresso) {
        System.out.println("------ Detalhes do Ingresso ------");
        System.out.println("Filme: " + ingresso.getFilme());
        System.out.println("Tipo: " + (ingresso instanceof IngressoMeia ? "Meia" :
                                       ingresso instanceof IngressoFamilia ? "Família" :
                                       "Inteira"));
        System.out.println("Dublado: " + ingresso.getDublado());

        if (ingresso instanceof IngressoMeia) {
            System.out.printf("Preço: R$ %.2f%n", ingresso.getPreco());
        } else if (ingresso instanceof IngressoFamilia ingFam) {
            System.out.println("Número de pessoas: " + ingFam.getPessoas());
            System.out.printf("Preço total com desconto (se houver): R$ %.2f%n", ingFam.ingressosPessoas());
        } else {
            System.out.printf("Preço: R$ %.2f%n", ingresso.getPreco());
        }
    }
}





         





        
            
        
    
        
        
       
        
       
    

    

