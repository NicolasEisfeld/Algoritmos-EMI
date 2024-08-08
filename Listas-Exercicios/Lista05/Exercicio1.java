package Lista_Vetores;
/*
    Escreva um programa em Java que leia 100 números reais e armazene num vetor. Em seguida,
    exiba o quadrado e o cubo de cada um dos números.
*/
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double valores[] = new double[100];
        
        for(int i = 0; i < valores.length; i++ ) {
            valores[i] = dado.nextDouble();
            
        }
        for(int i = 0; i < valores.length; i++) {
            System.out.println(valores[i] +": "+ Math.pow(valores[i], 2)+ " e " + Math.pow(valores[i], 3));
        }
    }
    
}
