package reto5.vista;
import javax.swing.*;
import java.awt.event.*;

public class interfazp extends JFrame implements ActionListener{
    JButton btn01;
    JButton btn02;
    JButton btn03;
    JPanel panel01;
    
    public interfazp() {
        setTitle("Ventana Principal");
        setResizable(false);
        setSize(420, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn01 = new JButton("Consulta 1");
        btn01.setBounds(20, 20, 100, 30);
        btn01.addActionListener(this);
        add(btn01);

        btn02 = new JButton("Consulta 2");
        btn02.setBounds(150, 20, 100, 30);
        btn02.addActionListener(this);
        add(btn02);

        btn03 = new JButton("Consulta 3");
        btn03.setBounds(280, 20, 100, 30);
        btn03.addActionListener(this);
        add(btn03);

        panel01 = new JPanel();
        add(panel01);
        
        
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource()==btn01){
            new interfaz1();
        }
        if (e.getSource()==btn02){
            new interfaz2();
        }
        if (e.getSource()==btn03){
            new interfaz3();
        }
        
    }
}
