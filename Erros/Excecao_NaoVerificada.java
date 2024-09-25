
package Erros;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Excecao_NaoVerificada {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        boolean digitacao_ok = true;
        do {
            try {
                int valor = dado.nextInt();
                
            } catch (InputMismatchException exc) {
                digitacao_ok = false;
                System.out.println("Digite um valor válido");
                
                dado.nextLine();
            }
        } while(!digitacao_ok);
        System.out.println("Programa OK");
    }
    
}
