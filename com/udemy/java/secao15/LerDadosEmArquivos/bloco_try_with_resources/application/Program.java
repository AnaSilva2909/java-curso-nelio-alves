package LerDadosEmArquivos.bloco_try_with_resources.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
         String path = "C:\\temp\\in.txt";
        //Fazendo a instanciação diretamente no bloco try, sem precisar fechar a leitura ou criar os streams
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
           
            String line = br.readLine(); //Vai ler as linhas do arquivo e quando acabar, retorna nulo.
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
                
            }
        }catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }

}
