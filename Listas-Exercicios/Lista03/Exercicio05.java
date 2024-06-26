package lista03.nicolas;

/*
    Escreva um programa que leia um número inteiro qualquer e identifique se ele é primo. Números primos são todos
    aqueles que são divisíveis apenas por 1 e por si mesmos.
*/
public class Exercicio05 {
    public static void main(String [] args) {
        boolean Primo = true;
        for(int i=1; i<=100; i++) {
            
            for(int j=2; j<i; j++) {
                if(i % j == 0) {
                    Primo = false;
                } 
                
            }
            
            if(Primo) {
                System.out.println(i);
            }
            
        }    
    }
}
