import java.util.Scanner;
public class Evento_Lab {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tempo (em segundos) do evento: ");
        int tempo_segundos = leitor.nextInt();
        int tempo_minutos = tempo_segundos / 60;
        int tempo_horas = tempo_minutos / 60;
        int tempo_dias = tempo_horas / 24;
        int formato = tempo_dias -  tempo_horas / tempo_minutos / tempo_segundos;
        System.out.println("No formato 'dias - horas : minutos : segundos',\nO valor serah "+ formato);
    }
}
