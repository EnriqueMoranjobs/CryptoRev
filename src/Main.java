import javax.xml.transform.Result;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Timestamp ts = null;
        try {
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost/cryptodb", "root", "123456");
            //Al ser id auto-increment no hace falta añadirlo
            PreparedStatement ps = miConexion.prepareStatement("Insert into cryptodb (fechahora,cotizacion)values(?,?)");

            //Ejecutar mysql
            ps.setTimestamp(1, ts.valueOf("2022-11-12 10:30:45"));
            ps.setFloat(2, (float) 20200.3);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("no conecta");
        }


    }
}