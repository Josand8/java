
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base_datos_jdbc {
    public static void main(String[] args){
        actualizar_regions();
    }

    public static Connection conexion(){
        Connection conn=null;
        String url="jdbc:sqlite:hr.db";
        try {
            conn=DriverManager.getConnection(url);
            if (conn!=null){
                System.out.println("Conexión exitosa");
            }
            else{
                System.out.println("Error");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

    public static void conexion_hr(){
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        String url="jdbc:sqlite:hr.db";
        try {
            conn=DriverManager.getConnection(url);
            stmt=conn.createStatement();
            rs=stmt.executeQuery("SELECT * FROM employees");
            //System.out.println("Conexión exitosa");
            while(rs.next()){
                int id=rs.getInt("employee_id");
                String nombre=rs.getString("first_name");
                System.out.println(id+" "+nombre);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void leer_datos(){
        var conn=conexion();
        if (conn!=null){
            System.out.println("Conexión exitosa");
        }
        else{
            System.out.println("Error");
        }

        Statement stmt=null;
        ResultSet rs=null;

        try{
            stmt=conn.createStatement();
            rs=stmt.executeQuery("SELECT * FROM countries;");

            while(rs.next()){
                String id=rs.getString("country_id");
                String nombre_pais=rs.getString("country_name");
                int region_id=rs.getInt("region_id");
                System.out.println(id+" "+nombre_pais+" "+region_id);
            }
            rs.close();
            stmt.close();
            conn.close();
        
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void salarios_altos(){
        var conn=conexion();
        Statement stmt=null;
        ResultSet rs=null;
        String csql="SELECT * FROM employees ORDER BY salary DESC LIMIT 10;";
        try {
            stmt=conn.createStatement();
            rs=stmt.executeQuery(csql);
            while(rs.next()){
                int id=rs.getInt("employee_id");
                String nombre=rs.getString("first_name");
                String apellido=rs.getString("last_name");
                int salario=rs.getInt("salary");
                System.out.println(id+" "+nombre+" "+apellido+" "+salario);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void actualizar_countries(){
        var conn=conexion();
        PreparedStatement pstmt=null;
        String csql="INSERT INTO countries(country_id,country_name,region_id) VALUES(?,?,?);";

        try {
            pstmt=conn.prepareStatement(csql);
            pstmt.setString(1, "COL");
            pstmt.setString(2, "Colombia");
            pstmt.setInt(3, 2);
            pstmt.executeUpdate();
            System.out.println("Actualizado");
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void actualizar_regions(){
        var conn=conexion();
        PreparedStatement pstmt=null;
        String csql="INSERT INTO regions(region_id, region_name) VALUES (?,?);";

        try {
            pstmt=conn.prepareStatement(csql);
            pstmt.setInt(1, 5);
            pstmt.setString(2, "Oceania");
            pstmt.executeUpdate();
            System.out.println("Actualizado");
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
