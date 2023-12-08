package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SharedConnection {
    private static final String DATABASE_URL = "jdbc:mysql://localhost/MgtTaxi";
    private static String userName;
    private static String password;

    public SharedConnection(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public static Connection createConnection() throws SQLException {
        Connection con = DriverManager.getConnection(DATABASE_URL, userName, password);
        return con;
    }

}