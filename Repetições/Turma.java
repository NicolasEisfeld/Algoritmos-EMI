import java.util.Scanner;

public class Turma {
    public static void main(String [] args) {
       Scanner dado = new Scanner(System.in);
       int turma = dado.nextInt();
       double media_turma = 0;
       
       for(int aluno = 0; aluno <= turma; aluno++) {
           double media_aluno = 0;
           for(int nota = 1; nota <= 3; nota++) {
               System.out.print("Aluno "+ (aluno + 1) +" nota "+ nota + ": ");
               double avaliacao = dado.nextDouble();
               media_aluno = media_aluno + avaliacao;
               
           }
           media_aluno = media_aluno / 3;
           media_turma = media_aluno + media_turma;
           System.out.println("Media do aluno: " + media_aluno);
       }
       media_turma = media_turma / turma;
       System.out.println("Media da turma: " + media_turma);
       
    }
}
