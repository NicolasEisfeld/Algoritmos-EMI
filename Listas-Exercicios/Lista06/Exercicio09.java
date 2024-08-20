
package Lista_Subrotinas;

/*
    Escreva um novo programa, alterando o exercício 8, e pesquise quantos números dos 7 do
    primeiro vetor são iguais a algum dos 6 números do segundo vetor
*/

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int Vetor_1[] = new int[7], Vetor_2[] = new int[6] ;
        int cont_Iguais = 0;
        for(int i = 0; i < 7; i++) {
            int num = dado.nextInt();
            if(num <= 99) {
                Vetor_1[i] = num;
            }
        }
        
        for(int i = 0; i < 6; i++) {
            int num = dado.nextInt();
            if(num <= 99) {
                Vetor_2[i] = num;
            }
        }
        
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 6; j++) {
                if(Vetor_1[i] == Vetor_2[j]) {cont_Iguais++;}
            }
        }
        System.out.println(cont_Iguais);
        
    }
    
}
