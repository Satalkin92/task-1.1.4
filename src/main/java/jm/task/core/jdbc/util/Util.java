package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static String URL = "jdbc:mysql://localhost:3306/user";
    private static String user = "root";
    private static String password = "root";

    public static Connection getConnect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
