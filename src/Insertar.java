import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertar {
    // Instancias la clase que hemos creado anteriormente
    private ConexionMySQL SQL = new ConexionMySQL();
    // Llamas al método que tiene la clase y te devuelve una conexión
    private Connection conn = SQL.conectarMySQL();
    // Query que usarás para hacer lo que necesites
    public String sSQL =   "insert into bitcoindolar (fechahora,cotizacion) values ('2022-11-06 10:30:50',20166.9);";



    public Insertar() throws SQLException {
    }


}
