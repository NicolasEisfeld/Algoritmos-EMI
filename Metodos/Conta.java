
package Metodos;
/*
    Sistema de conta bancária para apresentar os conteúdos sobre modulação, rotinas e métodos.
*/
public class Conta {
    // Atributo
    private double saldo;
    /*
    Metodo: saque
    Parametro/Argumentos: valor (dado de entrada)
    Retorno (tipo): boolean (dado de saída)
    */ 
    public boolean saque(double valor) {
        boolean resultado = (valor > 0) && (valor <= saldo);
        if(resultado) {
            saldo -= valor;
            
        } 
        return resultado;
        
        
    }
    /* 
    Metodo: deposito
    Parametro/Argumentos: valor
    Retorno (tipo): boolean
    */ 
    public boolean deposito(double valor) {
        boolean resultado = (valor > 0);
        if (resultado) {
            saldo += valor;
        }
        return resultado;
    }
    
    /*
    Método: getSaldo
    Parametro/Argumentos: Não possui
    Retorno (tipo): double
    */ 
    public double getSaldo() {
        return this.saldo;
    }
    
}
