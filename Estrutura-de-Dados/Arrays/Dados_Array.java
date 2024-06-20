import java.util.Scanner;

public class Dados_Array {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        
        int array[] = new int[10];
       
        for(int i=0; i<array.length; i++) {
            array[i] = dado.nextInt();
        }
        
        for(int i=0; i<array.length; i++) {
            System.out.println( array[i] );
        }
        
    }
}
