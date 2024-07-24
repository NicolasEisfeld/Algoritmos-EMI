
package Metodos;

import java.util.Scanner;

public class Testa_Static {
    static Scanner dado = new Scanner(System.in);
    private static int valor1, valor2, soma, diferenca, produto, quociente;
    public static void Entrada() {
        // Entrada
        System.out.print("Digite o primeiro valor: ");
        valor1 = dado.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = dado.nextInt();
    }
    
    public static void Processamento() {
        // Operações
        soma = valor1 + valor2;
        diferenca = valor1 - valor2;
        produto = valor1 * valor2;
        quociente = valor1 / valor2;
        
    }
    
    public static void Saida() {
        // Saída
        System.out.println("Soma: " + soma);
        System.out.println("Diferenca: " + diferenca);
        System.out.println("Produto: " + produto);
        System.out.println("Quociente: " + quociente);
        
    }
    public static void main(String [] agrs) {
        Entrada();
        Processamento();
        Saida();
        

    }
}
