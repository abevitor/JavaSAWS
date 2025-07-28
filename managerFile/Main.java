package managerFile;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FilePersistence persistence = new NIOFilePersistence("user.csv");

        System.out.println(persistence.write("beatriz;beatriz@beatriz.com;08/08/2005;"));
        System.out.println("========================================");
        System.out.println(persistence.write("bill;bill@bill.com;11/09/2001;"));
        System.out.println("========================================");
        System.out.println(persistence.write("vitor;vitor@vitor.com;14/04/2005;"));
        System.out.println("========================================");
        System.out.println(persistence.findAll());

    }

}
