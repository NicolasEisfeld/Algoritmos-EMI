package Métodos;

import java.util.Scanner;

public class Bhaskara {
    public static double delta, a, b, c;
    public static double raizes[];
    
    public static void Entrada() {
        Scanner dado = new Scanner(System.in);
        System.out.print("Valor de A: ");
        a = dado.nextDouble();
        System.out.print("Valor de B: ");
        b = dado.nextDouble();
        System.out.print("Valor de C: ");
        c = dado.nextDouble();
        delta = (Math.pow(b, 2) - (4 * a * c));
        
        
    }
    public static void Calculo() {
        if(delta < 0 || a == 0) {
            System.out.println("Não existem resultados reais");
            
            double raizes[] = null;
            
        }
        else if( a != 0) {
            
        
            if(delta == 0 ) {
                double raizes[] = new double[1];
                raizes[0] = - b / (2 * a);
                

            }
            if(delta > 0) {
                double raizes[] = new double[2];
                raizes[0] = (- b + Math.sqrt(delta))/ (2 * a);
                raizes[1] = (- b - Math.sqrt(delta))/ (2 * a);
                
            }
        }
        
    }
    
    public static void main(String [] args) {
        Entrada();
        Calculo();
        for(int i = 0; i < raizes.length; i++) {
            System.out.println("Raiz "+ i +": " + raizes[i]);
        }
       
    }

}
