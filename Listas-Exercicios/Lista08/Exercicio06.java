
package Lista_PilhaseFilas;

/*
    Escreva um programa que crie uma fila para armazenar valores inteiros. Em seguida, faça a
    leitura, a partir do teclado, de 20 valores e armazene na fila. Ao final, retire todos os elementos
    da fila e imprima na tela cada um.
*/

import java.util.Scanner;
import java.util.LinkedList;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        LinkedList<Integer> Valores = new LinkedList();
        for(int i = 0; i < 20; i++) {
            Valores.offer(dado.nextInt());
        }
        while(!Valores.isEmpty()) {
            System.out.println(Valores.poll());
        }
    }
    
}
