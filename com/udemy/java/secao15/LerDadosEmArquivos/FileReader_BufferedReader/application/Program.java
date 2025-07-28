package LerDadosEmArquivos.FileReader_BufferedReader.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\temp\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try{
            //Estabelecendo uma stream(leitura) apartir de um caminho.
            fr = new FileReader(path);
            br = new BufferedReader(fr);//Será instanciando apartir de um FileReader, deixado a leitura mais rápid acom alguma otimizações, usando Buffer de memória.

            String line = br.readLine(); //Vai ler as linhas do arquivo e quando acabar, retorna nulo.
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
                
            }
        }catch(IOException e){
            System.out.println("Erro: " + e.getMessage());
        }finally{
           try{
             if (br != null) {
                br.close();
                
            }
            if(fr != null){
                fr.close();
            }
           }catch(IOException e){
            e.fillInStackTrace();

           }
        }
    }
    
}
