import java.util.Scanner;

public class SomaDeDoisNumeros {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero inteiro: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo numero inteiro: ");
        int numero2 = scanner.nextInt();
        
        int soma = numero1 + numero2;
        
        System.out.println("A Soma dos numeros is:"+ soma);
    }
}
