package convertendoDataHoraParaTexto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        //Customizando um data-hora:

        //Primeiro Formato:
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Segundo Formato:
        DateTimeFormatter fmt2= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Terceiro Formato ele usa um metódo que pega o fuso horario com base o horario de Londres:
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        //Quarto formato:
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        //Quinto formato:
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;


        LocalDate d04 =LocalDate.parse("2022-07-20");
        System.out.println("d04= " + d04.format(fmt1));
        System.out.println("d04= " + fmt1.format(d04));

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        System.out.println("d05= " + d05.format(fmt2));
        System.out.println("d05 utilizando fmt4 = " + d05.format(fmt4));

        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        System.out.println("d06= " + fmt3.format(d06));
        System.out.println("d06 utilizando fmt6= " + fmt5.format(d06));



        
    }
    
}
