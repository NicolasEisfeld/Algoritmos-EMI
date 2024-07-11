/*
 Crie um vetor com 100.000 elementos. 
Usando o "Math.random()" (e mais alguns recursos) 
preencha o vetor com valores na faixa de 0 a 1.000.000
 */
package Vetores;

public class Num_Aleatorio1 {
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
    }
}
