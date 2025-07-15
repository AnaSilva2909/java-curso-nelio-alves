package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //Inserindo elemento em uma posição específica:
        list.add(2, "Marcos");

        //Verificando o tamanho da lista:
        System.out.println(list.size());

        //Removendo um elemento da lista:
        //list.remove("Anna");
        //Removendo passando o index:
        //list.remove(1);

        for(String s: list){
            System.out.println(s);
        }

        System.out.println("--------------------");

        //Removendo passando um predicado, todos que inicir com M será removido:
        list.removeIf(x -> x.charAt(0) == 'M');

        for(String s: list){
            System.out.println(s);
        }

        System.out.println("--------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));

         System.out.println("--------------------");

        //Filtrandoe deixando na lista apenas os que iniciar com A:
        // converto minha lista para stram > faço a operação > converto novamente para lista
        List<String> resul = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String r : resul){
            System.out.println(r);

        }

        System.out.println("--------------------");
 String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        //Comando que busca o primeiro elemento que começa com a letra A:
       
        System.out.println(name);

        
        
    }
    
}
