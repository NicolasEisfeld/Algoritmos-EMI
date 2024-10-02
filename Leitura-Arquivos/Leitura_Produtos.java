package leitura_arquivos;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Leitura_Produtos {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        FileWriter escritor = null;

        try {
            escritor = new FileWriter("produtos.txt");

            int totalItens = 0;
            double totalValor = 0.0;

            while (true) {
                System.out.print("Descrição: ");
                String descricao = dado.nextLine();

                if (descricao.equalsIgnoreCase("fim")) {
                    break;
                }

                System.out.print("Quantidade: ");
                int quantidade = dado.nextInt();
                dado.nextLine(); 

                System.out.print("Valor unitário: ");
                double valorUnitario = dado.nextDouble();
                dado.nextLine();

                double valorProduto = quantidade * valorUnitario;

                escritor.write(descricao + " - " + quantidade + " - " + valorUnitario + " - " + valorProduto + "\n");

                totalItens += quantidade;
                totalValor += valorProduto;
            }

            escritor.write("Total de itens: " + totalItens + "\n");
            escritor.write("Total de valor: " + totalValor + "\n");
            escritor.close();

        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        } 

    }
}