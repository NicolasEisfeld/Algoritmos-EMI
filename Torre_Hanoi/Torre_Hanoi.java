
import java.util.Scanner;
import java.util.Stack;

/* Autor: Nicolas Eisfeld Ferreira
https://github.com/NicolasEisfeld/ */

/*
    Deve ser programado um algoritmo em Java da Torre de Hanói, com um número de discos informado pelo usuário. 
    O programa deve informar qual o número mínimo de movimentos necessários e listar os movimentos necessários para resolver a Torre com o número informado.

*/

public class Torre_Hanoi {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int N_Discos = dado.nextInt(); // Quantidade de Discos
        double N_Minimo = Math.pow(2, N_Discos) - 1;
        System.out.println(N_Minimo); // Exibir número mínimo de jogadas
        Stack<Integer> Origem = new Stack();
        for(int i = N_Discos; i > 0; i--) { //Inserir todos os discos na haste de Origem
            Origem.push(i);
        }
        Stack<Integer> Auxiliar = new Stack();
        Stack<Integer> Destino = new Stack();
        
    }
    
}
