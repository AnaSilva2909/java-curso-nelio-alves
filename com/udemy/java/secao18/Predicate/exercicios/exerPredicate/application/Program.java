package exercicios.exerPredicate.application;

import java.util.ArrayList;
import java.util.List;

import exercicios.exerComparator.model.entities.Product;
import exercicios.exerPredicate.util.MyPredicate;

public class Program {
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 6000.0));
        list.add(new Product("Cama", 650.0));
        list.add(new Product("Mesa", 3000.0));
        list.add(new Product("Sofá", 1500.0));

        list.removeIf(p -> p.getName().charAt(0) == 'T' );
        list.removeIf(new MyPredicate());

        for(Product p : list){
            System.out.println(p);

        }

        
    }
    
}
