import java.util.Scanner;
public class SomatorioEnquanto {
    public static void main (String [] args) {
        Scanner dado = new Scanner(System.in);
        int num, soma = 0;
        
        do {
            num = dado.nextInt();
            if (num > 0) {
                soma = soma + num;
            }
        } while (num > 0);
        System.out.println("Soma eh "+ soma);
    }
}
