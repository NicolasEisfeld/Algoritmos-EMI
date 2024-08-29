
package Pilhas;

import java.util.Scanner;
import java.util.Stack;

public class zero {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int N = dado.nextInt(), soma = 0;
        Stack< Integer > Valores = new Stack();
        
        for(int i = 0; i < N; i++) {
           int valor = dado.nextInt();
           if(valor != 0) {
                Valores.push(valor);
           } else {
               Valores.pop();
           }
           
        }
        
        while( ! Valores.isEmpty()) {
            int valor = Valores.pop();
            soma += valor;
        }
        

        System.out.println(soma);
    }
    
}
