import java.util.Scanner;
public class Loop_While {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        int soma = 0, valor;
        while ((valor=dado.nextInt()) != 0 ) {
            soma = soma + valor;
        }
        System.out.println(soma);
    }
}
