package Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // 1. ArithmeticException → divisão por zero
            int a = 10;
            int b = 0;
            int resultado = a / b; // Vai lançar ArithmeticException

            // 2. ArrayIndexOutOfBoundsException → acesso a índice inválido
            int[] numeros = {1, 2, 3};
            int foraDoLimite = numeros[5]; // Vai lançar ArrayIndexOutOfBoundsException

            // 3. NullPointerException → acessar algo em um objeto nulo
            String texto = null;
            int tamanho = texto.length(); // Vai lançar NullPointerException

            // 4. NumberFormatException → converter string inválida para número
            String valor = "abc123";
            int numero = Integer.parseInt(valor); // Vai lançar NumberFormatException

            // 5. InputMismatchException → scanner espera um tipo diferente
            System.out.print("Digite um número inteiro: ");
            int num = scanner.nextInt(); // Se digitar "abc", vai lançar InputMismatchException

        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida. (" + e.getMessage() + ")");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Tentou acessar uma posição inválida no array. (" + e.getMessage() + ")");
        } catch (NullPointerException e) {
            System.out.println("Erro: Tentou acessar um método em uma variável nula. (" + e.getMessage() + ")");
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor inválido para conversão numérica. (" + e.getMessage() + ")");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Esperado um número inteiro. (" + e.getMessage() + ")");
        } catch (Exception e) {
            // Pega qualquer outra exceção não tratada acima
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            // Este bloco SEMPRE é executado, mesmo se ocorrer exceção
            scanner.close();
            System.out.println("Programa finalizado.");
        }
    }
}

    

