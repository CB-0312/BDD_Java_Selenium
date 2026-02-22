package org.chandAI.utils;

import java.sql.*;

public class DBUtil {
    private static Connection conn;

    public static Connection getConnection(String url, String user, String pass) throws SQLException {
        if (conn == null || conn.isClosed()) {
            conn = DriverManager.getConnection(url, user, pass);
        }
        return conn;
    }

    public static void closeConnection() throws SQLException {
        if (conn != null) conn.close();
    }
}