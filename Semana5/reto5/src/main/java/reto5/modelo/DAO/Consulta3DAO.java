package reto5.modelo.DAO;
import java.sql.*;
import reto5.utilidades.*;

public class Consulta3DAO {
    public static ResultSet consulta(){
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        String csql= "SELECT ID_Compra, Constructora, Banco_Vinculado FROM Compra JOIN Proyecto USING(ID_Proyecto) WHERE Proveedor=='Homecenter' AND Ciudad=='Salento';";
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
