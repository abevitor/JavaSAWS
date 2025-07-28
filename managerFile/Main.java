package managerFile;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        
        FilePersistence persistence = new IOFilePersistence("user.csv");
         
        System.out.println("=============================");
        System.out.println(persistence.write("Vitor; vitor@gmail.com; 12/4/2110"));;
        System.out.println("=============================");
        System.out.println(persistence.write("Beatriz; beatriz@gmail.com; 12/4/2130"));
        System.out.println("=============================");
        System.out.println(persistence.write("Bill; bill@gmail.com; 12/4/21240"));
        System.out.println("=============================");
        System.out.println(persistence.findAll());
        System.out.println("=============================");
        System.out.println(persistence.remove("Vitor"));
        System.out.println("=============================");
        System.out.println(persistence.findBy("Vitor"));
        System.out.println("=============================");
        System.out.println(persistence.findBy("beatriz"));
        System.out.println("=============================");
        System.out.println(persistence.findBy("94;"));
        System.out.println("=============================");
        System.out.println(persistence.replace(".com;12/4/2110", "Carlos; carlos@carlos.com; 11/09/2001"));
        System.out.println("=============================");
        System.out.println(persistence.findAll());
        System.out.println("=============================");
        System.out.println(persistence.remove("Vitor"));

    }
    
}
