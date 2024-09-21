
package Ordenações;

public class Quick_SortV2 {
    public static void quickSort(int Valores[]) {
        long Tempo_inicial = System.nanoTime();
        int dados[] = new int[2]; 

        quickSort(Valores, 0, Valores.length - 1, dados);

        long Tempo_final = System.nanoTime();
        long Tempo_exec = Tempo_final - Tempo_inicial;
        System.out.println("Temporização: " + Tempo_exec + "ns");
        System.out.println("Comparação: " + dados[0]);
        System.out.println("Trocas: " + dados[1]);
        System.out.println("");
    }

    public static void quickSort(int Valores[], int abaixo, int acima, int dados[]) {
        if (abaixo < acima) {
            int pivo = partition(Valores, abaixo, acima, dados);
            quickSort(Valores, abaixo, pivo - 1, dados);
            quickSort(Valores, pivo + 1, acima, dados);
        }
    }

    public static int partition(int Valores[], int abaixo, int acima, int dados[]) {
        int pivo = Valores[acima];
        int i = abaixo - 1;

        for (int j = abaixo; j < acima; j++) {
            dados[0]++; 
            if (Valores[j] <= pivo) {
                i++;
                int temp = Valores[i];
                Valores[i] = Valores[j];
                Valores[j] = temp;
                dados[1]++; 
            }
        }

        int temp = Valores[i];
        Valores[i+1] = Valores[acima];
        Valores[acima] = temp;
        dados[1]++; 

        return i + 1;
    }


    public static void main(String[] args) {
        // Teste com valores ordenados
        int Vetor_Ord[] = {1, 2, 3, 4, 5};
        System.out.println("Array ordenado:");
        quickSort(Vetor_Ord);

        // Teste com valores ordenados inversamente
        int Vetor_invOrd[] = {5, 4, 3, 2, 1};
        System.out.println("Array ordenado inversamente:");
        quickSort(Vetor_invOrd);

        // Teste com valores aleatórios
        int Vetor_ran[] = {3, 1, 4, 1, 5};
        System.out.println("Array aleatório:");
        quickSort(Vetor_ran);
    }
}

/*
    Reflexão: O melhor caso seria o dos valores ordenados, pois o pivô sempre será o do meio e o vetor já está ordenado
    O pior caso seria o dos valores ordenados inversamente, 
    pois o pivô será um valor maior ou menor do vetor, e assim, terá um pior desempenho.
    O caso médio seria o dos valores aleatórios, pois terá um desempenho médio pelo fato de que o pivô estará em uma posição aleatória que terá que fazer diversas repartições
    Enfim, o QuickSort é um ótimo algoritmo de ordenação por ser categorizado como avançado, através da sua técnica de pivô e repartições em relação a ele.
*/