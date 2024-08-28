
package Pilhas;

import java.util.Scanner;
import java.util.Stack;

public class zero {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int N = dado.nextInt(), soma = 0;
        Stack< Integer > Valores = new Stack();
        for(int i = 0; i < N; i++) {
           Valores.push(dado.nextInt());
        }
        for(int i = 0; i < N; i++) {
            if(Valores.push(i) == 0) {
                Valores.pop();
            } 
            soma += Valores.push(i);
            
        }
        System.out.println(soma);
    }
    
}
