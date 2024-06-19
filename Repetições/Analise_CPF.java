import java.util.Scanner;

public class Analise_CPF {
    public static void main(String [] args) {
        Scanner dado = new Scanner(System.in);
        String CPF = dado.nextLine();
        
        int DV1 = Integer.parseInt(CPF.substring(9,10));
        int DV2 = Integer.parseInt(CPF.substring(10) );
        
        int Soma = 0; 
        
        for(int i=0; i < CPF.length()-2; i++) {
            
            String digit = CPF.substring(i, i+1);
            int digitos =  Integer.parseInt(digit);
            Soma = (digitos * (10-i)) + Soma;
                        
        }
        int Resto = Soma % 11;
        int DV1calc = ( Resto > 1 ? 11 - Resto : 0);
        
        if (DV1 != DV1calc) {System.out.println("CPF Invalido");}
        else {
            int Soma1 = 0; 
     
            for(int i=0; i < CPF.length()-2; i++) {
                String digit = CPF.substring(i, i+1);
                int digitos =  Integer.parseInt(digit);
                
                Soma1 = (digitos * (11-i)) + Soma1;
            
            
            }
            Soma1 = Soma1 + DV1calc * 2;
            int Resto1 = Soma1 % 11;
            int DV2calc = ( Resto1 > 1 ? 11 - Resto1 : 0);

            if (DV2 != DV2calc) {
                System.out.println("CPF Invalido");
            } else {
                System.out.println("CPF Valido");
            }
        }
        
        // System.out.println(CPF.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4"));
        System.out.println(CPF.substring(0, 3) 
                + "." + CPF.substring(3, 6) 
                + "." + CPF.substring(6, 9) 
                + "-" + CPF.substring(9, 11));
        System.out.println(CPF);
        
        
       
        /* if(Resto == 1 || Resto == 0) {
                DV1calc = 0;
                Soma = Soma + DV1;
                Resto = Soma % 11;
            } else {
                DV2calc = 11 - Resto;
                Soma = Soma + DV2;
                Resto = Soma % 11;
                if(Resto == 1 || Resto == 0) {
                        DV2 = 0;
                    } else {
                        DV2 = 11 - Resto; 
                    }
            } 
            
         */
    }
}
