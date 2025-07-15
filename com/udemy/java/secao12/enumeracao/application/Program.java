package enumeracao.application;

import java.util.Date;
import java.util.Scanner;

import enumeracao.enums.OrderStatus;

import enumeracao.entities.Order;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Order order = new Order(1080, new Date(), OrderStatus.DEVILERED);
        System.out.println(order);

        OrderStatus orderStatus1 = OrderStatus.DEVILERED;

        System.out.println("Entre com status: ");
        String status = scan.next();

        OrderStatus orderStatus3 = OrderStatus.valueOf(status);
        System.out.println(status);

        OrderStatus orderStatus2 = OrderStatus.valueOf("DEVILERED");

        //Convertendo String para Enum:
        
    }
    
}
