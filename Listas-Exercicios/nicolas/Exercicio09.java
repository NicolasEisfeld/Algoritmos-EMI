package lista03.nicolas;

/*
    Escreva um programa que leia a idade de 10 pessoas e mostre "menor de idade" para quem tiver menos de 18 anos
    e "maior de idade" para os demais. Ele deve também calcular e mostrar a média da idade das 10 pessoas. Faça 3
    versões do programa, utilizando as estruturas de repetição estudadas: "while", "do...while" e "for".

*/
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        int soma_idades = 0;
        int i=1;
        // Repetição "for"
        for(i=1; i<=10; i++) {
            int idade = dado.nextInt();
            soma_idades += idade;
            if(idade < 18) {
                System.out.println("Menor de Idade");
            } else{System.out.println("Maior de Idade");}
        }
        int media_idades = soma_idades / 10;
        System.out.println(media_idades);
        
        // Repetição "while"
        soma_idades = 0;
        i=1;
        while(i <= 10) {
            i++;
            int idade = dado.nextInt();
            soma_idades += idade;
            if(idade < 18) {
                System.out.println("Menor de Idade");
            } else{System.out.println("Maior de Idade");}
        }
        media_idades = soma_idades / 10;
        System.out.println(media_idades);
        
        // Repetição "do...while"
        soma_idades = 0;
        i=1;
        do {
            i++;
            int idade = dado.nextInt();
            soma_idades += idade;
            if(idade < 18) {
                System.out.println("Menor de Idade");
            } else{System.out.println("Maior de Idade");}
        } while(i <= 10);
        media_idades = soma_idades / 10;
        System.out.println(media_idades);
    }
}
