import java.util.Scanner;
public class Bissexto_Avan {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um ano e eu direi se foi bissexto: ");
        int ano = leitor.nextInt();
        
        int divi_4 = ano % 4;   int divi_100 = ano % 100;   int divi_400 = ano % 400;
        
        if (divi_4 == 0 && (divi_100 != 0 || divi_400 == 0)) {
            System.out.println("Esse ano foi bissexto");
        } else {
            System.out.println("Esse ano naum foi bissexto");
        }
    }
}
