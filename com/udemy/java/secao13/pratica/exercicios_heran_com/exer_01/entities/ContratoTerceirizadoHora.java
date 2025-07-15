package entities;

import java.util.Date;

public class ContratoTerceirizadoHora extends ContratoHora{

    public ContratoTerceirizadoHora() {
        super();
        
    }

    public ContratoTerceirizadoHora(Date data, Double valorPorHora, Integer horas) {
        super(data, valorPorHora, horas);
    }

    @Override
    public double valorTotalContrato() {
        return super.valorTotalContrato() * 1.10;
    }

    
}
