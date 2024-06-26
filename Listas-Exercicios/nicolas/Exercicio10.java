package lista03.nicolas;

/*
    Implemente um algoritmo que leia um número indefinido de pares de informação, contendo faixa etária 
    ("A" para adulto e "C" para criança) e time de torcida ("G" para Grêmio e "I" para Internacional). 
    O usuário vai informar a faixa etária e depois o time, separadamente. Quando o usuário digitar "X" para faixa etária, 
    o programa deve encerrar e informar o percentual de adultos e crianças, o percentual de gremistas e colorados, 
    bem como o percentual de adultos gremistas e adultos colorados (do total de adultos) 
    e o percentual de crianças gremistas e crianças coloradas (do total de crianças).
    
*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        int total = 0, Adulto_Gremista = 0, Crianca_Colorado = 0, Crianca_Gremista = 0, Adulto_Colorado = 0;
        
        char faixa_etaria = dado.next().charAt(0);
        char time = dado.next().charAt(0);
        
        while(time != 'X' || faixa_etaria != 'X') {
            faixa_etaria = dado.next().charAt(total);
            if(faixa_etaria == 'X') {break;}
            time = dado.next().charAt(0);
            if(faixa_etaria == 'A' && time == 'G') {
                Adulto_Gremista++;
            } 
            
            if(faixa_etaria == 'A' && time == 'I') {
                Adulto_Colorado++;
            }
            
            if(faixa_etaria == 'C' && time == 'G') {
                Crianca_Gremista++;
            } 
            
            if(faixa_etaria == 'C' && time == 'I') {
                Crianca_Colorado++;
            }            
            
                
            
        }
        
        total = Adulto_Gremista + Adulto_Colorado + Crianca_Gremista + Crianca_Colorado;
        
        double percentual_adultos = (Adulto_Gremista + Adulto_Colorado * 100) - total;
        System.out.println(percentual_adultos+"%");
        
        double percentual_criancas = (Crianca_Gremista + Crianca_Colorado * 100) - total;
        System.out.println(percentual_criancas +"%");        
        
        double percentual_colorados = (Crianca_Colorado + Adulto_Colorado * 100) - total;
        System.out.println(percentual_colorados +"%");  
        
        double percentual_gremistas = (Adulto_Gremista + Crianca_Gremista * 100) - total;
        System.out.println(percentual_gremistas +"%");  
        
        double percentual_adultos_gremistas = (Adulto_Gremista * 100) - total;
        System.out.println(percentual_adultos_gremistas +"%");
        
        double percentual_adultos_colorados = (Adulto_Colorado * 100) - total;
        System.out.println(percentual_adultos_colorados +"%");  
        
        double percentual_criancas_gremistas = (Crianca_Gremista * 100) - total;
        System.out.println(percentual_criancas_gremistas +"%");
        
        double percentual_criancas_colorados = (Crianca_Colorado * 100) - total;
        System.out.println(percentual_criancas_colorados +"%");          
    }
    
}
