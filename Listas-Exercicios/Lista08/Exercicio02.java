
package Lista_PilhaseFilas;

/*
    Escreva um programa que crie uma pilha para armazenar valores inteiros. Faça a leitura, a partir
    do teclado, de 30 valores e armazene na pilha. Retire cada um dos elementos da pilha e
    armazene-os em duas novas pilhas, uma somente para valores pares e a outra para valores
    ímpares.
*/

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02 {
   public static void main(String [] args) {
       Scanner dado = new Scanner(System.in);
       
       Stack<Integer> Valores = new Stack();
       
       for(int i = 0; i < 30; i++) {
           Valores.push(dado.nextInt());
       }
       Stack<Integer> Pares = new Stack(), Impares = new Stack();
       for(int i = 0; i < 30; i++) {
           if(Valores.pop() % 2 == 1) {
               Impares.push(Valores.pop());
           } else {
               Pares.push(Valores.pop());
           }
       }
   } 
}
