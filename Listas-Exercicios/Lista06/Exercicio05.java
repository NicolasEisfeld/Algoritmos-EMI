
package Lista_Subrotinas;

/*
 Escreva um novo programa, alterando o exercício 1, incluindo o cálculo da média aritmética dos
 50 números.
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        double Valores[] = new double[50];
        double Media, Cont_Abaixo = 0, Soma = 0.0;
        for(int i = 0; i < 50; i++) {
            Valores[i] = dado.nextDouble();
        }
        for(int i = 0; i < 50; i++) {
            Soma += Valores[i];
        }
        Media = Soma / 50;
        System.out.println("Media dos valores: " + Media);
        for(int i = 0; i < 50; i++) {
            if(Valores[i] < Media) {
                Cont_Abaixo++;
            }
        }
        System.out.println("Valores que estão acima da media: "+ Cont_Abaixo);
        
    }
}
