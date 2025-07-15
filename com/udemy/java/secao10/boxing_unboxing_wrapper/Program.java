package boxing_unboxing_wrapper;

public class Program {
    public static void main(String[] args) {

        //tipo valor
        int x = 20;

        //Boxing
        Object obj = x;
        System.out.println(obj);

        //Unboxing
        int y = (int) obj;
        System.out.println(y);


    }
    
}
