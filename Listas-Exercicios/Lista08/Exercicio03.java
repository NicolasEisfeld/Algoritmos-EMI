
package Lista_PilhaseFilas;

/*
    Escreva um programa que crie uma pilha para armazenar valores inteiros. Faça a leitura, a partir
    do teclado, de 25 valores e armazene na pilha. Retire cada um dos elementos da pilha e
    armazene-os em duas novas pilhas, uma somente para valores pares negativos e a outra para
    valores ímpares positivos. Descarte todos os demais.
*/

import java.util.Scanner;
import java.util.Stack;

public class Exercicio03 {
   public static void main(String [] args) {
       Scanner dado = new Scanner(System.in);
       
       Stack<Integer> Valores = new Stack();
       
       for(int i = 0; i < 25; i++) {
           Valores.push(dado.nextInt());
       }
       Stack<Integer> Positivos = new Stack(), Negativos = new Stack();
       for(int i = 0; i < 25; i++) {
           if(Valores.pop() < 0) {
               Negativos.push(Valores.pop());
           } else if(Valores.pop() > 0){
               Positivos.push(Valores.pop());
           } else {
               Valores.pop();
           }
       }
   } 
}
