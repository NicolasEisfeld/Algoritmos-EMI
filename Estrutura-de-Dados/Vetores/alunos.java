package Vetores;

import java.util.Scanner;
public class Alunos {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        
        String nomes[] = new String[10];
        double notas[][] = new double[10][2];
        double media_aluno[] = new double[10];
        double media_prova[] = new double[2];
        double min_prova = 0;
        double max_prova = 0;
        double min_media = Integer.MAX_VALUE;
        double max_media = Integer.MIN_VALUE;
        
        for(int i=0; i<10; i++) {
            nomes[i] = dado.nextLine();
            System.out.println("Notas de " + nomes[i]);
            for(int j=0; j < 2; j++) {
                notas[i][j] = dado.nextDouble();
                media_aluno[i] += notas[i][j];                
                media_prova[j] += notas[i][j];
                
            }
            media_aluno[i] /= 2.0;
            if(media_aluno[i] < min_media) {
                min_media = media_aluno[i];
            }
            if(notas[i][j] > max_media) {
                max_media = media_aluno[i];
            }            
            
            System.out.println(media_aluno[i]);
            
            nomes[i] = dado.nextLine();
            
      
        }
        System.out.println("");
        
        media_prova[0] /= 10.0;
        System.out.println(media_prova[0]);
        media_prova[1] /= 10.0;
        System.out.println(media_prova[1]);
        if(media_prova[0] == media_prova[1]) {}
        else {
            if(media_prova[0] > media_prova[1]) {
                max_prova = media_prova[0];
                min_prova = media_prova[1];
            } else {
                max_prova = media_prova[1];
                min_prova = media_prova[0];
            }
        }
        
        double media_geral = (media_prova[0] + media_prova[1]) / 2.0;
        System.out.println(media_geral);
        System.out.println(min_media);
        System.out.println(max_media);
        System.out.println(min_prova);
        System.out.println(max_prova);
        
    }
}
              
