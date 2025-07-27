package Exceptions2;

// Esta classe representa uma exceção personalizada
// Usamos ela para lançar um erro específico quando os dados do usuário são inválidos
public class InvalidUserException extends RuntimeException {
    
    // Construtor que recebe uma mensagem e envia para a superclasse (RuntimeException)
    public InvalidUserException(String message) {
        super(message); // armazena a mensagem da exceção
    }
}
