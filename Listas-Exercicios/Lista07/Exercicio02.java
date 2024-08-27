
package Lista_ArrayLists;

/*
    Escreva um programa em Java que crie uma lista para armazenar valores inteiros. Faça a leitura,
    a partir do teclado, de 30 valores e armazene na lista. Percorra a lista e informe o índice de todos
    os valores armazenados que são ímpares.

*/

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        ArrayList <Integer> Valores = new ArrayList();
        for(int i = 0; i < 30; i++) {
            Valores.add(dado.nextInt());
        }
        for(int i = 0; i < 30; i++) {
            if(Valores.get(i) % 2 == 1) {
                System.out.println("Indice: " + Valores.indexOf(i));
            } else {System.out.println(" ");}
        }
    }
    
}
