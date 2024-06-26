package lista03.nicolas;

/*
     Você deve escrever um programa que exiba uma saída como aparece no exemplo abaixo.
        I=1 J=7
        I=1 J=6
        I=1 J=5
        I=3 J=7
        I=3 J=6
        I=3 J=5
        ...
        I=9 J=7
        I=9 J=6
        I=9 J=5

*/

public class Exercicio02 {
    public static void main(String [] args) {
          for(int i = 1; i<=9; i+=2) {
               for(int j = 7; j >=5; j--) {
               System.out.println("I=" + i + "J=" + j)
               }
          }
    }
}
