import java.util.Scanner;

public class Congresso {
    public static void main (String [] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite as horas totais do Congresso: ");
        int horas_total = leitor.nextInt();
        System.out.println("Digite as horas que o participante compareceu: ");
        int horas_pessoa = leitor.nextInt();
        
        double frequencia = (horas_pessoa / (double) horas_total) * 100;
        if (frequencia < 75) {
            System.out.println("Erro. Emicao do Certificado naum Feita");
        } else {
            System.out.println("Emicao do Certificado Feita");
        }
    }
}
