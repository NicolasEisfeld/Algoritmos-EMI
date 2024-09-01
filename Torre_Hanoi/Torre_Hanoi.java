
import java.util.Scanner;

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
        Hanoi(N_Discos, "T1", "T2", "T3"); // Chama o método recursivo
        System.out.println(movimento); // Exibe o return do método
        
    }
    public static Hanoi (int Discos, String Origem, String Auxiliar, String Destino) {
        if (Discos > 0) { // Solução através da recursividade 
            Hanoi(Discos-1, Origem, Destino, Auxiliar); // Os movimentos da origem para auxiliar (n-1)
            System.out.println("Mover Disco "+ Discos + " de " + Origem + "para " + Destino);
            Hanoi(Discos-1, Auxiliar, Origem, Destino); // Os movimentos do auxiliar para o destino (n-1)
        }
    }
    
}
