package exercises.system_employeeSalary.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercises.system_employeeSalary.model.entities.Employee;
import exercises.system_employeeSalary.model.services.CalculateService;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Employee> list = new ArrayList<>();

        File path = new File("C:\\temp\\employee.txt");


        
        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Employee #" + (i+1)+ ": ");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Employee(name, salary));
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (Employee employee : list) {
                bw.write(employee.toString());
                bw.newLine();
                
            }
            
        } catch (Exception e) {
            System.out.println("Error writing values ​​to file:" + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            list.clear();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
 
            }
            System.out.println("Largest salary: " + CalculateService.max(list));

            
        } catch (Exception e) {
            System.out.println("Error read to file" + e.getMessage());
        }finally{
            sc.close();
        }





    }
    
}
