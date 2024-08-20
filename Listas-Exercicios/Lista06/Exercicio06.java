
package Lista_Subrotinas;

/*
    Escreva um algoritmo que leia e armazene num vetor 7 números inteiros que devem estar entre
    1 e 99, incluindo os extremos. O programa não pode aceitar valores fora do intervalo.
*/

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int Vetor[] = new int[7];
        for(int i = 0; i < 7; i++) {
            int num = dado.nextInt();
            if(num <= 99) {
                Vetor[i] = num;
            }
        }
    }
    
}
