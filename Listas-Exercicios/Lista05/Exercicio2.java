
package Lista_Vetores;

/*
 Elabore um programa em Java que leia dois vetores de dez elementos reais e faça a
 multiplicação dos elementos de mesmo índice, colocando o resultado em um terceiro vetor, que
 deve ser mostrado como saída.
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double Valores_1[] = new double[10], Valores_2[] = new double[10], Resultado[] = new double[10];

        for(int i=0; i < Valores_1.length; i++) {
            Valores_1[i] = dado.nextDouble();
            Valores_2[i] = dado.nextDouble();
            System.out.println("");
            
        }
        for(int i=0; i < Valores_2.length; i++) {
            Resultado[i] = Valores_1[i] * Valores_2[i];
            System.out.println(Resultado[i]);
        }
    }
    
}
