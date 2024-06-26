/*
     Você deve escrever um programa que exiba uma saída como aparece no exemplo abaixo.
        I=1 J=7
        I=1 J=6
        I=1 J=5
        I=3 J=7
        I=3 J=6
        I=3 J=5
        ...
        I=9 J=7
        I=9 J=6
        I=9 J=5

*/

package lista03.nicolas;

public class Exercicio02 {
    public static void main(String [] args) {
        int cont = 0;
        int i = 1, j = 8;
        for(int valor=1; valor<=9; valor++) {
            cont++;
            System.out.println(i);
            if(cont == 3) {
                i *= 3;
                cont = 0;
            }
        }
        System.out.println("");
        for(int num=1; num<=9; num++) {
            j--;
            cont++;
            System.out.println(j);
            if(cont == 3) {
                j = 8;
                cont = 0;
            }
        }
    }
}
