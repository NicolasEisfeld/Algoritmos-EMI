
package Ordenações;

public class Merge_SortV2 {
    public static void MergeSort(int Valores[]) {
        long Tempo_inicial = System.nanoTime();
        int[] dados = new int[2];

        Separar(Valores, 0, Valores.length - 1, dados);

        long Tempo_final = System.nanoTime();
        long Tempo_exec = Tempo_final - Tempo_inicial;
        System.out.println("Temporização: " + Tempo_exec + "ns");
        System.out.println("Comparação: " + dados[0]);
        System.out.println("Trocas: " + dados[1]);
        System.out.println("");
    }

    public static void Separar(int Valores[], int inicio, int fim, int dados[]) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            Separar(Valores, inicio, meio, dados);
            Separar(Valores, meio + 1, fim, dados);
            merge(Valores, inicio, meio, fim, dados);
        }
    }

    public static void merge(int Valores[], int inicio, int meio, int fim, int dados[]) {
        int i = inicio, j = meio + 1, k = inicio;
        int[] temp = new int[Valores.length];

        while (i <= meio && j <= fim) {
            dados[0]++;
            if (Valores[i] <= Valores[j]) {
                temp[k++] = Valores[i++];
            } else {
                temp[k++] = Valores[j++];
                dados[1]++;
            }
        }

        while (i <= meio) {
            temp[k++] = Valores[i++];
        }

        while (j <= fim) {
            temp[k++] = Valores[j++];
        }

        for (i = inicio; i <= fim; i++) {
            Valores[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        // Teste com valores ordenados
        int Vetor_Ord[] = {1, 2, 3, 4, 5};
        System.out.println("Array ordenado:");
        MergeSort(Vetor_Ord);

        // Teste com valores ordenados inversamente
        int Vetor_invOrd[] = {5, 4, 3, 2, 1};
        System.out.println("Array ordenado inversamente:");
        MergeSort(Vetor_invOrd);

        // Teste com valores aleatórios
        int Vetor_ran[] = {3, 1, 4, 1, 5};
        System.out.println("Array aleatório:");
        MergeSort(Vetor_ran);
    }
}

/*
    Reflexão: Os melhores casos, é quando os valores estão ordenados ou ordenados inversamente, 
    pois como os arrays já estão ordenados, precisará somente mesclar os arrays de acordo com a ordem certa.
    O caso médio seria o dos valores aleatórios, pois terá um desempenho médio-bom (melhor que o BubbleSort) em vários casos.
    O MergeSort será uma ótima opção para conjunto de dados maiores, pois sempre terá uma ideia de "dividir para conquistar", 
    o que faz que os casos maiores se dividem em casos menores que podem se dividirem em casos menores ainda, e assim por diante.
*/