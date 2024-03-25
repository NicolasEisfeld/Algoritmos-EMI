// importa a função scanner do java
import java.util.Scanner;
// publica o programa em classe (.class)
public class leitura5 {
    // acessa os códigos do programa para o arquivo .class
    public static void main (String[] args) {
        // cria uma classe scanner "dado1" para inserir valores reais
        Scanner dado1 = new Scanner(System.in);
        // declara uma váriavel "quan1", que é o a primeira leitura da variável "dado1"
        int quan1 = dado1.nextInt();
        // declara uma váriavel "quan2", que é o a segunda leitura da variável "dado1"
        int quan2 = dado1.nextInt();
        
        // cria uma classe scanner "dado2" para inserir valores reais
        Scanner dado2 = new Scanner(System.in);
        // declara uma váriavel "valor1", que é o a primeira leitura da variável "dado2"
        double valor1 = dado2.nextDouble();
        // declara uma váriavel "valor2", que é o a segunda leitura da variável "dado2"
        double valor2 = dado2.nextDouble();
        
        // declara uma variável "quanvalor1", que é o produto entre "quan1" e "valor1"
        double quanvalor1 = quan1 * valor1;
        // declara uma variável "quanvalor2", que é o produto entre "quan2" e "valor2"
        double quanvalor2 = quan2 * valor2;
        // declara uma variável "valortotal", que é a soma entre "quanvalor1" e "quanvalor2"
        double valortotal = quanvalor1 + quanvalor2;
        
        // imprime o valor da variável "quanvalor1"
        System.out.println(quanvalor1);
        // imprime o valor da variável "quanvalor2"
        System.out.println(quanvalor2);
        // imprime o valor da variável "valortotal"
        System.out.println(valortotal);

        
    }
}
// O programa inicia pedindo ao usuário dois valores inteiros para as variáveis "quan1" e "quan2", que serão as quantidades de cada produto
// Após, é pedido ao usuário mais dois valores reais para as variáveis "valor1" e "valor2", que são os valores de cada produto
// Em seguida, são declarados variáveis para o valor do estoque de cada produto (quanvalor1 e quanvalor2) e uma variável para o valor total dos estoques (valortotal)
// Por fim, é exibido na tela o valor da variável "quanvalor1", "quanvalor2" e "valortotal" (sendo o valor do primeiro estoque, segundo estoque e estoque total, respectivamente)
