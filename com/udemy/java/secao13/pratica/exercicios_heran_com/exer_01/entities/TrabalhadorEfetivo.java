package entities;

import enums.NivelTrabalhador;

public class TrabalhadorEfetivo extends Trabalhador{
    public TrabalhadorEfetivo(){
        super();
    }

    public TrabalhadorEfetivo(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento){
        super(nome, nivel, salarioBase, departamento);

    }
   

    

    
}
