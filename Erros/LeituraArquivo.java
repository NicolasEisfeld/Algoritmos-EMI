
package Erros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeituraArquivo {

    public static void main(String[] args) {
        
        File arquivo = new File("cursos.txt");
        Scanner dado = null;
        try {
            dado = new Scanner(arquivo);
        } catch (IOException exc) {
            System.err.println("Não consegui abrir o arquivo");
        }
        
        if(dado != null) {
            while (dado)
        }
    }
    
}
