package DateCalendar;
import java.util.Calendar;

public class ExemplosCalendar {
    public static void main(String[] args) {
        
        Calendar calendar =  Calendar.getInstance();

        System.out.println("Ano: " + calendar.get(Calendar.YEAR));
        System.out.println("Mês: " + (calendar.get(Calendar.MONTH) + 1)); // Janeiro = 0
        System.out.println("Dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hora: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minuto: " + calendar.get(Calendar.MINUTE));
        System.out.println("Segundo: " + calendar.get(Calendar.SECOND));
    }
    
}
