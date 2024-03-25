// importa a função scanner do java
import java.util.Scanner;
// publica o programa em classe (.class)
public class leitura3 {
    // acessa os códigos do programa para o arquivo .class
    public static void main (String[] args) {
        // escaneia o valor do usuário e insere na variável "dado1"
        Scanner dado1 = new Scanner(System.in);
        // declara a variável "num1" como o valor da váriavel "dado1" de leitura
        int num1 = dado1.nextInt();
        
        // escaneia o valor do usuário e insere na variável "dado2"
        Scanner dado2 = new Scanner(System.in);
         // declara a variável "num2" como o valor da váriavel "dado1" de leitura
        int num2 = dado2.nextInt();
        
        // declara a variável "soma" como sendo a soma entre a "num1" e "num2"
        int soma = num1 + num2;
        // declara a variável "soma" como sendo a diferença entre a "num2" e "num1"
        int diferenca = num2 - num1;
        // declara a variável "soma" como sendo o produto entre a "num1" e "num2"
        int multi = num1 * num2;
        // declara a variável "soma" como sendo a divisão entre a "num1" e "num2"
        int divi = num1 / num2;
         // declara a variável "soma" como sendo o resto da divisão entre a "num1" e "num2"
        double resto = num1 % num2;
        
        //imprime a variável "soma"
        System.out.println(soma);
        //imprime a variável "diferenca"
        System.out.println(diferenca);
        //imprime a variável "multi"
        System.out.println(multi);
        //imprime a variável "divi"
        System.out.println(divi);
        //imprime a variável "resto"
        System.out.println(resto);
        
    }
}
// O programa inicia pedindo ao usuário dois valores inteiros e inserindo neles em duas variáveis(num1 e num2)
// Após isso, é feito uma variável para cada operação aritmédica feita entre as dois valores de entrada das variáveis "num1" e "num2"
// Por fim, é impresso na tela, o resultado de cada uma das operações aritmédicas (soma, diferença, produto, divisão e o resto da divisão