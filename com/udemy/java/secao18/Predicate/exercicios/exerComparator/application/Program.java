package exercicios.exerComparator.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exercicios.exerComparator.model.entities.Product;
import exercicios.exerComparator.util.MyCompartor;


public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 6000.0));
        list.add(new Product("Cama", 650.0));
        list.add(new Product("Notebook", 3000.0));
        list.add(new Product("Sofá", 1500.0));

        /*list.sort(new MyCompartor()
        );*/

        list.sort((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));


        for(Product p : list){
            System.out.println(p);

        }
        
    }
    
}
