package reto5.vista;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import reto5.modelo.VO.*;

import java.awt.*;
import java.util.ArrayList;

public class interfaz1 extends JFrame {
    JTable tabla;
    DefaultTableModel modelo;
    JPanel panelg;
    JScrollPane scpanel01;

    public interfaz1(){
        setTitle("Consulta 1");
        setSize(500, 500);
        // setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        panelg = new JPanel();
        panelg.setBackground(new Color(99, 82, 197));

        String[] columnas = {"ID", "Nombre", "Apellido", "Ciudad"};
        ArrayList<String[]> datos_vo = Consulta1VO.valores();
        String[][] datos = new String[datos_vo.size()][4];
        for (int i = 0; i < datos_vo.size(); i++) {
            int j = 0;
            for (String s : datos_vo.get(i)) {
                datos[i][j] = s;
                j++;
            }
            
        }

        modelo = new DefaultTableModel(datos, columnas);
        tabla = new JTable(modelo);

        scpanel01 = new JScrollPane(tabla);
        scpanel01.setBounds(20, 20, 460, 420);
        add(scpanel01);



        add(panelg);
        setVisible(true);


    }
    
}
