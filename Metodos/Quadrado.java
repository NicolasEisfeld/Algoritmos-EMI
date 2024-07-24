package Metodos;
import java.util.Scanner;
public class Quadrado {
    static Scanner dado = new Scanner(System.in);
    private double lado;
    public double getlado() {
        return this.lado;
    }
    public void setLado(double valor) {
        this.lado = valor;
    }
    public double calcArea() {
        return lado*lado;
    }    
}