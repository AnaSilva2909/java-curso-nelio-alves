package convertDataHoraGlobalParaLocal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {

        //Convertendo dataHora global para local:
        LocalDate d04 =LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        //Passa um instante e um zoneID:
        LocalDateTime r1 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());
        System.out.println("r1= " + r1);

        //Com base no horario de Portugal:
        LocalDateTime r2 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal"));
        System.out.println("r2= " + r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());
        System.out.println("r3= " + r3);
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r4= " + r4);
        /*Classe ZoneID que tem metodo  que retorna os nomes dos fuso horario customizados:

        for(String s: ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }*/


        //Obter dados de uma data-hora local:
        //d04 pegara o dia:
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        //d04 pegara o mes:
        System.out.println("d04 mes = " + d04.getMonthValue());
        //d04 pegara o ano:
        System.out.println("d04 ano = " + d04.getYear());

        //d05 pegara a hora:
        System.out.println("d05 hora = " + d05.getHour());
        //d05 pegara a minuto:
        System.out.println("d05 minuto = " + d05.getMinute());

        


        

       
        
    }
}
