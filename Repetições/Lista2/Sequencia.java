import java.util.Scanner;

public class Sequencia {
   public static void main(String [] args) {
   Scanner dado = new Scanner(System.in);
   int valor = dado.nextInt();
   int max = valor + 10;
   while (valor < max) {
           valor++;
           System.out.println(valor);
        }       
   }
}
