package lista04.nicolas;

/*
    Escreva um algoritmo que solicite a digitação de um texto/frase e, em seguida, imprima o número
    de palavras existente na mesma.
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        String texto = dado.nextLine();
        
        String palavras[] = texto.split(" ");
        
        int num = palavras.length;
        System.out.println(num); 
        
                   

    
    }    
}
