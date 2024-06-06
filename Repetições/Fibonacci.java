import java.util.Scanner;
public class Fibonacci {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        System.out.print("Digite quantos numeros quer da sequencia de fibonacci: ");
        int m = dado.nextInt();
        long num1 = 1, num2 = 1, num3;
        System.out.print(num1 + ", " + num2);
        for(int i=3; i==m; i++) {
            num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
