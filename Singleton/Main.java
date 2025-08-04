package Singleton;

public class Main {

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("==============================================");

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazyHolder);

        System.out.println("==============================================");


        SingletonApressado apressado = SingletonApressado.getInstancia();
        System.out.println(apressado);
        lazy = SingletonLazy.getInstancia();
        System.out.println(apressado);
    }
    
}
