package aula_interfaces.exercícios.system_contract_version2.model.services;

import java.time.LocalDate;

import aula_interfaces.exercícios.system_contract_version2.model.entities.Contract;
import aula_interfaces.exercícios.system_contract_version2.model.entities.Installment;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;


    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }


    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }


    public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double amount = contract.getTotalValue() / months;

        LocalDate starDate = contract.getDate();

        for (int i = 1; i <= months; i++) {

            double interest = onlinePaymentService.interest(amount, i);
            double amountWithInterest = amount + interest;
            double fee = onlinePaymentService.paymentFee(amountWithInterest);
            double finalAmount = amountWithInterest + fee;


            LocalDate duDate = starDate.plusMonths(i);

            contract.addInstallment(new Installment(duDate, finalAmount));
            
        }

            



    }


}
