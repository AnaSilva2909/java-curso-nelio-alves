package exercicio.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicio.entities.Client;
import exercicio.entities.OrdemItem;
import exercicio.entities.Order;
import exercicio.entities.Product;
import exercicio.enums.OrderStatus;


public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scan.next());
        System.out.println("Enter order data: ");
        System.out.print("Status:");
        String status = scan.next();

        Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, birthDate));

        System.out.print("How many items to this order? ");
        int items = scan.nextInt();

        for(int i =0;i < items; i++){
            System.out.println("Enter #"+(i+1)+" item data:");
            scan.nextLine();
            System.out.print("Product name: ");
            String nameProduct = scan.nextLine();
            System.out.print("Product price: ");
            double priceProduct = scan.nextDouble();
            System.out.print("Quantity: ");
            int quantiy = scan.nextInt();

            order.addItems(new OrdemItem(quantiy, new Product(nameProduct, priceProduct)));

        }
         System.out.println(order);
    

        scan.close();
        

    }
    
}
