public class ProgramSobreposicao {
    public static void main(String[] args) {
        Account acc1 = new Account(1001,"Alex", 1000.0);
        acc1.wihdraw(200.0);
        System.out.println(acc1.getBalance());

        //UpCasting 
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.wihdraw(200.0);
        System.out.println(acc2.getBalance());

        //UpCasting 
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.wihdraw(200.0);
        System.out.println(acc3.getBalance());

        /*Diferençca entre Sobreposição e Polimorfiso: Sobreposição é quando a classe filha sobrepoe
        o método da classe Pai e o polimorfismo é qunadocria variaveis do mesmo tipo e cria instancia de tipos diferentes, classes que herdam a super*/
    }
    
}
