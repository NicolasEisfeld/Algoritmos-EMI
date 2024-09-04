
import java.util.Arrays;

/*
    Busca Binária
    Gera números aleatórios; armazena em um vetor; serão realizada 100 buscas, medindo o tempo de cada uma e a quantidade
    de comparações feitas.
*/
public class Busca_BinariaV2 {
    static final int tamanho = 10_000_00;
    static int Valores[] = new int[tamanho];
    
    
    public static void main(String[] args) {
        for(int i = 0; i < tamanho; i++) {
            Valores[i] = (int) Math.rint(Math.random() * 1_000_000);
            
        }
        Arrays.sort(Valores);
        for(int i = 0; i < 1000; i++) {
            int equal = 0;
            int num = (int) Math.rint(Math.random() * 1_000_000);
            
            long inicio_ms = System.currentTimeMillis();
            
            int primeiro = 0, ultimo = Valores.length-1;
            int pivo;
            do {
                pivo = (primeiro + ultimo) / 2;
                if (num < Valores[pivo]) {
                    ultimo = pivo-1;
                } else {
                    if(num > Valores[pivo]) {
                        primeiro = pivo + 1;
                        
                    }
                }
                equal++;
            } while( num != Valores[pivo] &&  primeiro <= ultimo);
            
            long fim_ms = System.currentTimeMillis();
            if(equal == 1) {System.out.println("Parabens"); break;}
            System.out.println("Comparacoes: " + equal +" no tempo "+(fim_ms - inicio_ms) +"ms");
            
        }
    }
    
}
