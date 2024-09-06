
package Lista_PilhaseFilas;

/*
    Escreva um programa que crie uma fila para armazenar pedidos de um restaurante. Os pedidos
    podem ser “pizza salao”, “pizza delivery”, “sushi salao” e “sushi delivery”. Receba todos os
    pedidos (serão um total de 20.). Em seguida, tire os pedidos da fila, e envie para outras duas
    filas de preparo: pizza e sushi. Depois de alocar todos os pedidos nas filas de preparação, retire
    delas e insira em novas duas filas de entrega: salao e delivery
*/

import java.util.Scanner;
import java.util.LinkedList;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        LinkedList<String> Pedidos = new LinkedList();
        for(int i = 0; i < 20; i++) {
            Pedidos.offer(dado.nextLine());
        }
        
        LinkedList<String> Pizza = new LinkedList(), 
                            Sushi = new LinkedList(),
                            Delivery = new LinkedList(),
                            Salao = new LinkedList();
                            
        while(!Pedidos.isEmpty()) {
            String Preparo = Pedidos.poll();
            if (Preparo.contains("pizza")) {
                Pizza.add(Preparo);
            } else if (Preparo.contains("sushi")) {
                Sushi.add(Preparo);
            }
        }
        
        while (!Pizza.isEmpty()) {
            String Pizza_Preparo = Pizza.poll();
            if (Pizza.contains("salao")) {
                Salao.add(Pizza_Preparo);
            } else if (Pizza.contains("delivery")){
                Delivery.add(Pizza_Preparo);
            }
        }
        
        while (!Sushi.isEmpty()) {
            String Sushi_Preparo = Sushi.poll();
            if (Sushi_Preparo.contains("salao")) {
                Salao.add(Sushi_Preparo);
            } else if(Sushi_Preparo.contains("delivery")){
                Delivery.add(Sushi_Preparo);
            }
        }
        
        while (!Salao.isEmpty()) {
            System.out.println(Salao.poll());
        }
        
        while (!Delivery.isEmpty()) {
            System.out.println(Delivery.poll());
        }
    }
    
}
