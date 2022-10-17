package reto5.vista;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import reto5.modelo.VO.*;

import java.awt.*;
import java.util.ArrayList;

public class interfaz3 extends JFrame{
    JTable tabla;
    DefaultTableModel modelo;
    JPanel panelg;
    JScrollPane scpanel01;

    public interfaz3(){
        setTitle("Consulta 3");
        setSize(500, 430);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        panelg = new JPanel();
        panelg.setBackground(new Color(8, 238, 165));

        String[] columnas = {"ID", "Constructora", "Banco_Vinculado"};
        ArrayList<String[]> datos_vo = Consulta3VO.valores();
        String[][] datos = new String[datos_vo.size()][3];
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
        scpanel01.setBounds(20, 20, 460, 340);
        add(scpanel01);


        add(panelg);
        setVisible(true);


    }
    
}
