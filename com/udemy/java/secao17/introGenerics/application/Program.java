package introGenerics.application;

import java.util.Scanner;

import introGenerics.services.PrintService;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //PrintService<Integer> ps = new PrintService<>();
        PrintService<String> ps = new PrintService<>();




        System.out.println("How many values?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);

        }
        
        ps.print();
        System.out.println();
        System.out.println("First: "+ ps.first());

        sc.close();

    }
    
}
