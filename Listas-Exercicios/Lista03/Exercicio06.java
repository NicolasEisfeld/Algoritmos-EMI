package lista03.nicolas;

/*
    Um lago foi infestado por um tipo de alga em que cada "indivíduo" tem cerca de 20 cm.
    A superfície do lago tem aproximadamente 500 m2 (equivalente a 5.000.000 cm2). 
    Essa alga duplica a cada 5 dias. Se não for feito nada para removê-la, em quantos dias ela irá cobrir todo o lago?

*/

public class Exercicio06 {
    public static void main(String [] args) {
        int i = 20;
        int cont = 0, dias = 0;
        while(i < 5000000) {
            cont++;
            dias++;
            if(cont == 5) {
                i += i;
                cont = 0;
            }
            
        }
        System.out.println(dias);
        System.out.println(i);
    }
}
