package trabalhandoComData_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {

        //Criando formato:
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));


        //Criando data
        Date x1 = new Date();
        System.out.println("x1= " + sdf2.format(x1));

        Date x2 = new Date(System.currentTimeMillis());
        System.out.println("x1= " + x2);

        Date y1 = sdf1.parse("25/06/2018");
        System.out.println("y1= " + sdf1.format(y1));

        Date y2 = sdf2.parse("25/01/2025 13:01:02");
        System.out.println("y2= " + sdf2.format(y2));

        Date Y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println("y3= " + sdf2.format(Y3));

        System.out.println("GMT y3= " + sdf3.format(Y3));


    }
    
}
