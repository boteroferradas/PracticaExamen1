package Connector;
import java.sql.*;

public class DBconnector {
    public static Connection conexion() {
        Connection conn = null;
        try {
            String ip = "10.0.9.226";
            String usuario = "postgres";
            String password = "admin";
            String url = "jdbc:postgresql://" + ip + ":5432/postgres";
            conn = DriverManager.getConnection(url, usuario, password);
        } catch (Exception e) {
            System.out.println("Erro na conexión: "+ e.getMessage());
        }
        return conn;
    }
}