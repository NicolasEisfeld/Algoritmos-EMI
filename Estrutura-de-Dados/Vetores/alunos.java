package Vetores;

import java.util.Scanner;
public class Alunos {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        
        String nomes[] = new String[10];
        double notas[][] = new double[10][2];
        double media_aluno[] = new double[10];
        double media_prova[] = new double[2];
        
        for(int i=0; i<10; i++) {
            nomes[i] = dado.nextLine();
            System.out.println("Notas de " + nomes[i]);
            for(int j=0; j < 2; j++) {
                notas[i][j] = dado.nextDouble();
                media_aluno[i] += notas[i][j];
                media_prova[j] += notas[i][j];
                
            }
            media_aluno[i] /= 2.0;
            
            System.out.println(media_aluno[i]);
            
            nomes[i] = dado.nextLine();
            
      
        }
        System.out.println("");
        
        media_prova[0] /= 10.0;
        System.out.println(media_prova[0]);
        media_prova[1] /= 10.0;
        System.out.println(media_prova[1]);
        
        double media_geral = (media_prova[0] + media_prova[1]) / 2.0;
        System.out.println(media_geral);
        // fazer minima, maxima das medias
        // fazer '' por prova
        
    }
}
              
