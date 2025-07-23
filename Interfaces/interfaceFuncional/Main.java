package Interfaces.interfaceFuncional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
            new User("Maria", 21),
            new User("Eduardo", 40),
            new User("Bill", 45));


            printStringValue(Record::toString, users);
           
            System.out.println("Nome");
            printStringValue(User::name, users);

            System.out.println("Idade");
            printStringValue(user -> String.valueOf(user.age()), users);
      
       }
       private static void printStringValue(Function<User, String> callback, List<User> users){

        users.forEach(u -> System.out.println(callback.apply(u)));

       }

       
    }


