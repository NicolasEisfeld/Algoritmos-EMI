
package Lista_PilhaseFilas;

/*
    Escreva um programa para converter um número inteiro decimal para binário. Leia um número
    inteiro decimal do usuário. Enquanto o quociente da divisão for maior que zero, calcule o resto da
    divisão por 2 e empilhe esse resto. Use o novo quociente como divisor e prossiga. Ao final,
    Desempilhe os elementos e concatene-os para formar o número binário. Na figura abaixo é
    demonstrado um exemplo da primeira etapa, que é o cálculo e empilhamento
*/

import java.util.Scanner;
import java.util.Stack;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Stack<Integer> Valores_Bi = new Stack();
        int num = dado.nextInt();
        while( num % 2 > 0) {
            int resto = num % 2;
            System.out.println(resto);
            num = num / 2;
            Valores_Bi.push(num);
            Valores_Bi.push(resto);
            
        }
        int Binario = 0;
        for(int i = Valores_Bi.size(); i > 0; i--) {
            if(i > 0) {
                Binario += Valores_Bi.pop() / 10;
            } else {Binario = Valores_Bi.pop();}
        }
        System.out.println(Binario);
        
    }
    
}
