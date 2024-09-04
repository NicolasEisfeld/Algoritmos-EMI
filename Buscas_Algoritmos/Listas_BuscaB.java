
import java.util.ArrayList;
import java.util.Collections;

/*
    Implemente uma busca binária em uma estrutura de lista (ArrayList) 
    e teste de maneira similar à realizada no exemplo
*/

public class Listas_BuscaB {
    
    static ArrayList <Integer> Valores = new ArrayList();
    static final int tamanho = 10000;
    public static void main(String[] args) {
        
        for(int i = 0; i < tamanho; i++) {
            Valores.add( (int) Math.rint(Math.random() * 1_000_000));
        }
        Collections.sort(Valores);
        for(int i = 0; i < tamanho; i++) {
            int equal = 0;
            int num = (int) Math.rint(Math.random() * 1_000_000);
            
            long inicio_ms = System.currentTimeMillis();
            
            int primeiro = 0, ultimo = Valores.size()-1;
            int pivo;
            do {
                pivo = (primeiro + ultimo) / 2;
                if (num < Valores.get(pivo)) {
                    ultimo = pivo-1;
                } else {
                    if(num > Valores.get(pivo)) {
                        primeiro = pivo + 1;
                        
                    }
                }
                equal++;
            } while( num != Valores.get(pivo) &&  primeiro <= ultimo);
            
            long fim_ms = System.currentTimeMillis();
            
            System.out.println("Comparacoes: " + equal +" no tempo "+(fim_ms - inicio_ms) +"ms");
            
        }
        
        
    }
    
}
