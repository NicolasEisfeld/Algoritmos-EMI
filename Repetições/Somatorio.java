import java.util.Scanner;
public class Somatorio {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        System.out.print("Digite 10 numeros: ");
        int total = 0;
        for (int i=1; i<=10; i++) {
            int num = dado.nextInt();
            total += num;
        }
        System.out.println(total);
    }
}
