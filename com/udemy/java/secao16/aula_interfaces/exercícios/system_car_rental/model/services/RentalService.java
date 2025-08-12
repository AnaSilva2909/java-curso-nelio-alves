import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;
    private TaxServices taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxServices taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        //Pegando a duração entre o inicio e fim e convertendo para minutos
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();

        //Dividindo os minutos por 60, para sabermos quantas horas
        double hours = minutes / 60.0;
        double basicPayment;

        
        if (hours <=12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);// Arredondando as horas
        }else{
            basicPayment = pricePerDay * Math.ceil(hours/ 24.0);

        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));

    }


   


    
}
