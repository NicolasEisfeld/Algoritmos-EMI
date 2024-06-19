import java.util.Scanner;

public class relogio {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        int H = dado.nextInt();
        int M = dado.nextInt();
        int S = dado.nextInt();
        int T = dado.nextInt();
        S = S + T;
        if (S >= 60) {
            M = S / 60;
            S = S % 60;
        }
        if (M >= 60) {
            H = M / 60;
            M = M % 60;
        }
        if (H >= 24) {
            int D = H / 24;
            H = H % 24;
        }
        System.out.println(H);
        System.out.println(M);
        System.out.println(S);
    }
}
