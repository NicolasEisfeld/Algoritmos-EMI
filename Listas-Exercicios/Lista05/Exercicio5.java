
package Lista_Vetores;
/*
    Escreva um programa em Java que leia 10 números inteiros. Como saída, deve informar se
    existe algum igual. Não precisa informar quais são os números, apenas se há duplicatas.
*/
import java.util.Scanner;
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int Valores[] = new int[10];
        for(int i = 0; i < Valores.length; i++) {
            Valores[i] = dado.nextInt();
        }
        for(int i = 0; i < Valores.length; i++) {
            if(i < 9 && Valores[i] == Valores[i+1]) {
                System.out.println("Duplicata achada");
            }
        }    
    }
    
}
