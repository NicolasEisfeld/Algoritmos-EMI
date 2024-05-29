import java.util.Scanner;
public class Retomada {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        
        double num1 = dado.nextDouble();
        double num2 = dado.nextDouble();
        double soma = num1 + num2;
        double diferenca = num1 - num2;
        double multi = num1 / num2;
        
        System.out.println(soma);
        System.out.println(diferenca);
        System.out.println(multi);
        
    }
}