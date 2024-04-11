import java.util.Scanner;
public class Valores {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        double A = dado.nextDouble();
        
        System.out.println("Digite o valor de B");
        double B = dado.nextDouble();
        
        System.out.println("Digite o valor de C");
        double C = dado.nextDouble();
        
        System.out.println("Digite o valor de D");
        double D = dado.nextDouble();
        
        if (B > C && D > A && (C + D) > (A + B) && C >= 0 && D >= 0 & (A % 2) == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores negados");
        }
    }
}
