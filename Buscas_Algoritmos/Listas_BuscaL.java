
import java.util.ArrayList;
import java.util.Collections;


/*
    Implemente uma busca linear em uma estrutura de lista (ArrayList) 
    e teste de maneira similar à realizada no exemplo
*/

public class Listas_BuscaL {
    static ArrayList <Integer> Valores = new ArrayList();
    static final int tamanho = 10000;
    
    public static void main(String[] args) {
              
        
        
        for(int i = 0; i < tamanho; i++) {
            Valores.add( (int) Math.rint(Math.random() * 1_000_000));
        }
        
        Collections.sort(Valores);
        
        for(int i = 0; i < tamanho; i++) {
            int equal;
            int num = (int) Math.rint(Math.random() * 1_000_000);
            
            long inicio_ms = System.currentTimeMillis();
            
            for(equal = 0; equal < tamanho && num != Valores.get(equal); equal++) {
                
            }
            long fim_ms = System.currentTimeMillis();
            if(equal == 1) {System.out.println("Parabens"); break;}
            System.out.println("Comparacoes: " + equal +" no tempo "+(fim_ms - inicio_ms) +"ms");
            
        }
    }
    
}
