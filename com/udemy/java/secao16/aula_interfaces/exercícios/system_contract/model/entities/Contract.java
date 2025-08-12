package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Integer number;
    private Date date;
    private Double totalValue;
    private List<Installment> listInstallments = new ArrayList<>();

    public Contract() {

    }

    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
        
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Installment> getListInstallments() {
        return listInstallments;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public void addInstallment(Installment list){
        this.listInstallments.add(list);
    }

    public void removeInstallment(Installment list){
        listInstallments.remove(list);
    }

    
   

    
}
