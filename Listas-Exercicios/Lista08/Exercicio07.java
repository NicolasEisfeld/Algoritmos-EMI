
package Lista_PilhaseFilas;

/*
    Escreva um programa que crie uma fila para armazenar valores inteiros. Faça a leitura, a partir
    do teclado, de 30 valores e armazene na fila. Retire cada um dos elementos da fila e
    armazene-os em duas novas filas, uma somente para valores positivos e a outra para valores
    não-positivos.
*/

import java.util.Scanner;
import java.util.LinkedList;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        LinkedList<Integer> Valores = new LinkedList();
        for(int i = 0; i < 30; i++) {
            Valores.offer(dado.nextInt());
        }
        LinkedList<Integer> Positivos = new LinkedList(), Negativos = new LinkedList();
        while(!Valores.isEmpty()) {
            if(Valores.peek() > 0) {
                Positivos.offer(Valores.poll());
            } else if (Valores.peek() < 0) {
                Negativos.offer(Valores.poll());
            } else {Valores.poll();}
            
        }
    }
    
}
