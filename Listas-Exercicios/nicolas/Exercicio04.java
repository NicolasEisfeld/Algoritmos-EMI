package lista03.nicolas;

/*
    Escreva um programa que leia um número inteiro qualquer e identifique se ele é primo. Números primos são todos
    aqueles que são divisíveis apenas por 1 e por si mesmos.
*/

import java.util.Scanner;

public class Exercicio04 {
     public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        boolean Primo = false;
        int num = dado.nextInt();
        if(num == 1 || num == 2) {
            Primo = true;
        }
        for(int i=2; i<num; i++) {
            if(num % i == 0) {
                Primo = false;
                break;
            } else {Primo = true;}
        }    
        if(Primo == true) {
            System.out.println("Eh primo");
        } else{System.out.println("Naum eh primo");}
    }
}
