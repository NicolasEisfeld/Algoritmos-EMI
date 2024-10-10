
package Interface_Gráfica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.BoxLayout;

public class UsandoBoxLayout {

    public static void main(String[] args) {
        
 
        JFrame janela = new JFrame("BoxLayout");
        
        janela.setLayout(
                
        )
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 300);
        
 
        JButton botao1 = new JButton("Botão 1");
        JButton botao2 = new JButton("Botão 2");
        JButton botao3 = new JButton("Botão 3");
        JButton botao4 = new JButton("Botão 4");

        // Adiciona os botões ao painel
        janela.add(botao1);
        janela.add(botao2);
        janela.add(botao3);
        janela.add(botao4);


        // Torna a janela visível
        janela.setVisible(true);
    }
    
}
