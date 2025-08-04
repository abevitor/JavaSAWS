package Singleton;

public class SingletonApressado {

     private static SingletonApressado instancia = new SingletonApressado();

    private SingletonApressado(){
        super();
    }

    public static SingletonApressado getInstancia(){
        return instancia;
    }
    
}
