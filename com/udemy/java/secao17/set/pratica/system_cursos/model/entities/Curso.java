import java.util.HashSet;
import java.util.Set;

public class Curso {

    private String nome;
    private Set<Aluno> listaAlunos = new HashSet<>();

    public Curso() {
    }
    

    public Curso(String nome) {
        this.nome = nome;
    }


    public Set<Aluno> getListaAlunos() {
        return listaAlunos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addAluno(Aluno aluno){
        listaAlunos.add(aluno);

    }

    public void removeAluno(Aluno aluno){
        listaAlunos.remove(aluno);

    }

   


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((listaAlunos == null) ? 0 : listaAlunos.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (listaAlunos == null) {
            if (other.listaAlunos != null)
                return false;
        } else if (!listaAlunos.equals(other.listaAlunos))
            return false;
        return true;
    }


}
