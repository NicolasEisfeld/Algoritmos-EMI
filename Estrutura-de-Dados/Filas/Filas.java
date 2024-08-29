
package Filas;

import java.util.Scanner;
import java.util.LinkedList;

public class Filas {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        LinkedList < Double > fila = new LinkedList();
        
        System.out.println( fila.size());
        System.out.println( fila.isEmpty());
        
        fila.offer( 22.2);
        fila.offer( 13.6);
        fila.offer( 38.4);
        
        fila.offer(dado.nextDouble());
        
        System.out.println( fila.size());
        
        
        System.out.println( fila.peek());
        System.out.println( fila.size());
        
        System.out.println( fila.poll());
        System.out.println( fila.poll());
        System.out.println( fila.size());
    }
    
}
