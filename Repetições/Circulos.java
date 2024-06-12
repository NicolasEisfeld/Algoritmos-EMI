import java.util.Scanner;

public class Circulos {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        System.out.print("Informe a medida do raio: ");
        
        double raio = dado.nextDouble();
        double diametro = raio * 2;
        double perimetro = diametro * Math.PI;
        double area = Math.pow(raio, 2) * Math.PI;
        double volume = 4 / 3 * Math.PI * Math.pow(raio, 3);
        double superficie = (Math.PI * 4) * Math.pow(raio, 2);
        
        System.out.println(diametro);
        System.out.println(perimetro);
        System.out.println(area);
        System.out.println(volume);
        System.out.println(superficie);
    }
}
