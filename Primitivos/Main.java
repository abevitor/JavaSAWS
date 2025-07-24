package Primitivos;

public class Main {

    public static void main(String[] args) {
        
        var user = new User("Vitor", 20);
        printValue(user);
        System.out.println(user);
    }

    private static void printValue( final User user) {
        //user = new User("Maria", 23);
        user.setName("Maria");
        user.setAge(33);
        System.out.println(user);
    }
    
}
