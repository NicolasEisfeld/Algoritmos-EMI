import java.util.Scanner;

public class Percentual_Valores {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        double valor = 1.0;
        int cont_positivo = 0;
        int cont_negativo = 0;
        while (valor != 0) {
            valor = dado.nextDouble();
            if (valor > 0) {
                cont_positivo++;
            }
            if (valor < 0) {
                cont_negativo++;
            }
        }
        int cont_total = cont_positivo + cont_negativo;
        System.out.println(cont_positivo + " positivos - "+ (cont_positivo * 100) / cont_total+"%");
        System.out.println(cont_negativo + " negativos - "+ (cont_negativo * 100) / cont_total+"%");
    }
}
