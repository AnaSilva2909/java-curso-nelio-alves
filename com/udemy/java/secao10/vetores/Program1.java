package vetores;
import java.util.Locale;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Entre com quantidade de Alturas: ");
        int n = scan.nextInt();
        
        double[] altura = new double[n];

        double sum = 0;
        for(int i=0; i<n; i++){
            System.out.println("Entre com a #" + (i+1)+ " altura: ");
            altura[i] = scan.nextDouble();
            sum+= altura[i];

        }

        double media = sum / n;

        System.out.println("Média das alturar: " + String.format("%.2f", media));

        scan.close();
    }

}
