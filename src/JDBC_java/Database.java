package JDBC_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database {
    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/jdbc_java?useSSL=false";
        String user = "root";
        String password = "30102004zcxbin@";

        return DriverManager.getConnection(url, user, password);
    }
}
