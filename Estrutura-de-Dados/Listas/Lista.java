
package Listas;

import java.util.Scanner;
import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        ArrayList <String> minhaLista = new ArrayList(); // Declaração
        // Funções com a Lista
        int numElementos = minhaLista.size();
        System.out.println("Numero de elementos: " + numElementos);
        boolean Vazia = minhaLista.isEmpty();
        System.out.println("Esta vazia? " + Vazia);
        
        // Adiciona no final da Lista
        minhaLista.add("Pizza"); 
        minhaLista.add("Cachorro Quente");
        minhaLista.add("Hamburger");
        
        // Exibir elemento pelo indice;
        int num = dado.nextInt();
        String Escolhido = minhaLista.get(num);
        System.out.println("Escolhido: " + Escolhido);
       
        
        // Adicionar elemento num indice específico
        int indice = dado.nextInt();
        String adicao = dado.nextLine();
        minhaLista.add(indice, adicao);
        
        // Encontrar um certo elemento
        String Palavra = dado.nextLine();
        boolean Encontrar = minhaLista.contains(Palavra);
        System.out.println("Encontrou "+ Palavra +"? " + Encontrar);
        
        // Exibir o indice de certo elemento
        Palavra = dado.nextLine();
        indice = minhaLista.indexOf(Palavra);
        System.out.println("Indice de "+Palavra+ ": " + indice);
        
        // Remover um elemento
        Palavra = dado.nextLine();
        minhaLista.remove(Palavra);
        
        // Remover o elemento pelo indice
        indice = dado.nextInt();
        minhaLista.remove(indice);
        
        // Limpa a Lista
        /*
        lista.clear();
        System.out.println(minhaLista)
        */
        // Exibir se tem duplicata
        for(int i = 0; i < minhaLista.size(); i++) {
            if(minhaLista.get(i) == minhaLista.get(i+1) && i < minhaLista.size()-1) {
                System.out.println("Contem duplicata");
            }
        }
       
        
        
    }
    
}
