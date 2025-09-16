import java.util.Map;

public class Candidato implements Comparable<Candidato>{
    private String name;
    private Integer votos;
    public Candidato() {
    }
    public Candidato(String name, Integer votos) {
        this.name = name;
        this.votos = votos;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getVotos() {
        return votos;
    }
    public void setVotos(Integer votos) {
        this.votos = votos;
    }
   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Candidato other = (Candidato) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
  
    
    @Override
    public String toString() {
        return name + "," + votos;
    }
    @Override
    public int compareTo(Candidato other) {
        return name.compareTo(other.getName());
    }
    
}
