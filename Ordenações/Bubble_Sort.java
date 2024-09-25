
package Ordenações;

/*
    Aplicação do método de ordenação simples chamado Bubble com a técnica de troca Swapping.
*/

import java.util.Scanner;

public class Bubble_Sort {
    
    public static void sort (int [] vetor) {
        // Rodadas de Comparação
        for(int i = 0; i < vetor.length-1; i++) {
            // Sequência de Comparações por rodada
            for(int j = 0; j < vetor.length -i-1; j++) { // Fix: increment j, not i
                // Comparação para troca
                if (vetor[j] > vetor[j+1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        int tamanho = dado.nextInt();
        int min = dado.nextInt();
        int max = dado.nextInt();
        int Valores[] = GeradorAleatorio.geraInt(tamanho, min, max);
        
        for(int numero: Valores) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        sort(Valores);
        
        for(int numero: Valores) {
            System.out.print(numero + " ");
        }
        System.out.println();

    }

    
}
