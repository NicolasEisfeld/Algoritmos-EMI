/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lista_Vetores;

/*
    Escreva um programa em Java que leia a média de 10 alunos e armazene em um vetor. Nessa
    instituição de ensino, todos que tiverem média inferior a 7,0 deverão fazer o exame. Cada aluno
    que fará o exame, para ser aprovado, precisa ter uma nota que seja superior a diferença dessa
    nota para 12,0. O algoritmo deve gerar dois vetores de saída, um com o índice de cada aluno
    que deverá fazer exame e outro com a nota mínima que deve tirar no exame. Tenha atenção
    para o fato de que o índice usado pela escola não é igual ao índice que são utilizados nos arrays
    em programação Java.
*/

import lista05.nicolas.*;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        double Media_Aluno [] = new double[10];
        
        for(int i=0; i < Media_Aluno.length; i++) {
            Media_Aluno[i] = dado.nextDouble();
            
        }
        for(int i=0; i < Media_Aluno.length; i++) {
            if(Media_Aluno[i] < 7.0) {
                System.out.println("Aluno: "+ (i+1));
                System.out.println("Nota Minima: " + ( 12 - Media_Aluno[i] ) );
            }
        }
     }
    
}
