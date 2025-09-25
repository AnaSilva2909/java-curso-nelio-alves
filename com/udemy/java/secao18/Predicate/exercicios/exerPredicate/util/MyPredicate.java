package exercicios.exerPredicate.util;

import java.util.function.Predicate;

import exercicios.exerComparator.model.entities.Product;

public class MyPredicate implements Predicate<Product>{

    @Override
    public boolean test(Product p) {
        return p.getName().charAt(0) == 'T';
    }
    
}
