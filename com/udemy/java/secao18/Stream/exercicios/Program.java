package exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import exercicios.model.entities.Emplooye;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String path = "C:\\temp\\in.txt";
        System.out.println("Value for base salary validation: ");
        double value = sc.nextDouble();
        

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            List<Emplooye> emplooyes = new ArrayList<>();
            while (line != null) {
                String[] fields = line.split(",");
                emplooyes.add(new Emplooye(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
               }

               List<String> list = emplooyes.stream()
                    .filter(e -> e.getSalary() > value)
                    .map(e -> e.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

               list.forEach(System.out::println);

               List<Emplooye> list2 = emplooyes.stream().filter(e -> e.getName().charAt(0) == 'M').collect(Collectors.toList());
                
               double sumSalary = list2.stream().map(e -> e.getSalary()).reduce(0.0, (x, y) -> x +y);

               System.out.println("Sum of salaries starting with M: " + sumSalary);



               
               

            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
