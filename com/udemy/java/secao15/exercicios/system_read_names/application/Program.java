package exercicios.system_read_names.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        File path = new File("C:\\temp\\in.txt");

        File newFile = new File("C:\\temp\\nomesMaiusculos.txt");

        List<String> list = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line = bf.readLine();

            System.out.println("Arquivo 1: ");
            while (line != null) {
                System.out.println(line);
                list.add(line);
            
                line = bf.readLine();
                
            }

        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))){
            for(String s: list){
                bw.write(s.toUpperCase());
                bw.newLine();

            }


        } catch (Exception e) {
            System.out.println("Erro ao gravar texto no arquivo: " + e.getMessage());
        }

         try (BufferedReader bf2 = new BufferedReader(new FileReader(newFile))) {
                String line = bf2.readLine();
                System.out.println("Arquivo 2: ");
                
                int count = 0;
                while (line != null) {
                    System.out.println(line);
                    line = bf2.readLine();
                    count++;
                    
                }
                System.out.println("Quantidades de nomes: " + count);
                
            } catch (Exception e) {
                System.out.println("Erro ao ler novo arquivo com letras maiusculas: " + e.getMessage());
            }
            

        

    }

}
