package metodos_abstratos.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import metodos_abstratos.enums.Color;
import metodos_abstratos.entities.Circle;
import metodos_abstratos.entities.Rectangle;
import metodos_abstratos.entities.Shape;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = scan.nextInt();

        for(int i = 0; i< n; i++){
            System.out.println("Shape #" +(i+1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = scan.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scan.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = scan.nextDouble();
                System.out.print("Heigth: ");
                double heigth = scan.nextDouble();

                list.add(new Rectangle(color, width, heigth));
                
            }else{
                System.out.print("Radiou: ");
                double radiou = scan.nextDouble();
                list.add(new Circle(color, radiou));

            }

        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");

        for(Shape shape: list){
            System.out.println(String.format("%.2f", shape.area()));

        }

        scan.close();


    }
    
}
