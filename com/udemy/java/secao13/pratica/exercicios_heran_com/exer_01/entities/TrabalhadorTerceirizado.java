package entities;

import enums.NivelTrabalhador;

public class TrabalhadorTerceirizado extends Trabalhador{

    public TrabalhadorTerceirizado(){
        super();
    }

    public TrabalhadorTerceirizado(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento){
        super(nome, nivel, salarioBase, departamento);

    }

    


    
}
