
package Vetores;

import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        int tamanho = dado.nextInt();
        int valores[] = new int [tamanho];
        for(int i = 0; i< valores.length; i++) {
            valores[i] = dado.nextInt();
        }
    }
    
}
                    