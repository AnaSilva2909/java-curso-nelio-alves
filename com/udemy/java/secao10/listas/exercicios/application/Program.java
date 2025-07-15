package listas.exercicios.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import listas.exercicios.entities.Employee;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");

            System.out.print("Id: ");
            int id = scan.nextInt();

            while (hasId(list, id)) {
                System.out.print("Id já existe, digite novo id: ");
                id = scan.nextInt();
            }

            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();

            System.out.print("Salary: ");
            double salary = scan.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrease = scan.nextInt();

        Employee result = list.stream().filter(emp -> emp.getId() == idIncrease).findFirst().orElse(null);

        if (result == null) {
            System.out.println("Id não existe!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = scan.nextDouble();
            result.salaryIncrease(percentage);
        }

        System.out.println();
        System.out.println("Updated list of employees:");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        scan.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        return list.stream().anyMatch(emp -> emp.getId() == id);
    }

    public static Integer position(List<Employee> list, int id){
        for(int i = 0; i<list.size(); i++){
            if (list.get(i).getId() == id) {
                return i; 
            }
        }
        return null;
    }
}

