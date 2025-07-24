package DateCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        
        var date = new Date();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        
        System.out.println();
        System.out.println("=============================");
        
        System.out.println(date);

        System.out.println();
        System.out.println("=============================");

        System.out.println(formatter.format(date));

        System.out.println();
        System.out.println("=============================");
        
        
        date.setYear(99);
        System.out.println(date);
        
        System.out.println();
        System.out.println("=============================");
        
        date.setHours(0);
        System.out.println(date);

        System.out.println();
        System.out.println("=============================");
        
        date.setSeconds(24);
        System.out.println(date);

        System.out.println();
        System.out.println("=============================");
        
        date.setHours(4);
        System.out.println(date);

        System.out.println();
        System.out.println("=============================");
        
        date.setSeconds(24);
        System.out.println(date);
        
    }
    
}
