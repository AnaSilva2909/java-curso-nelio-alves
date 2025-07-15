package exercicio.entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual() {
        super();
        
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
     double tax = (getAnualIncome() < 20000.0) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
     tax -= healthExpenditures * 0.5;
     
     return tax;

    }
    
}
