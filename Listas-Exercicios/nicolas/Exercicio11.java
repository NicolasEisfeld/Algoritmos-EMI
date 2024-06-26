package lista03.nicolas;

/*
    Implemente em Java um programa que leia uma quantidade não determinada de pares de números inteiros. 
    O programa deve parar quando um dos números for zero (0). 
    Para cada par (M e N) lido, mostre a sequência crescente de números do menor até o maior 
    e a soma de todos os valores da sequência (incluindo o M e N).

    ex.: 5 2 
    2 3 4 5 Soma=14

         6 3 
    3 4 5 6 Soma=18

    5 0 (deve encerrar)

*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        int soma = 0;
        int M = 1, N = 1;
        
        while(N != 0 || M != 0) {
             M = dado.nextInt();
             if(M == 0) {break;}
             
             N = dado.nextInt();
             if(N == 0) {break;}
             
             if(M < N) {
                 for(int i=M; i<=N; i++) {
                     System.out.println(i);
                     soma += i;
                 }
             }
             if(M > N) {
                 for(int i=N; i<=M; i++) {
                     System.out.println(i);
                     soma += i;
                 }
             }
             System.out.println("Soma="+ soma);
        }
        
    }
}
