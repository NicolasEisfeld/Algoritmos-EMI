import java.util.Scanner;

public class Condicoes {
    public static void main(String [] args) {
        Scanner dado1 = new Scanner(System.in);
        
        String nome = dado1.next();
        
        if ("Nicolas".equals(nome)) {
            System.out.print("Vc é top");
        }
    }
}
