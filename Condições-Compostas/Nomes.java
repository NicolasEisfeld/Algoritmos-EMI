import java.util.Scanner;
public class Nomes {
    public static void main(String [] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o nome do mano: ");
        String nome = leitura.nextLine();
        switch (nome) {
            case "Nicolas" :
            case "Andre" :
            case "Matheus" :
            case "Phelipe" :
            case "Tiago" :
                System.out.println("Esse dai eh info");
                break;
            default : 
                System.out.println("Esse dai n sei");
                break;
    }
        
        
            
    }
    
}
