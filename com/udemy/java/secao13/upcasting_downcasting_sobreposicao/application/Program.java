public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);

        //UpCasting: Pegar um obj do tipo sub classe e atribuilo ao Tipo SuperClasse
         BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //Downcastig: Pega um obj da super classe e atribui ao tipo SubClasse;
        BusinessAccount acc4 = (BusinessAccount) acc2;

    
        //Testa de obj é valido para converção:
        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Emprestimo");
            
        }else if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5  = (SavingsAccount)acc3;
            acc5.upDateBalance();
            System.out.println("Update");
            
        }



        
    }
    
}
