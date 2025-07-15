package POO.estaticos.exercicios.application;

import java.util.Scanner;

import POO.estaticos.exercicios.util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is dollar price?");
        double valueDollar = scan.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double valueInDollar = scan.nextDouble();

        double valueInReais = CurrencyConverter.currencyConverter(valueDollar, valueInDollar);

        System.out.println("Amount to be paid in reais= " + String.format("%.2f", valueInReais));
    }
    
}
