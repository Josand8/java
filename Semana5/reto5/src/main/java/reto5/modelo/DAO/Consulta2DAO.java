package reto5.modelo.DAO;
import java.sql.*;
import reto5.utilidades.*;

public class Consulta2DAO {
    public static ResultSet consulta(){
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        String csql= "SELECT ID_Proyecto,Constructora,Numero_Habitaciones,Ciudad FROM Proyecto WHERE Clasificacion=='Casa Campestre' AND Ciudad IN('Barranquilla','Santa Marta', 'Cartagena');";
        try {
            conn = JDBCUtilities.conexion();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        return rs;

    }
    
}
