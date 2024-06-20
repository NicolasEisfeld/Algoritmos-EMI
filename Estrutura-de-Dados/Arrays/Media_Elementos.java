import java.util.Scanner;

public class Media_Elementos {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        
        int cont = 0;
        double media = 0;
        double num[] = new double[10];
        
        for(int i=0; i < num.length; i++) {
            num[i] = dado.nextInt();
        }
        
        for(int i=0; i < num.length; i++) {
            System.out.println( num[i]);
            media = num[i] / num.length;
            if(num[i] >= media) {
                cont++;
            }
        }
        
        System.out.println(cont);
        System.out.println(media);
    }
}
