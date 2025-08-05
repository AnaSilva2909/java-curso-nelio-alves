package exercicios.system_sales_registration.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Locale;
import java.util.Scanner;

import exercicios.system_sales_registration.model.entities.Customer;
import exercicios.system_sales_registration.model.entities.Product;
import exercicios.system_sales_registration.model.entities.Sale;


public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String strPath = "C:\\temp\\summary.csv";
        File path = new File(strPath);

        try(BufferedWriter bf = new BufferedWriter(new FileWriter(path))){
           processSalesData(scan, bf);
          
        }catch(Exception e){
            System.out.println("Erro ao escrever arquivo: " + e.getMessage());

        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
                
            }
            
        } catch (Exception e) {
          System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        scan.close();
        


    }
    public static void processSalesData(Scanner scan, BufferedWriter bf){
        try{
        System.out.println("Entre com a quantidade de produtos: ");
        int n = scan.nextInt();
        Sale[] sale = new Sale[n];
        for(int i = 0; i<n; i++){
            System.out.println("Nome Cliente: ");
            scan.nextLine();
            String nomeCliente= scan.nextLine();
            System.out.println("Dados do Produto #" +(i+1)+ ": ");
        
            System.out.print("Nome Produto: ");
            String nomeProduto = scan.nextLine();
            System.out.print("Preço Unitário: ");
            double preco = scan.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = scan.nextInt();

            sale[i] = new Sale(new Product(nomeProduto, preco, quantidade), new Customer(nomeCliente));  
        }   
            for(Sale s : sale){
            bf.write(s.toCSV());
            bf.newLine();
        }
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());

        }

        
    }



    
}
