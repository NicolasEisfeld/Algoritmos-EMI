
package Ordenações;

public class Bubble_SortV2 {
    public static void BubbleSort(int Valores[]) {
        long Tempo_inicial = System.nanoTime();
        int comp = 0;
        int trocas = 0;

        int n = Valores.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comp++;
                if (Valores[j] > Valores[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = Valores[j];
                    Valores[j] = Valores[j + 1];
                    Valores[j + 1] = temp;
                    trocas++;
                }
            }
        }

        long Tempo_final = System.nanoTime();
        long Tempo_exec = Tempo_final - Tempo_inicial;
        System.out.println("Temporização: " + Tempo_exec + "ns");
        System.out.println("Comparação: " + comp);
        System.out.println("Trocas: " + trocas);
        System.out.println("");
    }

    public static void main(String[] args) {
        // Teste com um Array ordenado
        int Vetor_Ord[] = {1, 2, 3, 4, 5};
        BubbleSort(Vetor_Ord);

        // Teste com um Array ordenado inversamente
        int Vetor_invOrd[] = {5, 4, 3, 2, 1};
        BubbleSort(Vetor_invOrd);

        // Teste com um Array Aleatório
        int Vetor_Ran[] = {3, 1, 4, 1, 5};
        BubbleSort(Vetor_Ran);
    }
}

/*
    Reflexão: No array ordenado, o desempenho é extremamente eficaz 
    (na verdade nem precisava ordenar, pois já está ordenado), 
    pois não precisará fazer nenhuma troca e fará quase que instantaneamente.
    O pior dos casos é o de ordenação inversa, pois o algoritmo terá que fazer n-1 trocas (sendo n, o tamanho do Array).
    Assim, o desempenho será horrível e uma cronometragem longa. È mais indicado usar outros tipos de ordenação.
    O caso médio será o do array aleatório. Terá um desempenho médio-ruim e um tempo médio.
    Lembrando que em casos de vetores maiores, não é recomendado usar este tipo de ordenação por ser algo mais didático
    e simples do que outros mais avançados e complexos.
    
*/