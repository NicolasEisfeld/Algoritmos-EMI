
package Lista_PilhaseFilas;

/*
    Escreva um programa que crie uma pilha para armazenar valores inteiros. Em seguida, faça a
    leitura, a partir do teclado, de 20 valores e armazene na pilha. Ao final, retire todos os elementos
    da pilha e imprima na tela cada um.  
*/

import java.util.Scanner;
import java.util.Stack;

public class Exercicio01 {
   public static void main(String [] args) {
       Scanner dado = new Scanner(System.in);
       
       Stack<Integer> Valores = new Stack();
       
       for(int i = 0; i < 20; i++) {
           Valores.push(dado.nextInt());
       }
       for(int i = 0; i < 20; i++) {
           System.out.println(Valores.pop());
       }
   } 
}
