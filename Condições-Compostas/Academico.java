import java.util.Scanner;

public class Academico {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = dado.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = dado.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = dado.nextDouble();
        
        double soma = nota1 + nota2 + nota3;
        double media = soma / 3; //média aritmética das notas do aluno
        
        System.out.print("Digite as aulas totais: ");
        int num_totais = dado.nextInt();
        
        System.out.print("Digite as faltas do aluno: ");
        int num_faltas = dado.nextInt();
        
        int num_presencas = num_totais - num_faltas;
        double frequencia = num_presencas / (double) num_totais; 
        
        if (frequencia >= 0.75) {
            if (media >= 7.0) {
            System.out.println("Aprovado");
            } else if (media < 1.8) {
                System.out.println("Reprovado");
                } else {
                    System.out.println("Em exame");
        } 
        } else {
            System.out.println("Reprovado por falta");
        }
        
    }
}
