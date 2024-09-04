
package Vetores;

import java.util.Scanner;

public class Busca_Linear {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        int tamanho = dado.nextInt();
        int Array[] = new int[tamanho];
        int valor = dado.nextInt();
        int i;
        for( i=0; i< tamanho; i++) {
            Array[i] = dado.nextInt();
            if(Array[i] == valor) {
                break;
            }
        }
        
        if(i == Array.length) {System.out.println("Naum encontrei");}
        else{System.out.println("Encontrei na posicao "+ i);}
        
    }
}
