import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

public class GUI_Swing {
    public static void main(String[] args) {
        JFrame ventana1 = new JFrame("Mi primera GUI");

        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setSize(500, 500);

        //Menu
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Archivo");
        JMenu m2 = new JMenu("Ayuda");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Abrir");
        JMenuItem m12 = new JMenuItem("Guardar como");
        m1.add(m11);
        m1.add(m12);
        ventana1.getContentPane().add(BorderLayout.NORTH,mb);

        JPanel panel = new JPanel();
        JButton button1 = new JButton("Enviar");
        panel.add(button1);
        JButton button2 = new JButton("Restablecer");
        panel.add(button2);
        JLabel texto = new JLabel("Introducir texto: ");
        panel.add(texto);
        JTextField txt_ing = new JTextField(10);
        panel.add(txt_ing);
        ventana1.getContentPane().add(BorderLayout.SOUTH,panel);


        JButton btn_01= new JButton("Boton 1");
        ventana1.getContentPane().add(btn_01);

        ventana1.setVisible(true);
    }
}
