
public class Inversos {
    public static void main(String [] args) {
        double inverso;
        double soma = 0;
        for(double i=2; i<=10; i++) {
            inverso = 1 / i;
            System.out.println(inverso);
            soma += inverso;
        }
        System.out.println(soma);
            
    }
}
