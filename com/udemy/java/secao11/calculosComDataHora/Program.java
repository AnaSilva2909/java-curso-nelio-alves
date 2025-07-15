package calculosComDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        
        //Calculos com data-hora:
        LocalDate d04 =LocalDate.parse("2022-07-20");//Data Local
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");//Data-hora Local
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");//Data-hora Global

        //Criando com uma semana antes:
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);

        //Criando com uma semana depois:
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDate pasWeekLocalDate = d04.plusDays(7);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);

        LocalDateTime pastWeeekLocalDateTime = d05.minusDays(7);
        System.out.println("pastWeeekLocalDateTime= " + pastWeeekLocalDateTime);

        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        //Instant:
        Instant pastWeeekInstant = d06.minus(7, ChronoUnit.DAYS);
        System.out.println("pastWeeekInstant= " + pastWeeekInstant);

        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("nextWeekInstant = " + nextWeekInstant);


        //Duração entre duas datas-horas:
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0, 0));
        System.out.println("t1 dias= " + t1.toDays());
        Duration t2 = Duration.between(pastWeeekLocalDateTime, d05);
        System.out.println("t2 dias= " + t2.toDays());
        Duration t3 = Duration.between(pastWeeekInstant, d06);
        System.out.println("t3 dias= " + t3.toDays());
        
    }
    
}
