import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //O que é função map? É uma função que aplica uma função em item da lista.

        //1º opção é criar sua Function:
       /*List<String> names = list.stream().map(new UperCaseName()).collect(Collectors.toList());
        names.forEach(System.out::println);*/

        //2º Metódo estatico:
        /*List<String> names = list.stream().map(Product::staticUperCaseName).collect(Collectors.toList());
        list.forEach(System.out::println);*/

        //3º Metódo NÂO estatico:
       /*List<String> names = list.stream().map(Product::noStaticUperCaseName).collect(Collectors.toList());
       names.forEach(System.out::println);*/

       //4º Expressao Lambda
       /*Function<Product, String> function = f -> f.noStaticUperCaseName();
       List<String> names = list.stream().map(function).collect(Collectors.toList());
       names.forEach(System.out::println);*/

         //5º Expressao Lambda inline
       List<String> names = list.stream().map(f -> f.noStaticUperCaseName()).collect(Collectors.toList());
       names.forEach(System.out::println);
    } 
    
}