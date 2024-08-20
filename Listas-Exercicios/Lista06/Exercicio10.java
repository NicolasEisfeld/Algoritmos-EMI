
package Lista_Subrotinas;

/*
    Escreva um método que receba como parâmetro um número inteiro, no intervalo de 1 a 20, e
    retorne uma String correspondente ao número por extenso. Caso o número seja menor que 1 ou
    maior que 20, o método deve retornar o texto “inválido”.
*/

import java.util.Scanner;

public class Exercicio10 {
    public static String Intervalo(int num) {
        String Extenso = "";
        switch(num) {
                case 1: Extenso = "Um";
                    break;
                case 2: Extenso = "Dois";
                    break;
                case 3: Extenso = "Tres";
                    break;
                case 4: Extenso = "Quatro";
                    break;
                case 5: Extenso = "Cinco";
                    break;
                case 6: Extenso = "Seis";
                    break;
                case 7: Extenso = "Sete";
                    break;
                case 8: Extenso = "Oito";
                    break;
                case 9: Extenso = "Nove";
                    break;
                case 10: Extenso = "Dez";
                    break;
                case 11: Extenso = "Onze";
                    break;
                case 12: Extenso = "Doze";
                    break;
                case 13: Extenso = "Treze";
                    break;
                case 14: Extenso = "Quatorze";
                    break;
                case 15: Extenso = "Quinze";
                    break;
                case 16: Extenso = "Dezesseis";
                    break;
                case 17: Extenso = "Dezessete";
                    break;
                case 18: Extenso = "Dezoito";
                    break;
                case 19: Extenso = "Dezenove";
                    break;
                case 20: Extenso = "Vinte";
                    break;
                default: Extenso = "Invalido";
                    break; 
        }
        return Extenso;
    }
}
