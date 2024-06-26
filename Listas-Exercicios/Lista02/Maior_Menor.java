import java.util.Scanner;

public class Maior_Menor {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        double valor = 1; 
        double valormaior = 0; 
        double valormenor = 0;
        for (int i=1; i<=20; i++) {
            valor = dado.nextDouble();
            if(valor > valormaior) {
                valormaior = valor;
            }
            if(valor < valormenor) {
                valormenor = valor;
            }
            
                
        }
        System.out.println(valormenor);
        System.out.println(valormaior);
        
        
    }
}
