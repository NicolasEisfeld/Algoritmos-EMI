import java.util.Scanner;
public class Triplos {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        System.out.print("Digite 10 numeros: ");
        for(int i=1; i<=10; i++) {
            int num = dado.nextInt();
            System.out.println(num * 3);
        }
    }
}
