import java.util.Scanner;
public class Pizzaria {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Escolha o tamanho das sua pizza: \nDigite 1 para o tamanho pequeno\nDigite 2 para o tamanho medio \nDigite 3 para o tamanho grande \nDigite 4 para o tamanho super\nDigite 5 para o tamanho familia) ");
        int tamanho = leitor.nextInt();
        
        switch (tamanho) {
            case 1, 2:
                System.out.println("Serah possivel um sabor");
                break;
            case 3:
                System.out.println("Serah possivel 3 sabores");
                break;
            case 4:
                System.out.println("Serah possivel 4 sabores");
                break;
            case 5:
                System.out.println("Serah possivel 5 sabores");
                break;
            default:
                System.out.println("Tamanho/valor invalido");
                break;
        }
            
    } 
}
