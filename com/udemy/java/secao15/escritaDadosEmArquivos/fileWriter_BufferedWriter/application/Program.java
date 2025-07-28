package escritaDadosEmArquivos.fileWriter_BufferedWriter.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good Morning", "Goog Afernoon", "Good Night"};

        //Criando arquivos e grando os dados passados no vetor:
        String path = "C:\\temp\\out.txt";

        // Se adiicionar o parametro true ele acrescenta ao final do arquivo e não recria
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for(String line: lines){
                bw.write(line);
                bw.newLine();
            }
            
        } catch (IOException e) {
          e.printStackTrace();
        }
    }
    
}
