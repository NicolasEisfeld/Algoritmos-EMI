
package Vetores;

import java.util.Scanner;

public class Busca_Binaria {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        int tamanho = dado.nextInt();
        int chave = dado.nextInt();
        int V[] = new int[tamanho];
        int fim = (tamanho - 1), inicio = 0, pivo = 0;
        int i = 0, log = 0;
        for(i=0;i< tamanho; i++) {
            V[i] = dado.nextInt();
        }
        do {
            pivo = (inicio + fim) / 2;
            
            if(chave > V[pivo]) {
                inicio = pivo+1;
            }
            
            else if(chave < V[pivo]) {
                fim = pivo-1;
            }
            log++;
            
            if(chave == V[pivo]){
                System.out.println("Encontrado");
                System.out.println("Na posicao: " + pivo);
                break;

            }                
            
                    
            if(inicio > fim) {
                System.out.println("Naum encontrado");
                break;
            }
            
        } while(chave != V[pivo]);
    }
}
