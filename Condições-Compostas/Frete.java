import java.util.Scanner;
public class Frete {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor comprado: ");
        double valor_compra = leitor.nextInt();
        double frete = 0;
        if (valor_compra < 120.00) {
            frete = 15.00;
            System.out.println("O valor do frete serah 15 reais");
            
        } else {
            System.out.println("O valor do frete serah isento");
            frete = 0;
        }
        double valor_total = valor_compra + frete;
        System.out.println("O valor total da compra serah: "+ valor_total);
    }
}
