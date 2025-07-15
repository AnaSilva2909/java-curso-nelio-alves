package manipulandoDateComCalendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d =  Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));
        Calendar cal = Calendar.getInstance();//Instanciei um calendar
        cal.setTime(d);//Setei a minha data d dentro dele
        /*cal.add(Calendar.HOUR_OF_DAY, 4);//Acrescentado 4 horas a uma data:
        d = cal.getTime();*/

        int minutes = cal.get(Calendar.MINUTE); //Obtendo apenas os minutos da minha data d
        System.out.println("Minutes: " + minutes);

        int month = 1 + cal.get(Calendar.MONTH);//Pois o mes inicializa no 0 para Calendar.
        
        System.out.println("Month: " + month);
        System.out.println(sdf.format(d));

        //Obtendo uma unidade de tempo, como só o dia, mes ou ano.


        
            }
    
}
