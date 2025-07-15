package exercicio.entities;


public class Account {

    private final Double TAX = 5.00; 
    private Integer numAccount;
    private String nameHolder;
    private Double balance;


    public Account(){

    }

    public Account(Integer numAccount, String nameHolder, Double deposit) {
        this.numAccount = numAccount;
        this.nameHolder = nameHolder;
        balance = deposit;
    }

    public Account(Integer numAccount, String nameHolder) {
        this.numAccount = numAccount;
        this.nameHolder = nameHolder;
        balance = 0.00;
    }

    public Integer getNumAccount() {
        return numAccount;
    }


    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public Double getbalance() {
        return balance;
    }

    public void withdraw(double valueWithdraw){

        valueWithdraw+= TAX;

            balance-= valueWithdraw;       
    }

    public void deposit(double deposit){
        balance += deposit;
    }


    @Override
    public String toString() {
        return "Account " + numAccount + ", Holder: " + nameHolder + ", Balance: $" + String.format("%.2f", balance);
    }

    

    
}
