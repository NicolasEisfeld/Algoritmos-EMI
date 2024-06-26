package lista03.nicolas;

/*
    Implemente um programa em Java que leia diversas Strings até que uma seja igual a "tchau" (pode estar escrito
    com minúsculas, maiúsculas ou misturado). O programa deve imprimir cada um dos caracteres da string, um por
    linha, em minúsculas, informando se é "vogal", "consoante" ou "branco". Em todos os outros casos, incluindo letras
    acentuadas e com cedilha ou outros caracteres, deve informar "inválido"
*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        String palavra = "";
        String todas_palavras = "";
        int tamanho = todas_palavras.length();
        
        boolean encerrar = false;
        while(encerrar == false) {
            palavra = dado.nextLine();
            todas_palavras += palavra;
            tamanho += todas_palavras.length();
            encerrar = palavra.equalsIgnoreCase("tchau");           
            
        }
        todas_palavras = todas_palavras.toLowerCase();
        for(int i=0; i<tamanho; i++) {
            Character caractere = todas_palavras.charAt(i);
            System.out.println(caractere);
        }
    }
}
