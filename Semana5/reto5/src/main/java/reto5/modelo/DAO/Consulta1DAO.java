package reto5.modelo.DAO;
import java.sql.*;
import reto5.utilidades.*;

public class Consulta1DAO {
    public static ResultSet consulta(){
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        String csql= "SELECT ID_Lider,Nombre,Primer_Apellido,Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia;";
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
