package exercicios.system_summary.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import exercicios.system_summary.model.entities.Produto;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Criação de subPasta:
        String basePath  = "C:\\temp\\out";
        new File(basePath).mkdir();
        String strPath = "C:\\temp\\out\\summary.csv";
        File path = new File(strPath);

         
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
         
        System.out.println("Entre com a quantidade de produtos: ");
        int n = scan.nextInt();
        Produto[] produtos = new Produto[n];
        for(int i = 0; i<n; i++){
            System.out.println("Dados do Produto #" +(i+1)+ ": ");
            System.out.print("Name: ");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.print("Preço Unitário: ");
            double preco = scan.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = scan.nextInt();

            produtos[i] = new Produto(nome, preco, quantidade);
            
        }

        //Gravando dados:
        for(Produto produto: produtos){
                bw.write(produto.toCsv());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Erro ao escrever o arquivo:" + e.getMessage());
        }

        //Ler Dados:
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
                
            }


            
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        scan.close();
        
            




        }
    
    
}
