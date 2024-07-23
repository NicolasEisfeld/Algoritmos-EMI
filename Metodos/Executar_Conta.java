
package Metodos;

public class Executar_Conta {
  
    public static void main(String[] args) {
        Conta MyConta = new Conta();
        
        System.out.println("Saldo: " + MyConta.getSaldo());
        System.out.println(MyConta.saque(50.0));
        System.out.println(MyConta.deposito(-50.0));
        System.out.println(MyConta.deposito(100.00));
        System.out.println("Saldo: " + MyConta.saque(34.0));
        System.out.println(MyConta.saque(34.0));
        System.out.println("Saldo: " + MyConta.getSaldo());
    }
    
}
