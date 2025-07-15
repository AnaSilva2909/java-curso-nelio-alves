import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        //Instanciando data apartir do agora LocalDate, LocalDateTime e Instant:
        
        LocalDate d01 = LocalDate.now(); // Metodo estatico: Retornando a data Local
        System.out.println("d01= " + d01);

        LocalDateTime d02 = LocalDateTime.now();// Metodo estatico now: Retornando a data Localn e horario
        System.out.println("d02= " + d02);

        Instant d03 = Instant.now(); // Metodo estatico now: Retornando a data Global e horario, do horario de Londres
        System.out.println("d03= " + d03);
/*-------------------------------------------------------------------------------------------------------------------------------------- */

        //Pegando texto ISO 8601 e retornando uma data hora apartir dele

        LocalDate d04 = LocalDate.parse("2022-07-20"); //Metodo estatico parse: Passando um texto representando uma data no formato ISO ano-mes-dia
        System.out.println("d04= " + d04);

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        System.out.println("d05= " + d05);

        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");//Gerando uma data-hora no padrão UTC
        System.out.println("d06= " + d06);

        /*Pegando um hórario local com base no Horario ZULU(Horario de Londres):
         Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");//Gerando uma data-hora no padrão UTC
        System.out.println("d07= " + d07);*/

        //Texto customizado data/hora:
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        System.out.println("d08= " + d08);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        System.out.println("d09= " + d09);


        //Instanciar data e horario por dados isolados:
        LocalDate d10 = LocalDate.of(2022, 8, 10);
        System.out.println("d10= " + d10);

        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
        System.out.println("d11= " + d11);

    }

    
}
