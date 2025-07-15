package for_each;

public class Program {
    public static void main(String[] args) {
        /*Sintaxe:
            for(Tipo apelido : coleção){
            comando..
            comando..
            }
         */


         String[] vect = new String[] {"Maria", "Bob", "Alex"};

         for(String v: vect){
            System.out.println(v);

         }

         for(int i= 0; i<vect.length; i++){
            System.out.println(vect[i]);

         }
    }
    
}
