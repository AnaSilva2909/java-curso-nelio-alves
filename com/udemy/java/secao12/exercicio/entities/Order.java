package exercicio.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercicio.enums.OrderStatus;

public class Order {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    private Date momment;
    private OrderStatus status;
    private Client client;
    private List<OrdemItem> ordemItems = new ArrayList<>();

    public Order() {
    }

    public Order(Date momment, OrderStatus status, Client client) {
        this.momment = momment;
        this.status = status;
        this.client = client;
    }

    public Date getMomment() {
        return momment;
    }

    public void setMomment(Date momment) {
        this.momment = momment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItems(OrdemItem ordemItem){
        ordemItems.add(ordemItem);

    }

    public void removeItems(OrdemItem ordemItem){
        ordemItems.remove(ordemItem);

    }

    public double total(){
        double sum = 0;
        for(OrdemItem ordemItem: ordemItems){
            sum+= ordemItem.subTotal();
        }

        return sum;

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:" + "\n");
        sb.append("Order moment: " + sdf.format(momment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() + "(" + sdf2.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
        sb.append("Order items: " + "\n");
        for(OrdemItem orItem : ordemItems){
            sb.append(orItem.getProduct().getName() + ", $" + String.format("%.2f", orItem.getProduct().getPrice())
            + ", Quantity: " + orItem.getQuantity() + ", Subtotal: $" + String.format("%.2f", orItem.subTotal())+ "\n");

        }
        sb.append("Total price: $" + String.format("%.2f", total()));

        return sb.toString();

    }


    
}
