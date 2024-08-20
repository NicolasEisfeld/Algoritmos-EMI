
package Lista_Subrotinas;

/*
    Escreva um novo programa, alterando o exercício 7, e leia e armazene, num vetor diferente do
    anterior, mais 6 números inteiros, que devem estar entre 1 e 99, incluindo os extremos.
*/

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int Vetor_1[] = new int[7], Vetor_2[] = new int[6] ;
        for(int i = 0; i < 7; i++) {
            int num = dado.nextInt();
            if(num <= 99) {
                Vetor_1[i] = num;
            }
        }
        
        for(int i = 0; i < 6; i++) {
            int num = dado.nextInt();
            if(num <= 99) {
                Vetor_2[i] = num;
            }
        }        
        
    }
    
}

