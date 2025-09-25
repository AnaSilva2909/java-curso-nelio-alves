package exercicios.exerComparator.util;

import java.util.Comparator;

import exercicios.exerComparator.model.entities.Product;

public class MyCompartor implements Comparator<Product>{

    @Override
    public int compare(Product p1, Product p2) {
       return p1.getPrice().compareTo(p2.getPrice());
    }

   
    
}
