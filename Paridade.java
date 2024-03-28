import java.util.Scanner;

public class Paridade {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        
        int num1 = dado.nextInt();
        int resto = num1 % 2;
                
        if (resto == 0) {
            System.out.println("O numero e par");
        } else {
            System.out.println("O numero e impar");
        }
            
    }
}
