package lista03.nicolas;
 
/*
     Você deve escrever um programa que exiba uma saída como aparece no exemplo abaixo.
        I=1 J=60
        I=4 J=55
        I=7 J=50
        ...
        I=? J=0
*/

public class Exercicio01 {
    public static void main(String[] args){
        
        for(int i=1, j=60; j>=0; i+=3, j-=5) {
            System.out.println("I="+ i + "J="+ j);
        }
    }
}
