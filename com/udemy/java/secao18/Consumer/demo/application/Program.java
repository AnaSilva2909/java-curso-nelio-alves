import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // Criando instancia
        // list.forEach(new PriceUpdate());

        // Criando metodo static
        // list.forEach(Product :: staticPriceUpdate);

        // Criando metodo não static
        // list.forEach(Product :: noStaticPriceUpdate);

        // Expressao lambda declarada
        /*
         * Consumer<Product> consumer = p -> {
         * p.setPrice(p.getPrice() * 1.1);
         * };
         * list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
         */

        // Expressão lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);

    }

}
