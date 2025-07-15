import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //Classes(Super Classe) abstrartas não pode ser instanciadas, apenas subClasses, exemplo abaixo não é permitido:
        //Invalido: Account acc = new Account(1001, "Alex", 0.0);

        //Valido: Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        //Valido: Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0); 

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Maria", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Bob", 560.0, 0.02));
        list.add(new SavingsAccount(1002, "Ana", 1000.0, 0.01));

        double sum =0;

        for(Account acc: list){
            sum+= acc.getBalance();

        }

       System.out.printf("Total balance: %.2f%n", sum);


       for(Account acc: list){
            acc.deposit(10.0);

        }

        for(Account acc: list){
           System.out.println("Update: " + acc.getBalance());
        }

        


        



        
    }
    
}
