package pratica.exer_01.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import pratica.exer_01.entities.ImportedProduct;
import pratica.exer_01.entities.Product;
import pratica.exer_01.entities.UsedProduct;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        readDate(scan, products);
        showDate(products);
        
    }

    public static void readDate(Scanner scan, List<Product> products) throws ParseException{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Enter the number of products:");
    int n = scan.nextInt();

    for(int i=0; i<n; i++){
        System.out.println("Product #"+ (i+1)+ " data:");
        System.out.print("Common, used or imported (c/u/i)? ");
        char typeProduct = scan.next().toLowerCase().charAt(0);
        System.out.print("Name: ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.print("Price: ");
        double price = scan.nextDouble();

        if (typeProduct == 'i') {
        System.out.print("Customs fee: ");
        double customsFee = scan.nextDouble();
        products.add(new ImportedProduct(name, price, customsFee));
            
        }else if (typeProduct == 'u') {
            System.out.println("Manufacture date (DD/MM/YYYY): ");
            Date dataManufacture = sdf.parse(scan.next());
            products.add(new UsedProduct(name, price, dataManufacture));
            
            }else{
                products.add(new Product(name, price));
            }


    }

}

public static void showDate(List<Product> products){
    Locale.setDefault(Locale.US);
    System.out.println("PRICE TAGS:");
    for(Product product: products){
        System.out.println(product.priceTag());

    }

}

}
       



