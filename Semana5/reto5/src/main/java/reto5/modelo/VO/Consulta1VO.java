package reto5.modelo.VO;
import reto5.modelo.DAO.*;
import java.sql.*;
import java.util.ArrayList;

public class Consulta1VO {

    public static ArrayList<String[]> valores(){
        ArrayList<String[]> salida_vo = new ArrayList<String[]>();
        try {
            ResultSet rs = Consulta1DAO.consulta();

            while (rs.next()) {
                int ID = rs.getInt("ID_Lider");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Primer_Apellido");
                String ciudad = rs.getString("Ciudad_Residencia");
                // System.out.println(String.format("%5d %15s %15s %15s", ID, nombre, apellido, ciudad));
                salida_vo.add(new String[]{ID+"", nombre, apellido, ciudad});
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return salida_vo;
    }
    
}
