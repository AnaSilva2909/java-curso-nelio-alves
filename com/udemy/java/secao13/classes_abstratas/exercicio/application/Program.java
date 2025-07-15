package exercicio.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio.entities.Company;
import exercicio.entities.Individual;
import exercicio.entities.TaxPayer;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scan.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Tax payer #" + (1+i) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = scan.next().toLowerCase().charAt(0);   
            System.out.print("Name: ");    
            scan.nextLine();  
            String name = scan.nextLine();  
            System.out.print("Anual income: ");  
            double anualIncome = scan.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = scan.nextDouble();
                taxPayers.add(new Individual(name, anualIncome, healthExpenditures));

            }else{
                System.out.print("Number of employees: ");
                int numberOfEmployee = scan.nextInt();
                taxPayers.add(new Company(name, anualIncome, numberOfEmployee));
            }

        }

        System.out.println("TAXES PAID: ");
        double sum = 0.0;
        for(TaxPayer taxPayer : taxPayers){
            System.out.println(taxPayer);
            sum+= taxPayer.tax();

        }

        System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));



        scan.close();
        
    }
    
}
