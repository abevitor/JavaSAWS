package datas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        // =======================
        // 📆 LocalDate - só a data
        // =======================
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000, 5, 10);
        LocalDate parsedDate = LocalDate.parse("2025-12-22");

        System.out.println("Hoje: " + today);
        System.out.println("Aniversário: " + birthday);
        System.out.println("Data parseada: " + parsedDate);

        System.out.println("Dia do mês: " + today.getDayOfMonth());
        System.out.println("Mês: " + today.getMonth());
        System.out.println("Ano: " + today.getYear());

        System.out.println("Daqui a 10 dias: " + today.plusDays(10));
        System.out.println("Semana passada: " + today.minusWeeks(1));

        System.out.println("É depois de 01/01/2020? " + today.isAfter(LocalDate.of(2020, 1, 1)));
        System.out.println("É ano bissexto? " + today.isLeapYear());

        System.out.println("\n==============================");

        // =======================
        // ⏰ LocalTime - só hora
        // =======================
        LocalTime now = LocalTime.now();
        LocalTime fixedTime = LocalTime.of(14, 30, 15);
        LocalTime parsedTime = LocalTime.parse("09:15:30");

        System.out.println("Agora: " + now);
        System.out.println("Hora fixa: " + fixedTime);
        System.out.println("Hora parseada: " + parsedTime);

        System.out.println("Hora: " + now.getHour());
        System.out.println("Minutos: " + now.getMinute());
        System.out.println("Segundos: " + now.getSecond());

        System.out.println("Mais 2 horas: " + now.plusHours(2));
        System.out.println("Menos 30 minutos: " + now.minusMinutes(30));

        System.out.println("É antes de meio-dia? " + now.isBefore(LocalTime.NOON));

        System.out.println("\n==============================");

        // ======================================
        // 📆⏰ LocalDateTime - data e hora (sem fuso)
        // ======================================
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime customDateTime = LocalDateTime.of(today, now);

        System.out.println("Agora (data e hora): " + nowDateTime);
        System.out.println("Custom: " + customDateTime);

        System.out.println("Mais 3 dias e 4 horas: " + nowDateTime.plusDays(3).plusHours(4));
        System.out.println("Menos 1 mês: " + nowDateTime.minusMonths(1));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Formatado: " + nowDateTime.format(formatter));

        System.out.println("\n==============================");

        // =======================
        // 🕰️ OffsetTime - hora com fuso (offset)
        // =======================
        OffsetTime offsetTime = OffsetTime.of(now, ZoneOffset.ofHours(-3));
        OffsetTime parsedOffsetTime = OffsetTime.parse("14:30:00-03:00");

        System.out.println("OffsetTime agora: " + offsetTime);
        System.out.println("OffsetTime parseado: " + parsedOffsetTime);

        System.out.println("Offset: " + offsetTime.getOffset());
        System.out.println("Hora com offset + 1h: " + offsetTime.plusHours(1));

        System.out.println("\n==============================");

        // ====================================
        // 📅🕰️ OffsetDateTime - data e hora com offset
        // ====================================
        OffsetDateTime offsetDateTime = OffsetDateTime.of(nowDateTime, ZoneOffset.ofHours(-3));
        OffsetDateTime parsedOffsetDateTime = OffsetDateTime.parse("2025-07-25T14:00:00-03:00");

        System.out.println("OffsetDateTime atual: " + offsetDateTime);
        System.out.println("OffsetDateTime parseado: " + parsedOffsetDateTime);

        System.out.println("Mais 2 dias: " + offsetDateTime.plusDays(2));
        System.out.println("Menos 5 horas: " + offsetDateTime.minusHours(5));

        System.out.println("Convertido para Instant (UTC): " + offsetDateTime.toInstant());

        System.out.println("\n==============================");
    }
}
