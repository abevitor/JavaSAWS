package Exceptions.Cadastro.Exceptions;

public class UserNotFound extends RuntimeException {
    
    public UserNotFound(final String message){
        super(message);
    }
    
}
