package Vetores;

import java.util.Scanner;
public class alunos {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        
        String nomes[] = new String[10];
        double notas[][] = new double[10][2];
        double media_aluno[] = new double[10];
        double media_prova[] = new double[2];
        double min_prova = notas[0][0];
        double max_prova = notas[0][0];
        double min_media = media_aluno[0];
        double max_media = media_aluno[0];
        
        for(int i=0; i<10; i++) {
            nomes[i] = dado.nextLine();
            System.out.println("Notas de " + nomes[i]);
            for(int j=0; j < 2; j++) {
                notas[i][j] = dado.nextDouble();
                if(media_prova[0] == media_prova[1]) {}
                else {
                    if(notas[i][1] > notas[i][2]) {
                        max_prova = notas[i][1];
                        min_prova = notas[i][2];
                } else {
                    max_prova = notas[i][2];
                    min_prova = notas[i][2];
            }
        }
                media_aluno[i] += notas[i][j];                
                media_prova[j] += notas[i][j];
                
            }
            media_aluno[i] /= 2.0;
            if(media_aluno[i] < min_media) {
                min_media = media_aluno[i];
            }
            else if(media_aluno[i] > max_media) {
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

        
        double media_geral = (media_prova[0] + media_prova[1]) / 2.0;
        System.out.println(media_geral);
        System.out.println(min_media);
        System.out.println(max_media);
        System.out.println(min_prova);
        System.out.println(max_prova);
        
    }
}
              
