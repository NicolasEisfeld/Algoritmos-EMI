package Métodos;

import java.util.Scanner;

public class Bhaskara {
    public static double delta, a, b, c;
    public static double raizes[];
    
    public static void Entrada() {

        
        
    }

    public static double[] Calculo(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        
        if (delta < 0 || a == 0) {
            System.out.println("Não existem resultados reais");
            return null;
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
        return raizes; // Esse return tá ruim
        
    }
    
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        System.out.print("Valor de A: ");
        a = dado.nextDouble();
        System.out.print("Valor de B: ");
        b = dado.nextDouble();
        System.out.print("Valor de C: ");
        c = dado.nextDouble();
        Calculo(a, b, c); // Até aqui não deu pau o código
        if(raizes.length == (2)) {
            for(int i = 0; i < 2; i++) {
                System.out.println("Raiz "+ i +": " + raizes[i]);
            }
        } else{
            for(int i = 0; i < 1; i++) {
                System.out.println("Raiz "+ i +": " + raizes[i]);
            }
        }
       
    }

}
