import java.util.Scanner;
public class Naturais {
    public static void main (String [] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        Double num = leitura.nextDouble();
        
        if (num == 0) {
            System.out.println("O numero eh Zero");
        } else if (num > 0) {
             System.out.println("O numero eh natural");
        }   else {
                System.out.println("Nao eh natural");
                
        }
    }
}
