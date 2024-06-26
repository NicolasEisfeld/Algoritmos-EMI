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
    
        while(true) {
            String palavra = dado.nextLine().toLowerCase();
        
            if(palavra.equals("tchau")) {
                break;

            }            

            for(int i=0; i<palavra.length(); i++) {
                char caractere = palavra.charAt(i);
                
                
                if(caractere == 'a' || caractere == 'e' || caractere == 'i' 
                || caractere == 'o' || caractere == 'u') {
                    System.out.println(caractere + "- vogal");
                } else {
                    if (Character.isWhitespace(caractere)) {
                        System.out.println(caractere + "- caractere em branco");
                    } else {System.out.println(caractere + "- consoante");}                  
                } 
                

                
            }
        }
        
    }
}
