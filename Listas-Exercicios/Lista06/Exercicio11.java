
package Lista_Subrotinas;

/*
    Escreva um método que receba como parâmetro um número inteiro, no intervalo de 1 a 99, e
    retorne uma String correspondente ao número por extenso. Caso o número esteja fora do
    intervalo, o método deve retornar o texto “inválido”.
*/

import java.util.Scanner;

public class Exercicio11 {
    public static String Intervalo(int num) {
        String Extenso = "";
        String num_String = Integer.toString(num);
        String Dezena = "", Unidade = "";
        
        if(num < 19) {
            Dezena = num_String.substring(0);
            Unidade = num_String.substring(1);
            num = Integer.parseInt(Unidade);
            
            switch(Dezena) {
                case "3": Extenso = "Trinta";
                    break;
                case "4": Extenso = "Quarenta";
                    break;
                case "5": Extenso = "Cinquenta";
                    break;
                case "6": Extenso = "Sessenta";
                    break;
                case "7": Extenso = "Setenta";
                    break;
                case "8": Extenso = "Oitenta";
                    break;
                case "9": Extenso = "Noventa";
                
            }
            if(num > 0) {
                Extenso.concat(" e ");
            }
        }
            switch(num) {
                    case 0: Extenso = Extenso; // Para não imprimir "Invalido"
                        break;
                    case 1: Extenso.concat("Um");
                        break;
                    case 2: Extenso.concat("Dois");
                        break;
                    case 3: Extenso.concat("Tres");
                        break;
                    case 4: Extenso.concat("Quatro");
                        break;
                    case 5: Extenso.concat("Cinco");
                        break;
                    case 6: Extenso.concat("Seis");
                        break;
                    case 7: Extenso.concat("Sete");
                        break;
                    case 8: Extenso.concat("Oito");
                        break;
                    case 9: Extenso.concat("Nove");
                        break;
                    case 10: Extenso.concat("Dez");
                        break;
                    case 11: Extenso.concat("Onze");
                        break;
                    case 12: Extenso.concat("Doze");
                        break;
                    case 13: Extenso.concat("Treze");
                        break;
                    case 14: Extenso.concat("Quatorze");
                        break;
                    case 15: Extenso.concat("Quinze");
                        break;
                    case 16: Extenso.concat("Dezesseis");
                        break;
                    case 17: Extenso.concat("Dezessete");
                        break;
                    case 18: Extenso.concat("Dezoito");
                        break;
                    case 19: Extenso.concat("Dezenove");
                        break;
                    default: Extenso = "Invalido";
                        break; 
            
        }
        return Extenso;
    }
}
