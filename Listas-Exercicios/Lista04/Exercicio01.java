package lista04.nicolas;

/*
    Escreva um algoritmo que calcule e exiba o resultado das seguintes expressões algébricas
*/

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println(Math.pow(9, 3));
        System.out.println(Math.pow(7, 5));
        System.out.println(Math.pow(3, 9) + Math.pow(2, 10));
        System.out.println(Math.pow(5, 4) - Math.pow(6, 2));
        System.out.println(Math.pow(Math.pow(5, 2), 3));
        System.out.println(Math.cbrt(Math.pow(2, 7) - Math.pow(3, 4))); 
        System.out.println(Math.pow((Math.pow(9, 7) * Math.pow(4, 3)), 1.0 / 5)); 
        System.out.println(Math.pow((Math.pow(2, 5) / Math.pow(5, 2)), 1.0 / 4)); 
    }
    
}
