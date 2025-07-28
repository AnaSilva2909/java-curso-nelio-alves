package LerDadosEmArquivos.lendoArquivos_Classes_File_Scanner.application;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
public static void main(String[] args) {

    //Lendo arquivo de texto:
    File file = new File("C:\\temp\\in.txt");
    Scanner scan = null;

    try{
        //Instanciando o Scanner apartir do meu obj file.
        scan = new Scanner(file);
        //hasNextLine: Enquanto houver linha no arquivo será feita a leitura
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
            
        }
    }catch(IOException e){
        System.out.println("Error: " + e.getMessage());

    }finally{ //Usando o bloco finally para fechar o Scanner independente se houver uma falha ou não
        if (scan != null) {
            scan.close();
        }
        
    }




    
}
}
