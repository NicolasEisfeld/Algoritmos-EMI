package lista03.nicolas;

/*
    Astolfo tem hoje 1,50 m (150 cm) e cresce 3 cm por ano. Basileu tem 1,30 m (130 cm) e cresce 5 cm por ano.
    Usando um laço "while", escreva um programa que calcule e exiba quantos anos são necessários para Basileu ser
    mais alto que Astolfo, bem como as alturas dos dois após esse tempo.
*/
public class Exercicio08 {
    public static void main(String [] args) {
        int Astolfo = 150;
        int Basileu = 130;
        int ano = 0;
        while (Astolfo >= Basileu) {
           ano++;
           Basileu = Basileu + 5;
           Astolfo = Astolfo + 3;
        }System.out.println("Anos: "+ ano);
        System.out.println("Astolfo: "+ Astolfo);
        System.out.println("Basileu: "+ Basileu);
   } 
}
