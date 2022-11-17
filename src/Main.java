import javax.xml.transform.Result;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
       try {
           Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost/cryptodb","root","123456");
           Statement miStatement = miConexion.createStatement();

           //Ejecutar mysql
           ResultSet myResultset = miStatement.executeQuery("SELECT * FROM bitcoindolar");

           // LEER EL RESULTSET
           while (myResultset.next()){
               System.out.println(myResultset.getString("id")+" "+myResultset.getString("fechahora")+" "+myResultset.getString("cotizacion"));
           }
       }catch(Exception e){
           System.out.println("fatal");
       }


    }
}