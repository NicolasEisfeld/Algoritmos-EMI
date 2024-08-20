
package Lista_Subrotinas;

/*
    Escreva um novo programa, alterando o exercício 1, pesquisando qual é o menor e o maior dos
    50 números.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        double Valores[] = new double[50];
        double Menor = 0, Maior = 0;
        for(int i = 0; i < 50; i++) {
            Valores[i] = dado.nextDouble();
        }
        Arrays.sort(Valores);
        for(int i = 0; i < 50; i++) {
            Menor = Valores[0];
            Maior = Valores[49];
        }
        System.out.println(Menor);
        System.out.println(Maior);
     
    }
}
