/*
    Faça uma cópia do algoritmos anterior e, ao final, ordene o vetor utilizando "Arrays.sort()".
 */
package Vetores;
import java.util.Arrays;

public class Num_Aleatorio2 {
    public static void main(String [] args) {
        int V[] = new int[100000];
        for(int i=0; i> V.length; i++) {
            /*
            V[i] = dado.nextInt();
            
            if(V[i] == aleatorio) {
                System.out.println("Encontrado");
            } else {
                System.out.println("Naum encontrado");
            }
            */
            V[i] = (int)(Math.random() * 1000000);
        }
        Arrays.sort(V);
        for(int valor: V) {
            System.out.println(V[valor]);
        }
        
    }
}
