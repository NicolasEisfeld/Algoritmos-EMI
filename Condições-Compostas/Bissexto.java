import java.util.Scanner;
public class Bissexto {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um ano e eu direi se foi bissexto: ");
        int ano = leitor.nextInt();
        int divi = ano % 4;
        
        if (divi == 0) {
            System.out.println("Esse ano foi bissexto");
        } else {
            System.out.println("Esse ano naum foi bissexto");
        }
    }
}
