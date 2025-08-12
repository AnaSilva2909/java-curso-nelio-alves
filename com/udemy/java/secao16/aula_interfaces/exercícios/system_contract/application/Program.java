import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.OnlinePaymentService;
import services.PaypalService;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
        System.out.println("Entre com dados do contato: ");
        System.out.print("Número: ");
        int num = scan.nextInt();
        System.out.print("Data (dd/MM/yyyy):");
        Date dataContato = sdf.parse(scan.next());
        System.out.print("Valor do contrato: ");
        double valorContrato = scan.nextDouble();
        System.out.print("Entre com números de parcelas: ");
        int numParcelas = scan.nextInt();

        Contract contract = new Contract(num, dataContato, valorContrato);
        
        ContractService service = new ContractService(new PaypalService());

        service.processContract(contract, numParcelas);

        System.out.println("PARCELAS: ");
        for (Installment i : contract.getListInstallments()) {
           System.out.println(i);
    
        }
           
          
        
       
        

        } catch (ParseException e) {
            System.out.println("Erro a ler a data: " + e.getMessage());
        }

        scan.close();        
    }
    
}
