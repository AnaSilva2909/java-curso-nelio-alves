package POO.OO.resolvendoSegundoProblema.application;

import java.util.Locale;
import java.util.Scanner;

import POO.OO.resolvendoSegundoProblema.entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = scan.next();

        System.out.print("Price: ");
        double price = scan.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = scan.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = scan.nextInt();
        product.addProducts(quantity);
        System.out.println("Update data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);
        System.out.println("Update data: " + product);



    
    }

}
