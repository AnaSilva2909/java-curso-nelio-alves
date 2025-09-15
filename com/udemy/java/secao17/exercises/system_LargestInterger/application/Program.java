package exercises.system_LargestInterger.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercises.system_LargestInterger.application.model.services.CalculateService;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter Integers: ");
        List<String> list = new ArrayList<>();
        int n = scan.nextInt();
        for(int i =0; i<n; i++){
        System.out.print("Number #" + (i+1)+ ": ");
        String value = scan.next();
        list.add(value);
        }

        System.out.println("Max: " + CalculateService.max(list));

        scan.close();


        
    }
    
}
