
package Ordenações;

/*
    Aplicação do método de ordenação avançado chamado Quicksort com a técnica de troca Swapping.
    1º - Partição
    2º - Ordenar Partições
*/

import java.util.Scanner;

public class Quick_Sort {
    public static int partition(int vetor[], int inicio, int fim) {
        int pivo = vetor[fim];
        int q = inicio-1;
        int r;
        
        for( r = inicio; r < fim; r++) {
            if (vetor [r] <= pivo) {
                q++;
                int temp = vetor[q];
                vetor[q] = vetor[r];
                vetor[r] = temp;
                
                   
            }
        }
        
        int temp = vetor[fim];
        vetor[fim] = vetor[q+1];
        vetor[q+1] = temp;
        return q+1;
    }
    
    public static void sort(int vetor[], int inicio, int fim) {
        if ( inicio < fim) {
            int meio = partition(vetor, inicio, fim);
            sort(vetor, inicio, meio - 1);
            sort(vetor, meio + 1, fim);
        }
    }
    
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        
        int tamanho = dado.nextInt();
        int min = dado.nextInt();
        int max = dado.nextInt();
        
        int vetor[] = GeradorAleatorio.geraInt(tamanho, min, max);
        
        Quick_Sort.sort(vetor, 0, vetor.length-1);
    }
}
