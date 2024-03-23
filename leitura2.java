// importa a classe "Scanner" (Scanner é a função para a leitura do teclado)
import java.util.Scanner;
// cria a classe "leitura1"
public class leitura2 {
   // acessa os códigos do programa para o arquivo .class
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        // declara o tipo de variável de "valor" e insere o valor de entrada obtido pela variável "dado" na variável "valor"
        int valor = dado.nextInt();
        // incrementa na variável "valor"
        valor = valor++;
        // exibe na tela o valor da variável "valor"
        System.out.print(valor);
        // Incrementa novamente na variável "valor"
        valor = valor++;
        // exibe na tela o valor da variável "valor"
        System.out.println(valor);
    }
}
// O programa introduz fazendo a leitura de um dado inteiro e armazenando na variável chamada "valor"
// Após, declara uma variável inteira que foi inserido o valor obtido pela leitura e incrementa ela; imprime o valor atual da variável "valor"
// Por fim, incrementa mais uma vez na variável "valor" e exibe o valor final da variável "valor".
