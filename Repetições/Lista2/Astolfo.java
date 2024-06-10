
public class Astolfo {
   public static void main(String [] args) {
       int Astolfo = 150;
       int Basileu = 130;
       int ano = 0;
       while (Astolfo > Basileu) {
           ano++;
           System.out.println(ano + " Ano ");
           Basileu = Basileu + 5;
           System.out.println("Tamanho de Basileu: " + Basileu);
           Astolfo = Astolfo + 3;
           System.out.println("Tamanho de Astolfo: " + Astolfo);
           System.out.println("");
       }
   } 
}
