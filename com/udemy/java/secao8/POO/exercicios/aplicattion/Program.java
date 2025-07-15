package POO.exercicios.aplicattion;

import java.util.Locale;
import java.util.Scanner;

import POO.exercicios.entities.Employee;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Name:");
        String name = scan.next();
        System.out.println("Gross salary: ");
        double grossSalary = scan.nextDouble();
        System.out.println("Tax: ");
        double tax = scan.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);

        System.out.println("Employee: " + employee );

        System.out.println("Wich percentage to increase salary? ");
        double percentage = scan.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Update: " + employee );





    }
    
}
