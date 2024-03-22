// cria a classe (.class) com o nome do arquivo ("NotaseMedias")
public class NotaseMedias {
    // expõe a variável que vai ser declarada
    public static void main(String[] args) {
        // declara o tipo de variável (double) das variáveis "nota1", "nota2" e "nota3", e atribui um valor de entrada para cada variável
        double nota1 = 6.0, nota2 = 8.5, nota3 = 9.0;
        // declara a variável soma (em double) e insere o valor da variável como o resultado da expressão de adição entre as 3 notas 
        double soma = nota1 + nota2 + nota3;
        // declara a variável media (em double) e insere o valor da variável como o resultado da expressão de divisão da variável "soma" por 3
        double media = soma / 3;
        // imprime o valor da variável "soma"
        System.out.println(soma);
        // imprime o valor da variável "media"
        System.out.println(media);
    }
}
// Esse programa armazena 3 notas de um aluno com as variáveis nota1, nota2 e nota3.
// Após, declara uma variável (soma) para a soma das notas e outra para a média aritmética entre elas (media)
// Por Último, imprime o valor da variável "soma" e da variável "media"