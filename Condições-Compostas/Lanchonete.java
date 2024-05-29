import java.util.Scanner;
public class Lanchonete {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        System.out.print("Escolha:\n1-Coxinha - 5,50\n2-Risoles - 6,00\n3-Pão de Queijo - 5,00: ");
        int salgado = dado.nextInt();
        double valorsalgado = 0;
        switch (salgado) {
            case 1:
                System.out.println("Selecionado");
                valorsalgado = 5.5;
                break;
            case 2:
                System.out.println("Selecionado");
                valorsalgado = 6.0;
                break;
            case 3:
                System.out.println("Selecionado");
                valorsalgado = 5.0;
                break;
        }
        System.out.println("Escolha:\n1-Agua - 3,00\n2-Suco - 3,50\n3-Chá - 4,50: ");
        int bebida = dado.nextInt();
        double valorbebida = 0;
        switch (bebida) {
            case 1:
                System.out.println("Selecionado");
                valorbebida = 3.0;
                break;
            case 2:
                System.out.println("Selecionado");
                valorbebida = 3.5;
                break;
            case 3:
                System.out.println("Selecionado");
                valorbebida = 4.5;
                break;
        }
        double valortotal = valorsalgado + valorbebida;
        System.out.println("O Valor Total do pedido eh "+ valortotal);
    }
}
