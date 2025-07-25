package Optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {  

        Optional<User> optional = Optional.of(new User("João", 19, SexEnum.MASCULINO));
        //Optional<User> optional = Optional.empty();
        //System.out.println(optional.get());

       var newUser = optional.map(user -> new UserV2(user.name(), user.age(), user.sex())).orElseThrow();
       System.out.println(newUser);

        System.out.println();
        System.out.println("============================");

        Optional<User> optional1 = Optional.ofNullable(new User("Joaquim", 19, SexEnum.MASCULINO));
        System.out.println(optional1);

        System.out.println();
        System.out.println("============================");

        optional.ifPresent(System.out::println);

        System.out.println();
        System.out.println("============================");

        final int newAge = 22;

        optional.ifPresentOrElse(

            user -> {
                System.out.printf("Usuario :%s", user);
                
                user = new User("João", newAge, SexEnum.MASCULINO); 
                System.out.println("Usuario" + user);
            },
            () -> System.out.println("Não foi informado um usuario")
            );


        System.out.println();
        System.out.println("============================");

        System.out.println(optional.orElse(new User("Maria", 22, SexEnum.FEMININO))); 
        
        System.out.println();
        System.out.println("============================");
        
        System.out.println(optional.orElseThrow(() -> new RuntimeException("receba")));

        System.out.println();
        System.out.println("============================");

        System.out.println(optional.orElse(defaultUser()));
        System.out.println(optional.orElseGet(Main::defaultUser));
        

    }


    public static User defaultUser() {
        System.out.println("buscando valor default");
        return new User("Beatriz", 22, SexEnum.FEMININO);

    }
    
    
}
