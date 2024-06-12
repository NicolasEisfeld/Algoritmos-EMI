import java.util.Scanner;

public class Estatisticas {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        double valor;
        double soma = 0.0, maximo, minimo, media;
        int cont = 0;
        valor = maximo = minimo = dado.nextDouble();
        while(valor != 0.0) {
            cont++;
            
            soma = soma + valor;
            if(valor < minimo) {
                minimo = valor;
            } else { 
                if(valor > maximo) {
                    maximo = valor;
                }
            }
            valor = dado.nextDouble();
            
        }
        if(cont != 0) {
            media = soma / cont;
            System.out.println(minimo);
            System.out.println(maximo);
            System.out.println(cont);
            System.out.println(media);
        }
        
        
    }
}
