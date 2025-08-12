package aula_interfaces.exercícios.system_contract_version2.model.services;

public interface OnlinePaymentService {

    public double paymentFee(double amount);
    public double interest(double amount, int months);

}
