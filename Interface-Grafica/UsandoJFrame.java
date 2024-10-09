
package Interface_Gráfica;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UsandoJFrame {

    public static void main(String[] args) {
        JFrame minhaJanela = new JFrame("Nova Janela");
        
        minhaJanela.setSize(300, 300);
        minhaJanela.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        minhaJanela.getContentPane().setBackground(Color.LIGHT_GRAY);
        minhaJanela.setResizable(false);
        minhaJanela.setVisible(true);
        
        JPanel painel = new JPanel();
        
    }
    
}
