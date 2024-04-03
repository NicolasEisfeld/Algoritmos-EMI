import java.util.Scanner;

public class Notas {
  public static void main (String [] args) {
    
    Scanner dado1 = new Scanner(System.in);
    System.out.print("Nota 1: ");
    double nota1 = dado1.nextDouble();

    System.out.println("Nota 2: ");
    Scanner dado2 = new Scanner(System.in);
    double nota2 = dado2.nextDouble();

    System.out.print("Nota 3: ");
    Scanner dado3 = new Scanner(System.in);
    double nota3 = dado3.nextDouble();

    Scanner dado4 = new Scanner(System.in);
    System.out.print("Peso da 1 Nota: ");
    double peso1 = dado4.nextDouble();

    System.out.print("Peso da 2 Nota: ");
    Scanner dado5 = new Scanner(System.in);
    double peso2 = dado5.nextDouble();

    System.out.print("Peso da Nota 3: ");
    Scanner dado6 = new Scanner(System.in);
    double peso3 = dado6.nextDouble();

    double soma_nota = nota1 + nota2 + nota3;
    double media_arit = soma_nota / 3;

    double notaXpeso = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
    double soma_peso = peso1 + peso2 + peso3;
    double media_pond = notaXpeso / soma_peso;

    
    System.out.println("Sua média aritmédica final é: "+ media_arit);
    System.out.println("Sua média ponderada final é: "+ media_pond);
  }    
}
