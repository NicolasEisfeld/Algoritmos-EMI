package lista03.nicolas;

/*
    Usando um laço “while”, escreva o programa descrito a seguir. Um usuário quer controlar a carga colocada em um caminhão. 
    Ele digita inicialmente a carga máxima do caminhão. Em seguida, digita uma sequência de valores correspondente ao peso de itens a serem carregados. 
    O programa deve somar o peso dos itens, enquanto o peso digitado não for igual a 0 (zero) e não ultrapassar a capacidade do caminhão. 
    Quando uma das condições ocorrer, deve parar e informar a carga total carregada, sem incluir o último, que ultrapassaria a carga máxima.

    Ex.: O usuário digita 5000.0 como carga máxima do caminhão.
    Em seguida, digita os seguintes valores:
    1000.0
    2000.0
    3000.0
    O valor do 3º item, se for somado, vai resultar em 6000.0, então o programa para e informa a carga:
    Carga Total = 3000.0

*/

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        double carga_maxima = dado.nextInt();
        double carga_total = 0;
        while(carga_total <= carga_maxima) {
            double carga = dado.nextInt();
            carga_total = carga + carga_total;
            if(carga_total > carga_maxima) {
                carga_total = carga_total - carga;
                System.out.println(carga);
            }
            if(carga_total == carga_maxima) {
                System.out.println("Carga maxima");
            }
        }
    }
}
