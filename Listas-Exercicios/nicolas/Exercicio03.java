/* 
    Você deve escrever um programa que exiba uma saída como aparece no exemplo abaixo.
        I=0 J=1
        I=0 J=2
        I=0 J=3
        I=0.2 J=1.2
        I=0.2 J=2.2
        I=0.2 J=3.2
        .....
        I=2 J=?
        I=2 J=?
        I=2 J=?

*/
package lista03.nicolas;

public class Exercicio03 {
    public static void main(String [] args) {
        for(double i=0; i<=2; i=i+0.2) {         
            System.out.println(i);
            System.out.println(i);
            System.out.println(i);
        }
        System.out.println("");
        for(double j=1; j<=6; j=j+0.2) {
            System.out.println(j);
            System.out.println(j+1);
            System.out.println(j+2);
            
            
        }
    }
}
