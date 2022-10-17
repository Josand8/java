package Modelo.DAO;
import java.sql.*;
import Utilidades.*;

public class ComprasDeLiderDao {
    public static ResultSet consulta() {
        ResultSet rs= null;
        try {
            var conn=JDBCUtilities.getConnection();
            Statement stmt= null;
            String csql= "SELECT l.Nombre ||' '||l.Primer_Apellido ||' '||l.Segundo_Apellido as LIDER, SUM(c.Cantidad*mc.Precio_Unidad) as VALOR FROM Proyecto p JOIN Lider l ON(p.ID_Lider=l.ID_Lider) JOIN Compra c ON(c.ID_Proyecto=p.ID_Proyecto) JOIN MaterialConstruccion mc ON(mc.ID_MaterialConstruccion=c.ID_MaterialConstruccion) GROUP BY LIDER ORDER BY VALOR DESC LIMIT 10";
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);


            rs.close();
            stmt.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        return rs;
        
    }
    
}
