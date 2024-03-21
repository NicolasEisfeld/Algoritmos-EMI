// importa a classe "Scanner" (Scanner é a função para a leitura do teclado)
import java.util.Scanner;
// cria a classe "leitura1"
public class leitura1 {
    // expõe a variável que vai ser declarada
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        // declara o tipo de variável de "valor" e insere o valor de entrada obtido pela variável "dado" na variável "valor"
        int valor = dado.nextInt();
        // exibe na tela o valor da variável "valor"
        System.out.println(valor);
    }
}
// O programa introduz fazendo a leitura de um dado inteiro usando o teclado do usuário e armazenando na variável chamada "valor"
// Após, declara uma variável inteira que foi inserido o valor obtido pela leitura 
// Por fim, é impresso na tela o valor que foi lido e inserido na variável "valor"