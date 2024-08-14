
package Lista_Vetores;
/*
    Escreva um programa em Java que leia 100 números naturais, cujos valores estão no intervalo
    [1, 10], e conte quantos números de cada valor (1 a 10) existe.
*/

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int valores[] = new int[100];
        int cont_valores[] = new int[10];
        for(int i = 0; i < valores.length; i++) {
            valores[i] = dado.nextInt();
        }
        for(int j = 0; j < 10; j++) {
            for(int i = 0; i < valores.length; i++) {
                if(valores[i] == j+1) {
                    cont_valores[j]++;
                }
            }
            System.out.println(cont_valores[j]);
        }
        
    }
    
}
