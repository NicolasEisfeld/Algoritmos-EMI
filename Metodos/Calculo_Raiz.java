
package Metodos;

import java.util.Scanner;

public class Calculo_Raiz {
    private static Scanner dado = new Scanner(System.in);
    private static double raiz, indice, radicando;
    public static double Raiz() {
        indice = dado.nextInt();
        radicando = dado.nextInt();
    
        raiz = Math.pow(radicando, 1.0 / indice);
        return raiz;
    }
    
    public static void main(String [] args) {
        Raiz();
        System.out.println( raiz );
    }
            
        
    
}
