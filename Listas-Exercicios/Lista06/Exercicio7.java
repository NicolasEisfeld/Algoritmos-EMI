
package Lista_Subrotinas;

/*
    Escreva um algoritmo que leia e armazene num vetor 7 números inteiros que devem estar entre
    1 e 99, incluindo os extremos. O programa não pode aceitar valores fora do intervalo.
*/

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int Vetor[] = new int[7];
        boolean Igual = false;
        for(int i = 0; i < 7; i++) {
            int num = dado.nextInt();
            if(num <= 99) {
                Vetor[i] = num;
            }
        }
        int valor = dado.nextInt();
        for(int i = 0; i < Vetor.length; i++) {
            if(valor == Vetor[i]) {Igual = true;}
        } 
        if(Igual == true) {
            System.out.println("Possui igual");
        } else{System.out.println("Naum possui igual");}
    }
    
}
