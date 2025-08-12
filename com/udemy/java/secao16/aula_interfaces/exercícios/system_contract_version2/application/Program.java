package aula_interfaces.exercícios.system_contract_version2.application;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

import aula_interfaces.exercícios.system_contract_version2.model.entities.Contract;
import aula_interfaces.exercícios.system_contract_version2.model.entities.Installment;
import aula_interfaces.exercícios.system_contract_version2.model.services.ContractService;
import aula_interfaces.exercícios.system_contract_version2.model.services.OnlinePaymentService;
import aula_interfaces.exercícios.system_contract_version2.model.services.PaypalService;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt =DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try{
        System.out.println("Entre com dados do contato: ");
        System.out.print("Número: ");
        int num = scan.nextInt();
        System.out.print("Data (dd/MM/yyyy):");
        LocalDate dataContato = LocalDate.parse(scan.next(), fmt);
        System.out.print("Valor do contrato: ");
        double valorContrato = scan.nextDouble();
        System.out.print("Entre com números de parcelas: ");
        int numParcelas = scan.nextInt();

        Contract contract = new Contract(num, dataContato, valorContrato);

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, numParcelas);

        System.out.println("PARCELAS: ");
         for(Installment installment : contract.getListInstallments()){
            System.out.println(installment);

         }
        }catch(Exception e){
            System.out.println("ERRO: " + e.getMessage());
        }
        
        scan.close();
    

}
}
