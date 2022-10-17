package reto5.modelo.VO;
import reto5.modelo.DAO.*;
import java.sql.*;
import java.util.ArrayList;

public class Consulta2VO {
    public static ArrayList<String[]> valores(){
        ArrayList<String[]> salida_vo = new ArrayList<String[]>();
        try {
            ResultSet rs = Consulta2DAO.consulta();

            while (rs.next()) {
                int ID = rs.getInt("ID_Proyecto");
                String constructora = rs.getString("Constructora");
                String hb = rs.getString("Numero_Habitaciones");
                String ciudad = rs.getString("Ciudad");
                // System.out.println(String.format("%5d %15s %15s %15s", ID, constructora, hb, ciudad));
                salida_vo.add(new String[]{ID+"", constructora, hb, ciudad});
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return salida_vo;
    }
    
}
