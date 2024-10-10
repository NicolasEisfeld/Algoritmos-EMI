package Interface_Gráfica;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UsandoBorderLayout {

    public static void main(String[] args) {
        // Carrega a imagem do ícone
        Image icon = new ImageIcon("200.png").getImage();
        
        // Cria a janela
        JFrame janela = new JFrame("BorderLayout");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 300);
        
        // Cria um painel com BorderLayout
        JPanel panel = new JPanel(new BorderLayout());
        
        // Adiciona o JLabel com a imagem ao painel
        JLabel label = new JLabel(new ImageIcon(icon));
        panel.add(label, BorderLayout.CENTER);
        
        // Cria os botões
        JButton botao1 = new JButton("Botão 1");
        JButton botao2 = new JButton("Botão 2");
        JButton botao3 = new JButton("Botão 3");
        JButton botao4 = new JButton("Botão 4");

        // Adiciona os botões ao painel
        panel.add(botao1, BorderLayout.NORTH);
        panel.add(botao2, BorderLayout.SOUTH);
        panel.add(botao3, BorderLayout.WEST);
        panel.add(botao4, BorderLayout.EAST);

        // Adiciona o painel à janela
        janela.add(panel);
        
        // Torna a janela visível
        janela.setVisible(true);
    }
}
