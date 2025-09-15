import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Entre com nome do Instrutor: ");
        String nomeInstrutor = sc.next();
        Instrutor instrutor = new Instrutor(nomeInstrutor);
        

        System.out.println("Quantidade de Cursos para esse instrutor " + instrutor.getNome() + ": ");
        int qtd = sc.nextInt();

        for(int i=0; i<qtd;i++){
            System.out.println("Nome Curso #" + (i+1)+": ");
            String nomeCurso = sc.next();
            System.out.println("Quantidade de alunos para curso " + nomeCurso +"? ");
            int n = sc.nextInt();

            Curso curso = new Curso(nomeCurso);
            instrutor.addCurso(curso);

            for(int j = 0; j<n;j++){
                System.out.println("Entre com o ID do #" +(j+1) +" Aluno referente ao curso " + nomeCurso + ": ");
                int id = sc.nextInt();

                curso.addAluno(new Aluno(id));

            }

        }
        System.out.println(instrutor.getTotalAlunos());
        



    }
    
}
