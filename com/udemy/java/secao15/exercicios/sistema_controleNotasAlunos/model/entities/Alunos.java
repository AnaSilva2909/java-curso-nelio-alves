package exercicios.sistema_controleNotasAlunos.model.entities;

import java.util.List;

public class Alunos {
    private String nome;
    private double[] notas;
    

    public Alunos() {

    }

    public Alunos(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(double[] notas) {
        double media = 0.0;
        for (double m : notas) {
            media += m;
        }
        return media / notas.length;
    }

    public String validarSituacao(List<Alunos> list) {

        StringBuilder sb = new StringBuilder();

        for (Alunos alunos : list) {
            double media = calcularMedia(alunos.getNotas());
            String strResultado = "";

            if (media >= 6) {
                strResultado = "Aprovado: ";
            } else {
                strResultado = "Reprovado: ";

            }

            
            sb.append(strResultado + alunos.getNome() + ",");
            for (double n : alunos.getNotas()) {
                sb.append(n + ",");

            }

            sb.append(media + "\n");


        }

        return sb.toString();
    }

}
