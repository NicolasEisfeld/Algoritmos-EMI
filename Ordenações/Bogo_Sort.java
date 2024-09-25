
package Ordenações;

import java.util.Scanner;

public class Bogo_Sort {
public static void sort(int[] Lista) {
        while (!isSorted(Lista)) {
            shuffle(Lista);
        }
    }

    public static void shuffle(int[] Lista) {
        for (int i = 0; i < Lista.length; i++) {
            int randomIndex = (int) (Math.random() * Lista.length);
            swap(Lista, i, randomIndex);
        }
    }

    public static void swap(int[] Lista, int i, int j) {
        int temp = Lista[i];
        Lista[i] = Lista[j];
        Lista[j] = temp;
    }

    public static boolean isSorted(int[] Lista) {
        for (int i = 0; i < Lista.length - 1; i++) {
            if (Lista[i] > Lista[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] Lista) {
        for (int i = 0; i < Lista.length; i++) {
            System.out.print(Lista[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        int tamanho = dado.nextInt();
        int min = dado.nextInt();
        int max = dado.nextInt();
        
        int Lista[] = GeradorAleatorio.geraInt(tamanho, min, max);
        
        System.out.println("Array Original:");
        printArray(Lista);

        sort(Lista);

        System.out.println("Array Organizado:");
        
        printArray(Lista);
    }
}