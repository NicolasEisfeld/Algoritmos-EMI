
package Lista_PilhaseFilas;

/*
    Escreva um programa que leia uma string. Em seguida, empilhe cada um dos caracteres da
    string, desde o início. Desempilhe os caracteres e junte-os (concatene-os numa nova string).
    Imprima a nova string.

*/

import java.util.Scanner;
import java.util.Stack;

public class Exercicio04 {
   public static void main(String [] args) {
       Scanner dado = new Scanner(System.in);
       Stack<Character> Pilha = new Stack();
       String Texto = dado.nextLine();
       for(int i = 0; i < Texto.length(); i++) {
           Pilha.push(Texto.charAt(i));
           System.out.println(Pilha);
       }
       String Texto_refeito = "";
       while(!Pilha.isEmpty()) {
           Texto_refeito += Pilha.getLast();
           Pilha.pop();
           
       }
       System.out.println(Texto_refeito);
   } 
}
