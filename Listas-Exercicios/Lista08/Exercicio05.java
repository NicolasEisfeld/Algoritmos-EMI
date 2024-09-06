
package Lista_PilhaseFilas;

/*
    Escreva um programa para converter um número inteiro decimal para binário. Leia um número
    inteiro decimal do usuário. Enquanto o quociente da divisão for maior que zero, calcule o resto da
    divisão por 2 e empilhe esse resto. Use o novo quociente como divisor e prossiga. Ao final,
    Desempilhe os elementos e concatene-os para formar o número binário.
*/

import java.util.Scanner;
import java.util.Stack;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Stack<String> Valores_Bi = new Stack();
        int num = dado.nextInt();
        while( num % 2 > 0) {
            int resto = num % 2;
            
            Valores_Bi.push(String.valueOf(resto));
            num = num / 2;
            
        }
        StringBuilder Binario = new StringBuilder();
        while(!Valores_Bi.isEmpty()) {
            Binario.append(Valores_Bi.pop());
        }
        System.out.println(Binario);
        
    }
    
}
