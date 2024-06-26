package lista04.nicolas;

/*
    Escreva um algoritmo que solicite a digitação de um texto/frase e, em seguida, extraia e imprima
    a primeira palavra da cadeia.

*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        String texto = dado.nextLine();
        int espaco = texto.indexOf(' ');
        if (espaco != -1) {
            String frase = texto.substring(0, espaco);

            System.out.println(frase);        

        }
    }
}
