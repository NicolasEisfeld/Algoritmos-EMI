
package Pilhas;

import java.util.Stack;
import java.util.Scanner;

public class Pilhas {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        Stack< String > Pilha = new Stack();
        
        System.out.println(Pilha.size());
        System.out.println(Pilha.isEmpty());
        
        Pilha.push( "Matheus de Vargas" );
        Pilha.push( "Phelipe Schmidt");
        Pilha.push( "André Maciag" );
        Pilha.push( "Nicolas Ferreira");
        Pilha.push( "Tiago Mello");
        
        Pilha.push(dado.nextLine());
        
        System.out.println(Pilha.pop());
        String Ultimo = Pilha.peek();
        System.out.println(Ultimo);
    }
    
}
