
package Lista_ArrayLists;

/*
    Escreva um programa em Java que crie uma lista para armazenar valores inteiros. Faça a leitura,
    a partir do teclado, de 25 valores e armazene na lista. Crie uma segunda lista para numeros
    inteiros. Percorra a primeira lista e remova todos os valores armazenados que são ímpares,
    inserindo-os na segunda lista.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        ArrayList <Integer> Valores_1 = new ArrayList();
        for(int i = 0; i < 25; i++) {
            Valores_1.add(dado.nextInt());
        }
        ArrayList <Integer> Valores_2 = new ArrayList();
        for(int i = 0; i < 25; i++) {
            if(Valores_1.get(i) % 2 == 1) {
                Valores_2.add(Valores_1.get(i));
                Valores_1.remove(i);
                Valores_1.add(0);
                
            } else {Valores_2.add(0);}
        }
    }
    
}
