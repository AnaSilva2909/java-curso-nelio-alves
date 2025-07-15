package vetores;
import java.util.Locale;
import java.util.Scanner;

import vetores.entities.Produto;

public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Entre com quantidade de produtos a ser cadastrado: ");
        int n = scan.nextInt();

        Produto[] produto = new Produto[n];

        double sum = 0;
        for(int i =0; i<n; i++){
            System.out.println("Entre com nome do Produto #" + (i+1) +":");
            String nome= scan.next();
            System.out.println("Digite o preço do produto " + nome +": ");
            double preco = scan.nextDouble();
            produto[i] = new Produto(nome, preco);

            sum+= preco;

        }

        double media = sum /n;

        System.out.println("Média: " + String.format("%.2f", media));
        scan.close();
    }
    
}
