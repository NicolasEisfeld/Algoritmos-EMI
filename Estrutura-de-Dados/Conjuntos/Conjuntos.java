
package Conjuntos;

import java.util.Set; // Interface
import java.util.HashSet; // Classe
import java.util.LinkedHashSet; // Classe
import java.util.TreeSet; // Classe

public class Conjuntos {

    public static void main(String[] args) {
        Set< String > Conjunto_1 = new HashSet();
        Conjunto_1.add("André Maciag");
        Conjunto_1.add("Matheus de Vargas");
        Conjunto_1.add("Nicolas Ferreira");
        Conjunto_1.add("Nathan Vicentini");
        Conjunto_1.add("Phelipe Schmidt");
        for(String elemento: Conjunto_1) {
            System.out.println(elemento);
        }
        System.out.println("");
        
        
        Set< String > TG = new HashSet(), TR = new LinkedHashSet(), GE = new HashSet(), JF = new TreeSet();
        
        TG.add("Fabiana"); TG.add("Debora Lima"); TG.add("Fernanda");
        
        TR.add("Raquel Martins"); TR.add("Raquel Cristina"); TR.add("Marta");
        
        GE.add("Fernanda"); GE.add("Fabiana");
        
        JF.add("Debora Lima"); JF.add("Adriana"); JF.add("Raquel Martins"); JF.add("Debora Magaldi");
        
        
        // Dados que serão utilizados nas operações de conjuntos
        Set< String > GEuJF = new HashSet(),  JFiTR = new HashSet(), 
                      TG_GE = new HashSet(), TGdsJF = new HashSet();
        
        // União de Dois Conjuntos
        System.out.println("\nUnião dos Conjuntos GE e JF");
        GEuJF.addAll(GE);
        GEuJF.addAll(JF);
        for(String elemento: GEuJF) {
            System.out.println(elemento);
        }
        
        // Intersecção de Dois Conjuntos
        System.out.println("\nIntersecção dos Conjuntos JF e TR");
        JFiTR.addAll(JF);
        JFiTR.retainAll(TR);
        for(String elemento: JFiTR) {
            System.out.println(elemento);
        }
        
        
        // "Está contido" de Dois Conjuntos
        System.out.println("\nEstá Contido dos Conjuntos GE e TG");
        boolean GEcTG = TG.containsAll(GE);
        System.out.println(GEcTG);
        
        // Diferença de Dois Conjuntos
        System.out.println("\nDiferença dos Conjuntos TG e GE");
        TG_GE.addAll(TG);
        
        // Conjunto temporário para guardar a intersecção
        Set< String > temp_1 = new HashSet();
        temp_1.addAll(TG);
        temp_1.retainAll(GE); // Deixa apenas os elementos que já existem no novo
        TG_GE.removeAll(temp_1);
        for(String elemento: TG_GE) {
            System.out.println(elemento);
        }    
        
        // Diferença Simétrica de Dois Conjuntos
        System.out.println("\n Diferença Simétrica dos Conjuntos TG e JF");
        TGdsJF.addAll(TG);
        TGdsJF.addAll(JF);    
        Set< String > temp_2 = new HashSet();
        temp_2.addAll(TG);
        temp_2.retainAll(JF);
        TGdsJF.removeAll(temp_2);
        for(String elemento: TGdsJF) {
            System.out.println(elemento);
        }
        
    }   
    
}
