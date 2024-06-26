import java.util.Scanner;
public class Valores_Intervalo {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        int valor;
        int dentro = 0, fora = 0;
        for(int i=1; i<=10; i++) {
            valor = dado.nextInt();
            if (valor >= 10 && valor <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println(dentro);
        System.out.println(fora);
            
    }
}
