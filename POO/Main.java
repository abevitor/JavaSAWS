package POO;

public class Main {
    public static void main(String[] args) {
        
        var male = new Person("João");
        male.incAge();
        var female = new Person("Maria");
        female.incAge();

    

        System.out.println("nome: " + male.getName() + " idade: " + male.getAge());
        System.out.println("nome: " + female.getName() + " idade: " + female.getAge());

         

    }
    
}
