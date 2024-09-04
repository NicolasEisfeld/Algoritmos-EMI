
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
        int Discos = dado.nextInt(); // Quantidade de Discos (Entrada: 0 < Discos)
        double N_Minimo = Math.pow(2, Discos) - 1;
        System.out.println("O numero minimo de jogadas possiveis eh: " + (int)N_Minimo); // Exibir número mínimo de jogadas
        System.out.println("Sequencia da solucao com " + Discos+" Discos: ");
        Hanoi(Discos, "T1", "T2", "T3"); // Chama o método recursivo
        
    }
    public static void Hanoi (int Discos, String Origem, String Auxiliar, String Destino) {
        if (Discos > 1) {
        Hanoi(Discos-1, Origem, Destino, Auxiliar); // Os movimentos da origem para auxiliar (n-1)
        System.out.println("Mover Disco "+ Discos + " de " + Origem + " para " + Destino);
        Hanoi(Discos-1, Auxiliar, Origem, Destino); // Os movimentos do auxiliar para o destino (n-1)
        }
        else if (Discos == 1) {
            System.out.println("Mover Disco "+ Discos + " de " + Origem + " para " + Destino); 
            return;
        } else { // Não é possível ter discos negativos, assim o código deve ser encerrado
            System.out.println("Valor Invalido"); 
            return;
        }
        // Solução através da recursividade 
        
        
    }
    
}
