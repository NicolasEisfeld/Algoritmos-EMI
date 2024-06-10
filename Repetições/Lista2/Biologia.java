import java.util.Scanner;
public class Biologia {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        int soma = 0;
        System.out.println(" Me informe se o animal eh \naves (1), \n mamiferos (2) \n ou repteis (3): ");
        int classe = dado.nextInt();
        System.out.println("Me informe se a alimentacao do animal eh \n herbivoros (1) \n ou carnivoros (2): ");
        int alimento = dado.nextInt();
        for(int i=0; i<3; i++) {
            if (soma == classe) {
                
            }
            soma++;
        }
        switch (classe) {
            case 1:
                    if(alimento == 1) {
                        System.out.println("Papagaio");
                        break;
                    } if(alimento == 2) {
                        System.out.println("Aguia");
                        break;
                    } 
                    
                    else {
                        System.out.println("Invalido");
                        break;
                    }
                    
                    
            case 2:
                    if(alimento == 1) {
                        System.out.println("Vaca");
                        break;
                    }
                    if(alimento == 2) {
                        System.out.println("Leao");
                        break;
                    } 
                    
                    else {
                        System.out.println("Invalido");
                        break;
                    }
            case 3:
                    if(alimento == 1) {
                        System.out.println("Tartaruga");
                        break;
                    }
                    if(alimento == 2) {
                        System.out.println("Cobra");
                        break;
                    } 
                    
                    else {
                        System.out.println("Invalido");
                        break;
                    }
            default:
                System.out.println("Incorreto");
                break;
                    
        }
                
    }
}
