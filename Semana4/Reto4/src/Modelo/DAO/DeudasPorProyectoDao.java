package Modelo.DAO;
import java.sql.*;
import Utilidades.*;

public class DeudasPorProyectoDao {
    public static ResultSet consulta(double limiteInferior) {
        ResultSet rs= null;
        try {
            var conn=JDBCUtilities.getConnection();
            Statement stmt= null;
            String csql= "SELECT ID_Proyecto, SUM(Cantidad*Precio_Unidad) as VALOR FROM Compra JOIN MaterialConstruccion USING(ID_MaterialConstruccion)WHERE Pagado='No' GROUP BY ID_Proyecto HAVING VALOR>"+limiteInferior+" ORDER BY VALOR DESC";
            
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
