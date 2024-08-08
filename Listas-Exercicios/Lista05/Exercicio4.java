

package Lista_Vetores;

/*
    Faça um programa em Java que possua um vetor denominado A que armazene 6 números
    inteiros, lidos pelo teclado. O algoritmo deve executar os seguintes passos:
    a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
    b) Armazene em uma variável inteira (simples) a soma dos valores das posições A[0], A[1] e A[5]
    do vetor e mostre na tela esta soma.
    c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
    d) Mostre na tela cada valor do vetor A, um em cada linha.
*/

public class Exercicio4 {

    public static void main(String[] args) {
        int A[] = {1, 0, 5, -2, -5, 7};
        int soma = A[0] + A[1] + A[5];
        System.out.println(soma);
        A[4] = 100;
        System.out.println("");
        for(int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        
    }
    
}
