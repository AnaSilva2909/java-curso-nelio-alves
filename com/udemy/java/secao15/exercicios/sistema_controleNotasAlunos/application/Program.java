package exercicios.sistema_controleNotasAlunos.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios.sistema_controleNotasAlunos.model.entities.Alunos;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Alunos> listaAlunos = new ArrayList<>();
        Alunos aluno = new Alunos();

        String strPath = "C:\\temp\\grades.csv";
        File path = new File(strPath);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            System.out.println("Quantidade de Alunos: ");
        int n = scan.nextInt();

        System.out.println("Quantidade de Notas, para cada alunos: ");
        int qtdNotas = scan.nextInt();

        for(int i =0; i<n; i++){
            double[] notas = new double[qtdNotas];
            
            System.out.println("Entre com dados do aluno #" +(i+1) + ": " );
            System.out.println("Nome: ");
            scan.nextLine();
            String nome = scan.nextLine();

            System.out.println("Entre com as notas do Aluno " + nome +": ");
            for(int j=0; j< notas.length; j++){
            System.out.println("Nota #" + (1+j)+ ": ");
            notas[j] = scan.nextDouble();
            }
            listaAlunos.add(new Alunos(nome, notas));  

        }

        bw.write(aluno.validarSituacao(listaAlunos));

        }catch (Exception e) {
             System.out.println("Erro ao escrever arquivo: " + e.getMessage());
        }
        
        try (BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line = bf.readLine();
             while (line != null) {
                System.out.println(line);
                line = bf.readLine();
                
             }
            
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        scan.close();



    }
    
}
