import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        // 1ºLista
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        // 2º Convertendo para stream e chamando o metodo map
        Stream<Integer> st1 = list.stream().map(e -> e * 10);
        // 3Imprimindo a stream
        System.out.println(Arrays.toString(st1.toArray()));

        // Stream.of permite setar os elementos diretamenta na Stream
        Stream<String> st2 = Stream.of("Maria", "Bob", "Alex");
        System.out.println(Arrays.toString(st2.toArray()));

        // Metodo iterate, permite definir um valor inicial e acondição para os demais
        // itens da stream
        Stream<Integer> st3 = Stream.iterate(0, e -> e + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        // Stream Fibonacci
        Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

    }

}
