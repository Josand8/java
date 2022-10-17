import javax.swing.*;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.table.AbstractTableModel;

import java.awt.*;
import java.awt.event.*;

public class Interfaz extends JFrame implements ActionListener,MouseInputListener{

    JButton btn01;
    JButton btn02;
    JButton btn03;
    JLabel lbl01;
    JTextField txt01;
    JTextArea mtxt01;
    JPanel panel2;
    JCheckBox chk01;
    JRadioButton rdb01;
    JRadioButton rdb02;
    JRadioButton rdb03;
    JComboBox<String> ld01;
    JTree arbol;
    JScrollPane scpanel01;
    DefaultTableModel modelo;
    JTable tabla;
    public Interfaz(){

        setTitle("Interfaz");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        lbl01=new JLabel("Boton Presionado");
        txt01=new JTextField(10);
        txt01.setEnabled(false);
        btn01=new JButton("Cambiar");
        btn01.addActionListener(this);
        btn01.setCursor(new Cursor(HAND_CURSOR));
        btn02=new JButton("Cerrar");
        btn02.addActionListener(this);
        
        btn02.setCursor(new Cursor(MOVE_CURSOR));
        btn03=new JButton("dialog");
        btn03.addActionListener(this);
        btn03.setCursor(new Cursor(WAIT_CURSOR));
        JPanel panel1=new JPanel();
        panel1.add(lbl01);
        panel1.add(txt01);
        panel1.add(btn01);
        panel1.add(btn02);
        panel1.add(btn03);
        getContentPane().add(BorderLayout.SOUTH,panel1);

        panel2=new JPanel();

        JLabel lbl02=new JLabel("Observaciones");
        lbl02.setBounds(120, 20, 100, 10);
        lbl02.setBackground(new Color(Color.TRANSLUCENT));
        mtxt01=new JTextArea();
        mtxt01.setBounds(220, 20, 150, 150);
        mtxt01.setAutoscrolls(true);

        chk01=new JCheckBox("Selección 1");
        chk01.setBounds(5, 20, 100, 15);
        chk01.setBackground(Color.yellow);
        getContentPane().add(chk01);
        //panel2.add(lbl02);
        getContentPane().add(lbl02);
        //panel2.add(mtxt01);
        getContentPane().add(mtxt01);
        
        //setBackground();
        // radiobuttons
        rdb01=new JRadioButton("Opción 1");
        rdb01.setBounds(5, 60, 100, 15);
        rdb01.setBackground(new Color(Color.TRANSLUCENT));
        rdb02=new JRadioButton("Opción 2");
        rdb02.setBounds(5, 80, 100, 15);
        rdb02.setBackground(new Color(Color.TRANSLUCENT));
        rdb03=new JRadioButton("Opción 3");
        rdb03.setBounds(5, 100, 100, 15);
        rdb03.setBackground(new Color(Color.TRANSLUCENT));
        ButtonGroup gprdb01=new ButtonGroup();
        gprdb01.add(rdb01);
        gprdb01.add(rdb02);
        gprdb01.add(rdb03);
        getContentPane().add(rdb01);
        getContentPane().add(rdb02);
        getContentPane().add(rdb03);

        //combobox
        ld01=new JComboBox<>();
        ld01.setFont(new Font("helvetica",Font.PLAIN,20));
        ld01.addItem("Sel 1");;
        ld01.addItem("Sel 2");
        ld01.addItem("Sel 3");
        ld01.setBounds(5,120,100,40);
        getContentPane().add(ld01);

        //arbol y scrollpanel
        //arbol=new JTree(new Object[][]{{"Sel 1","2","3"},{"Sel 2","4"}, {"Sel 3"}});
        //scpanel01=new JScrollPane(arbol);
        //scpanel01.setBounds(5,200,150,150);
        //getContentPane().add(scpanel01);

        DefaultMutableTreeNode Estilos=new DefaultMutableTreeNode("Estilos");
        DefaultMutableTreeNode colores= new DefaultMutableTreeNode("Colores");
        DefaultMutableTreeNode Fuentes= new DefaultMutableTreeNode("Fuentes");
        DefaultMutableTreeNode Alineacion=new DefaultMutableTreeNode("Alineación");
        Estilos.add(colores);
        Estilos.add(Fuentes);
        Estilos.add(Alineacion);
        DefaultMutableTreeNode[] c={new DefaultMutableTreeNode("Rojo"),new DefaultMutableTreeNode("Azul"),
                                    new DefaultMutableTreeNode("Verde")};
        colores.add(c[0]);
        colores.add(c[1]);
        colores.add(c[2]);

        // a fuentes añadir arial, cambria, helvetica y times new roman
        // crear otro nodo que se llame alineación y tenga izquierda,
        // derecha, centrado y justificado, debe estar dentro de estilos      

        DefaultMutableTreeNode[] f={new DefaultMutableTreeNode("Arial"),new DefaultMutableTreeNode("Cambria"),
                                    new DefaultMutableTreeNode("Helvetica"),new DefaultMutableTreeNode("Times New Roman")};
        Fuentes.add(f[0]);
        Fuentes.add(f[1]);
        Fuentes.add(f[2]);
        Fuentes.add(f[3]);

        DefaultMutableTreeNode[] a= {new DefaultMutableTreeNode("Izquierda"),new DefaultMutableTreeNode("Derecha"),
                                     new DefaultMutableTreeNode("Centrado"),new DefaultMutableTreeNode("Justificado")};
        Alineacion.add(a[0]);
        Alineacion.add(a[1]);
        Alineacion.add(a[2]);
        Alineacion.add(a[3]);

        arbol=new JTree(Estilos);
        scpanel01=new JScrollPane(arbol);
        scpanel01.setBounds(5,200,150,150);
        arbol.addMouseListener(this);
        getContentPane().add(scpanel01);


        // Tablas
        modelo=new DefaultTableModel();
        Object[] etiquetas={"Nombres","Apellidos","edad"};
        modelo.addRow(new Object[] {"Nombres","Apellidos","edad"});
        tabla=new JTable(modelo);
    
        tabla.setBounds(180,180,280,240);
        getContentPane().add(tabla);

        String datos[][] = {
            { "uno", "dos", "tres", "cuatro" },
            { "cinco", "seis", "siete", "ocho" },
            { "nueve", "diez", "once", "doce" } };
        
        String[] columna = {"Columna 1", "Columna 2", "Columna 3", "Columna 4"};
        modelo = new DefaultTableModel(datos, columna);
        tabla = new JTable(datos, columna);
        JScrollPane scpanel02 = new JScrollPane(tabla);
        tabla.setBounds(250, 200, 200, 100);
        getContentPane().add(tabla);
        
            
            // addTableModelListener(evt -> {
            //     for (int i = 0; i < datos.length; i++) {
            //         for (int j = 0; j < datos[0].length; j++)
            //             System.out.print(datos[i][j] + " ");
            //         System.out.println();
            //     }
            // });
            

        panel2.setBackground(Color.yellow);
        getContentPane().add(panel2);
        //getContentPane().add(BorderLayout.CENTER, new JLabel("",setBackground(Color.green)));
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args){
        new Interfaz();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method 
        if(e.getSource()==btn01){
            btn01.setBackground(Color.blue);
            txt01.setText("Boton 1");
        }
        if (e.getSource()==btn02){
            //int a=JOptionPane.showConfirmDialog(btn02, "mensaje 1", "Titulo 1", JOptionPane.YES_NO_CANCEL_OPTION);
            //System.out.println(a);
            Object[] pos={"Sel 1", "Sel 2", "Sel 3"};
            String s=(String) JOptionPane.showInputDialog(btn02, "selecciones una opción", "Titulo 1", JOptionPane.PLAIN_MESSAGE, null, pos, "Sel 1");
            System.out.println(s);
        }
        if(e.getSource()==btn03){
            System.out.println(txt01.getText());
            String b=txt01.getText();
            if (b.trim()=="Boton 1"){
                System.out.println("verde");
                btn01.setBackground(Color.green);
            }
            txt01.setText("Boton 3");
            
            
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Hola");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

}
