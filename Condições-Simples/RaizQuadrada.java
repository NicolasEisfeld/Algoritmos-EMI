import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        int num = dado.nextInt();
        
        System.out.print("Digite a potencia: ");
        int pot = dado.nextInt();
        
        if (num >= 0 )  {
            if (pot >= 0){
                double cubo = Math.pow(num, pot);
            System.out.println(cubo);
            } else {
            System.out.println("Numero invalido");
        }
            
        } else {
            System.out.println("Numero invalido");
        }
    }
}
