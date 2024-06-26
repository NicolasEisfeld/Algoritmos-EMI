package lista04.nicolas;

/*
    Escreva um algoritmo que solicite a digitação de um número de telefone, incluindo o DDD, como
    a seguir: "5433211111" e gere uma nova sequência com o número do telefone formatado da
    seguinte maneira: (54)3321-1111
*/

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        
        String numero = dado.nextLine();
        
        for(int i=0; i<=numero.length() - 1; i++) {
            char caractere = numero.charAt(i);
            
            if(i == 0) {System.out.print("("+caractere);} else {
                if(i == 1) {System.out.print(caractere+")");} else {
                    if(i == 5) {System.out.print(i + "-");} 
                        else {System.out.print(caractere);}
                } 
                    
            }
            
            
        }
             
            
    
    }
}

