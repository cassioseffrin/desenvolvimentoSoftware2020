package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cassioseffrin
 */

public class DatabaseMySQLSingleton {
    private static Connection connection;
    public static Connection getConnection(){
        if (connection == null){
            return conectar();
        }else{
            return connection;
        }
    }
    private static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/farmacia", "cassio","123");   
            return  connection;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(DatabaseMySQLSingleton.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    private void desconectar() {
        try {
            DatabaseMySQLSingleton.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseMySQLSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}