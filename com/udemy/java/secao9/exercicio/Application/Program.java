package exercicio.Application;

import java.util.Scanner;

import exercicio.entities.Account;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Account account = new Account();
        System.out.println("Enter account number: ");
        int numAccount = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter account holder:");
        String nameHolder =  scan.nextLine();
        

        System.out.println("Is there na initial deposit (y/n)?");

        char optionDepositInitial = scan.next().charAt(0);

        optionDepositInitial = Character.toUpperCase(optionDepositInitial);

        if (optionDepositInitial == 'Y' ) {
            System.out.println("Enter initial deposit value: ");
            double depositInitial = scan.nextDouble();
            account = new Account(numAccount, nameHolder, depositInitial);
            
        }else{
            account = new Account(numAccount, nameHolder);
        }

        System.out.println("Account data:");
        System.out.println(account);

        System.out.println("Enter a deposit value:");
        double deposit = scan.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println("Enter a withdraw value:");
        double withdraw = scan.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Updated account data:");
        System.out.println(account);





        scan.close();
    }
    
}
