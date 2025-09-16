import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votos = new TreeMap<>();

        File path = new File("C:\\temp\\in.txt");

        // Escrita no arquivo
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(path))) {
            System.out.println("Quantidade de Candidatos?");
            int qtdCandidatos = sc.nextInt();

            for (int i = 0; i < qtdCandidatos; i++) {
                System.out.println("Entre com #" + (i + 1) + " candidato: ");
                String nomeCandidato = sc.next();
                System.out.println("Quantidade de votos de candidato " + nomeCandidato + ": ");
                Integer qtdVotos = sc.nextInt();

                // Se já existir, acumula
                votos.put(nomeCandidato, votos.getOrDefault(nomeCandidato, 0) + qtdVotos);
            }

            // Grava no arquivo
            for (String nome : votos.keySet()) {
                bf.write(nome + "," + votos.get(nome));
                bf.newLine();
            }

        } catch (Exception e) {
            System.out.println("Não está sendo possivel gravar informações em arquivo: " + e.getMessage());
        }

        // Leitura do arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            votos.clear(); // limpa antes de reprocessar
            while (line != null) {
                String[] fields = line.split(",");
                String nome = fields[0];
                int qtdVotos = Integer.parseInt(fields[1]);

                votos.put(nome, votos.getOrDefault(nome, 0) + qtdVotos);

                line = br.readLine();
            }

            // Exibe resultados
            for (String nome : votos.keySet()) {
                System.out.println(nome + " = " + votos.get(nome));
            }

        } catch (Exception e) {
            System.out.println("Não está sendo possivel ler informações em arquivo: " + e.getMessage());
        }

        sc.close();
    }
}
