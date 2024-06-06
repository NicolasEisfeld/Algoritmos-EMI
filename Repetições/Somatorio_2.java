import java.util.Scanner;
public class Somatorio_2 {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        int num, soma = 0;
        num = dado.nextInt();
        
        while(num > 0) {
            soma = num + soma;
            num = dado.nextInt();
                 
        }
        System.out.println("A soma dos numeros eh "+ soma);
    }
}
