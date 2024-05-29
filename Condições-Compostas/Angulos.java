import java.util.Scanner;
public class Angulos {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        
        double angulo = dado.nextDouble();
        if (angulo == 90) {
            System.out.println("Angulo Reto");
        } else if (angulo < 90) {
            System.out.println("Angulo Agudo");
        } else {
            System.out.println("Angulo Obtuso");
        }
    }
}
