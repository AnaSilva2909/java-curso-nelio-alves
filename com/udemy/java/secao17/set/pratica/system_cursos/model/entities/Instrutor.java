import java.util.HashSet;
import java.util.Set;

public class Instrutor {
private String nome;
private Set<Curso> listaCursos = new HashSet<>();


public Instrutor() {
}


public Instrutor(String nome) {
    this.nome = nome;
   
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void addCurso(Curso curso){
    listaCursos.add(curso);
}

public void removeCurso(Curso curso){
    listaCursos.remove(curso);
}

public int getTotalAlunos() {
    Set<Aluno> todosAlunos = new HashSet<>();
    for (Curso curso : listaCursos) {
        todosAlunos.addAll(curso.getListaAlunos()); 
    }
    return todosAlunos.size(); 
}














    
}
