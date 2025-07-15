package POO.OO.resolvendoPrimeiroProblema.ResolvendoCOM_OO.application;

import java.util.Locale;
import java.util.Scanner;

import POO.OO.resolvendoPrimeiroProblema.ResolvendoCOM_OO.entities.Triangle;

public class Program {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    Triangle x, y;
    x = new Triangle();
    y = new Triangle();

    

        System.out.println("Enter the measures of triangle X: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

      
        double areaX = x.area();
        double areay = y.area();
        
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areay);

        if (areaX > areay) {
            System.out.println("Larger area: X ");
            
        }else{
            System.out.println("Larger area: Y ");
        }
    
   }
    
}
