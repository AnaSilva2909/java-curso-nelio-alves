import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();
        System.out.println("End of Program");

        

    }

    public static void method1(){
        System.out.println("***METHOD1 START****");
        method2();
        System.out.println("***METHOD1 END***");

    }

    public static void method2(){
        System.out.println("***METHOD2 START***");
        Scanner scan = new Scanner(System.in);


        try{
        String[] vect = scan.nextLine().split(" ");
        int position = scan.nextInt();
        System.out.println(vect[position]);
       }
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid Position!");
        e.printStackTrace();
        scan.next();
        
       }catch(InputMismatchException e){
        System.out.println("Input error");
        
       }
       scan.close();
       System.out.println("***METHOD2 END***");
    } 


    
}
