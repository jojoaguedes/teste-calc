package lista;

public class Buzz {

     public String doBuzz(Integer numero){
         //return String.valueOf(0);
         if (numero % 5 == 0) {
             return "buzz";
         }
         return String.valueOf(numero);

     }
}
