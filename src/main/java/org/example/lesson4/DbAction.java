package org.example.lesson4;

import java.sql.*;
import java.util.ArrayList;

public class DbAction {

    public Connection getConnection(String url, String user, String password){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    public ArrayList<String> getData(Statement stmt) throws SQLException {
        ArrayList<String> list = new ArrayList<>();
        ResultSet rs = stmt.executeQuery("SELECT * FROM test");
        while(rs.next()){
            System.out.println(rs.getString("firstname") + " " + rs.getString("lastname") +
                    " " + rs.getString("id"));
        }
        return list;
    }
}
