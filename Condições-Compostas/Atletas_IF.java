import java.util.Scanner;
public class Atletas_IF {
    public static void main(String [] args) {
        Scanner leitura = new Scanner(System.in);
        
        System.out.print("Digite seu ano de nascimento: ");
        int ano = leitura.nextInt();
        
        if (ano == 2007 || ano == 2008 || ano == 2009) {
            System.out.println("Categoria Juvenil");
        } else if (ano == 2010 || ano == 2011 || ano == 2012) {
             System.out.println("Categoria Sub-15");
        }   else if (ano == 2013 || ano == 2014){
                System.out.println("Categoria Sub-12");
        } else {
            System.out.println("Inscricao Invalida");
        }
       
    }
   
}
