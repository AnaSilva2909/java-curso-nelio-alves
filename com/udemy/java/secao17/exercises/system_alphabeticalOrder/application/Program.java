package exercises.system_alphabeticalOrder.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercises.system_alphabeticalOrder.model.services.CalculateService;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("Enter the numbers of the names: ");
        int n = sc.nextInt();

        for(int i =0; i<n; i++){
            System.out.println("Name number #" +(i+1)+": ");
            String name = sc.next();

            list.add(name);

        }

        System.out.println("Last in alphabetical order: " + CalculateService.max(list));

        sc.close();


    }
    
}
