
package Lista_Subrotinas;

/*
    Escreva um programa em Java que leia e armazene 50 números reais
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        double Valores[] = new double[50];
        for(int i = 0; i < 50; i++) {
            Valores[i] = dado.nextDouble();
        }
    }
}
