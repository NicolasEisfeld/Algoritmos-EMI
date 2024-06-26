package lista04.nicolas;

/*
    Escreva um algoritmo que solicite a digitação de uma sequência de números (na forma de um
    texto, ex.: "939387473827023904823984274611230934756" e procure se existe algum par de
    números iguais (ex.: "11", "22' etc)

*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main (String [] args) {
        Scanner dado = new Scanner(System.in);
        
        String nums = dado.nextLine();
        
        for(int i=0; i< nums.length() - 1; i++) {
            if(nums.charAt(i) == nums.charAt(i+1)) {
                System.out.println("Par encontrado: " + nums.charAt(i) + nums.charAt(i+1));
            } else {
                System.out.println("Par naum encontrado");
            }
        }
    }
}
