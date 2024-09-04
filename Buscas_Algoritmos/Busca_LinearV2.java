
import java.util.Arrays;

/*
    Busca Linear
    Gera números aleatórios; armazena em um vetor; serão realizada 100 buscas, medindo o tempo de cada uma e a quantidade
    de comparações feitas.
*/
public class Busca_LinearV2 {
    static final int tamanho = 10_000_00;
    static int Valores[] = new int[tamanho];
    
    
    public static void main(String[] args) {
        for(int i = 0; i < tamanho; i++) {
            Valores[i] = (int) Math.rint(Math.random() * 1_000_000);
            
        }
        Arrays.sort(Valores);
        for(int i = 0; i < 1000; i++) {
            int equal;
            int num = (int) Math.rint(Math.random() * 1_000_000);
            
            long inicio_ms = System.currentTimeMillis();
            
            for(equal = 0; equal < tamanho && num != Valores[equal]; equal++) {
                
            }
            long fim_ms = System.currentTimeMillis();
            if(equal == 1) {System.out.println("Parabens"); break;}
            System.out.println("Comparacoes: " + equal +" no tempo "+(fim_ms - inicio_ms) +"ms");
            
        }
    }
    
}
