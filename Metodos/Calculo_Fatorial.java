
package Metodos;

import java.util.Scanner;
public class Calculo_Fatorial {
    private static Scanner dado = new Scanner(System.in);
    private static double valor;
    private static long fatorial;
    public static double Fatorial() {
        valor = dado.nextDouble();
        if ( valor <= 1) {
            return fatorial = 1;
        } 
        else {
            fatorial = 1;
            for (int i=1; i<=valor; i++) {
                fatorial = i * fatorial;
            }
        }
        
        return fatorial;
    }
    
    public static void main(String [] args) {
        Fatorial();
        System.out.println(fatorial);
    }
        
}
