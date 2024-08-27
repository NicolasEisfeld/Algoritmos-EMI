
package Lista_ArrayLists;

/*
    Escreva um programa em Java que crie uma lista para armazenar valores inteiros. Em seguida,
    faça a leitura, a partir do teclado, de 20 valores e armazene na lista.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        ArrayList <Integer> Valores = new ArrayList();
        for(int i = 0; i < 20; i++) {
            Valores.add(dado.nextInt());
        }
    }
    
}
