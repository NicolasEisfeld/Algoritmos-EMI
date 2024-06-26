
package lista04.nicolas;

/*
    Escreva um algoritmo que solicite a digitação de um texto/frase e, em seguida, crie uma cadeia
    de caracteres com todos os caracteres da cadeia original separados por "-".
*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        
        String texto = dado.nextLine();
        
        for(int i=0; i<=texto.length() - 1; i++) {
            char caracteres = texto.charAt(i);
            
            System.out.print(caracteres + "-");
            
        }
    }
}
