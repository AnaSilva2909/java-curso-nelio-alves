package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        
        readData(scan, employees);

        showPayments(employees);
      
    }

    public static void readData(Scanner scan, List<Employee> employees){
        System.out.print("Enter the number of employees: ");
        int n = scan.nextInt();

        for(int i= 0; i< n; i++){
            System.out.println("Employee #" + (1+i) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Hours: ");
            int hours = scan.nextInt();
            System.out.print("Value per hours: ");
            double valuePerHours = scan.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge:");
                double additionalCharge = scan.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
                
            }else{
                employees.add(new Employee(name, hours, valuePerHours));
            }

        }
        scan.close();

    }

    public static void showPayments(List<Employee> employees){
        System.out.println("PAYMENTS: ");
        for(Employee emp : employees){
            System.out.println(emp);

        }
        

    }
    
}
