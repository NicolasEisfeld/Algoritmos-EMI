package lista03.nicolas;

/*
    Antonella está pesquisando o crescimento de árvores num bosque que se recuperando de um incêndio. Atualmente,
    as árvores possuem uma altura de 1,5 m. Ela quer verificar o crescimento ano a ano, até uma dada altura máxima,
    sabendo que a árvore cresce a uma taxa percentual mais ou menos fixa. É preciso escrever um programa que leia a
    taxa de crescimento (em percentual, ex.: 15%) e o tamanho máximo desejado (em metros) e deve exibir o tamanho
    a cada ano.
    Ex.: A árvore sempre terá 1,5 m de altura inicial. Se a dada árvore cresce a uma taxa de 20% ao ano e ela quer uma altura máxima
    de 20,5 metros:
    Ano 1: 1.7999999999999998
    Ano 2: 2.1599999999999997
    ...
    Ano 14: 19.25877696823295
    Ano 15: 23.11053236187954
*/

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        
        int ano = 0;
        double arvore = 1.5;
        double taxa = dado.nextDouble();
        taxa = taxa / 100;
        double altura_maxima = dado.nextDouble();
        taxa = taxa / altura_maxima;
        while(arvore < altura_maxima) {
            ano++;
            
            if(arvore > altura_maxima) {
                break;
            }
            arvore = arvore + (taxa * arvore);
            System.out.println("Ano "+ ano +": " + arvore);
        }
        
        
    }
}
