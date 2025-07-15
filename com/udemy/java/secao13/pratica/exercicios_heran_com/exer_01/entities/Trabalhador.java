package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enums.NivelTrabalhador;

public class Trabalhador {
    
    private Departamento departamento;
    private String nome;
    private NivelTrabalhador nivel;
    private Double salarioBase;
    private List<ContratoHora> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento depatamento) {
        this.departamento = depatamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double total(int month, int year){
        double sum = salarioBase;
        Calendar cal = Calendar.getInstance();

        for (ContratoHora c : contratos) {
            cal.setTime(c.getData());
            int c_month = 1+ cal.get(Calendar.MONTH);
            int c_year = cal.get(Calendar.YEAR);

            if (c_month == month && c_year == year) {
                sum+= c.valorTotalContrato();      
            }
        }
        return sum;

    }

    public void addContrato(ContratoHora contratoHora){
        contratos.add(contratoHora);

    }

    public void removeContrato(ContratoHora contratoHora){
        contratos.remove(contratoHora);

    }

    @Override
    public String toString() {
        return "Trabalhador [nome=" + nome + ", nivel=" + nivel + ", salarioBase=" + salarioBase + "]";
    }
    

    
    
}
