package keywords.Exercicio1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite aonde você quer mandar mensagem:");
        System.out.println("=======================================");
        System.out.println("1-Whatsapp");
        System.out.println("2-SMS");
        System.out.println("3-Email");
        System.out.println("4-Redes Sociais");

        var opcao = scanner.nextInt();

        scanner.nextLine();

        System.out.println("================================");
        System.out.println("Digite uma mensagem: ");
        var mensagens = scanner.nextLine();

        Mensagens mensagem = null;

        switch(opcao) {

            case 1:
           mensagem = new Whatsapp(mensagens);
          break;
          

          case 2:
          mensagem = new Sms(mensagens);
          break;

          case 3:
          mensagem = new Email(mensagens);
          break;

          case 4:
          mensagem = new RedesSociais(mensagens);
          break;

          default:
          System.out.println("Opção inválida!");
          break;
        }

        if(mensagens != null) {
            System.out.println("\n" + mensagem.mandarMensagem());

        }

        scanner.close();
    } 
}
