package POO.OO.resolvendoPrimeiroProblema.ResolvendoCOM_OO.ResolvendoSEM_OO.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        xA = scan.nextDouble();
        xB = scan.nextDouble();
        xC = scan.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        yA = scan.nextDouble();
        yB = scan.nextDouble();
        yC = scan.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areay = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areay);

        if (areaX > areay) {
            System.out.println("Larger area: X ");
            
        }else{
            System.out.println("Larger area: Y ");
        }



    }
    
}
