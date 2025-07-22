package JavaProjects;
import java.util.Scanner;

public class MyClass {

    private final static String WELCOME_MESSAGE = "Olá informe o seu nome!";


    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        var age = scanner.nextInt();
        var name = scanner.nextLine();

        

        System.out.println(WELCOME_MESSAGE);
        System.out.println(age);
        System.out.println(name);
        System.out.println("meu nome é " + name + " e tenho " + age + " anos");

        scanner.close();
    }
    
}
