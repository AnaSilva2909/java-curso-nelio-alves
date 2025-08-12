package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {
    public ContractService() {
    }

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

        double baseValue = contract.getTotalValue() / months;
        Calendar calendar = Calendar.getInstance();

        for (int i = 1; i <= months; i++) {

            double interest = onlinePaymentService.interest(baseValue, i);
            double amountWithInterest = baseValue + interest;
            double fee = onlinePaymentService.paymentFee(amountWithInterest);
            double finalAmount = amountWithInterest + fee;

            calendar.setTime(contract.getDate());
            calendar.add(Calendar.MONTH, i);

            Date dueDate = calendar.getTime();

            contract.addInstallment(new Installment(dueDate, finalAmount));

    
        }



    }

}
